package com.hsy.cms.simple.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.hsy.cms.simple.model.NewsCategory;
import com.hsy.cms.simple.PageUtil;
import com.hsy.cms.simple.dao.INewsCategoryDao;
import com.hsy.cms.simple.dao.INewsDao;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hsy.cms.simple.model.News;
import com.hsy.cms.simple.model.ResObject;
import com.hsy.cms.simple.Constant;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Controller
@RequestMapping(value = "/news")
public class NewsController {
	private final static Logger _logger = LoggerFactory.getLogger(NewsController.class) ;
	@Autowired
	private INewsDao iNewsDao;

	@Autowired
	private INewsCategoryDao iNewsCategoryDao;
	
	
	@GetMapping("/newsManage_{pageCurrent}_{pageSize}_{pageCount}")
	public String newsManage(News news,@PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount, Model model) {
		
		//判断
		if(pageSize == 0) pageSize = 10;
		if(pageCurrent == 0) pageCurrent = 1;
		int rows = iNewsDao.count(news);
		if(pageCount == 0) pageCount = rows%pageSize == 0 ? (rows/pageSize) : (rows/pageSize) + 1;
		
		//查询
		news.setStart((pageCurrent - 1)*pageSize);
		news.setEnd(pageSize);
		if(news.getOrderBy()==null){news.setOrderBy(Constant.OrderByAddDateDesc);}
		List<News> newsList = iNewsDao.list(news);
		
		//文章分类
		NewsCategory newsCategory = new NewsCategory();
		newsCategory.setStart(0);
		newsCategory.setEnd(Integer.MAX_VALUE);
		List<NewsCategory> newsCategoryList = iNewsCategoryDao.list(newsCategory);
		
		//输出
		model.addAttribute("newsCategoryList", newsCategoryList);
		model.addAttribute("newsList", newsList);
		String pageHTML = PageUtil.getPageContent("newsManage_{pageCurrent}_{pageSize}_{pageCount}?title="+news.getTitle()+"&category="+news.getCategory()+"&commendState="+news.getCommendState()+"&orderBy="+news.getOrderBy(), pageCurrent, pageSize, pageCount);
		model.addAttribute("pageHTML",pageHTML);
		model.addAttribute("news",news);
		
		return "news/newsManage";
	}
	
	
	/**
	 * 文章新增、修改跳转
	 * @param model
	 * @return
	 */
	@GetMapping("/newsEdit")
	public String newsEditGet(Model model,News news) {
		NewsCategory newsCategory = new NewsCategory();
		newsCategory.setStart(0);
		newsCategory.setEnd(Integer.MAX_VALUE);
		List<NewsCategory> newsCategoryList = iNewsCategoryDao.list(newsCategory);
		model.addAttribute("newsCategoryList",newsCategoryList);
		if(news.getId()!=0){
			News newT = iNewsDao.findById(news);
			model.addAttribute("news",newT);
		}
		return "news/newsEdit";
	}
	
	/**
	 * 文章新增、修改提交
	 * @param model
	 * @param imageFile
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/newsEdit")
	public String newsEditPost(Model model,News news, @RequestParam MultipartFile[] imageFile,HttpSession httpSession) {
		for (MultipartFile file : imageFile) {
			if (file.isEmpty()) {
				_logger.info("文件未上传");
			} else {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
				Random random = new Random();
				Date date = new java.util.Date();
				String strDate = sdf.format(date);
				String fileName = strDate + "_" + random.nextInt(1000) + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."),file.getOriginalFilename().length());
				String realPath = NewsCategoryController.class.getClassLoader()
						.getResource("").getPath()
						.replaceAll("target/classes/","")+"src/main/webapp/userfiles/" ;
				realPath = realPath.substring(1,realPath.length()) ;
				_logger.info("文件存储地址：{}",realPath);
				try {
					FileUtils.copyInputStreamToFile(file.getInputStream(),new File(realPath, fileName));
					news.setImage("/userfiles/"+fileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		if(news.getId()!=0){
			iNewsDao.update(news);
		} else {
			iNewsDao.insert(news);
		}
		return "redirect:newsManage_0_0_0";
	}
	
	@ResponseBody
	@PostMapping("/newsEditState")
	public ResObject<Object> newsEditState(News news) {
		News newsO = iNewsDao.findById(news);
		
		if(news.getState()==0){
			news.setState(newsO.getState());
		}
		if(news.getCommendState()==0){
			news.setCommendState(newsO.getCommendState());
		}
		if(news.getBrowses()==0){
			news.setBrowses(newsO.getBrowses());
		}
		if(news.getLikes()==0){
			news.setLikes(newsO.getLikes());
		}
		if(news.getComments()==0){
			news.setComments(newsO.getComments());
		}
		if(news.getScore()==0){
			news.setScore(newsO.getScore());
		}
		iNewsDao.updateState(news);
		ResObject<Object> object = new ResObject<Object>(Constant.Code01, Constant.Msg01, null, null);
		return object;
	}
	
}
