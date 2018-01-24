package com.hsy.cms.simple.controller;

import javax.servlet.http.HttpSession;

import com.hsy.cms.simple.dao.IAdminDao;
import com.hsy.cms.simple.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AdminController {

	@Autowired
	private IAdminDao iAdminDao;



	/**
	 * 登录
	 * 
	 * @param admin
	 * @param model
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/admin/login")
	public String loginPost(Admin admin, Model model, HttpSession httpSession) {
		Admin adminRes = iAdminDao.findByNameAndPassword(admin);
		if (adminRes != null) {
			httpSession.setAttribute("admin", adminRes);
			return "redirect:dashboard";
		} else {
			model.addAttribute("error", "用户名或密码错误，请重新登录！");
			return "login";
		}
	}

	/**
	 * 注册
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/admin/register")
	public String register(Model model) {
		return "register";
	}
}
