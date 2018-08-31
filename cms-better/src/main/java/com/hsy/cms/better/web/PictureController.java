package com.hsy.cms.better.web;

import com.hsy.cms.better.bean.entity.TCmsPicture;
import com.hsy.cms.better.bean.param.response.UploadPictureResponse;
import com.hsy.cms.better.mapper.TCmsPictureMapper;
import com.hsy.java.bean.dto.ResponseBodyBean;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.web
 * @date 2018/6/28 11:47
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping(value = "/picture")
public class PictureController {
    private static final Logger logger = LoggerFactory.getLogger(PictureController.class);
    private String pictureServer = "/upload";

//    @Autowired private TCmsPictureMapper tCmsPictureMapper;
    /**
     * @description <p></p>
     * @param
     * @return 
     * @author heshiyuan
     * @date 2018/6/28 11:48
     */
   /* @PostMapping(value = "/upload")
    @ResponseBody
    public ResponseBodyBean<UploadPictureResponse> upload(
            @RequestParam(value="file",required=false) MultipartFile imageFile,
            HttpServletRequest request) throws IOException {
        UploadPictureResponse uploadPictureResponse = new UploadPictureResponse();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new java.util.Date();
        String strDate = sdf.format(date);
        String fileName = strDate + imageFile.getOriginalFilename().substring(
                imageFile.getOriginalFilename().indexOf("."),imageFile.getOriginalFilename().length());

        *//*String realPath = PictureController.class.getResource("")
                .getPath().split("target/classes")[0].substring(1).concat("src/main/resources/assets"+pictureServer);*//*
        String realPath = PictureController.class.getResource("").getPath()
                .substring(1).split("classes")[0].concat("classes/assets"+pictureServer);

        File file = new File(realPath);
        if(!file.exists()){
            logger.info("{}地址不存在，创建文件夹！创建结果：{}",realPath,file.mkdir());
        }
        logger.info("图片服务器地址 : "+realPath);
        String returnUrl = request.getScheme() + "://" +
                request.getServerName() + ":" + request.getServerPort() + request.getContextPath() +"/assets"+ pictureServer  +"/"+fileName;//存储路径
        logger.info("访问地址：{}",returnUrl);
        try {
            FileUtils.copyInputStreamToFile(imageFile.getInputStream(),new File(realPath, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        TCmsPicture picture = new TCmsPicture();
        String pictureId = String.valueOf(new Random().nextInt()*100000);
        picture.setPictureId(pictureId);
        picture.setPictureUrl(returnUrl);
        picture.setSource("information");
        if(tCmsPictureMapper.insert(picture)>0){
            uploadPictureResponse.setPictureId(pictureId);
            uploadPictureResponse.setPictureUrl(returnUrl);
            logger.info("保存图片信息成功");
            return new ResponseBodyBean<>(true,"0000","上传成功",uploadPictureResponse);
        }else{
            logger.error("保存图片信息失败");
            return new ResponseBodyBean<>(false,"9999","上传失败",null);
        }
    }*/
}
