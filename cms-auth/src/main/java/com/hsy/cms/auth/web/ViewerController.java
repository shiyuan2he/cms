package com.hsy.cms.auth.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author heshiyuan
 * @date 2017/10/31 11:11
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping("/view")
public class ViewerController {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/toLoginView")
    public ModelAndView toLoginView() {
        _logger.info("toLoginView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sso/login");
        return modelAndView;
    }

    @RequestMapping("/toRegView")
    public ModelAndView toRegView() {
        _logger.info("toRegView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sso/reg");
        return modelAndView;
    }

    @RequestMapping("/toMainView")
    public ModelAndView toMainView() {
        _logger.info("进入到toMainView");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }

    @RequestMapping("/toUserList")
    public ModelAndView toUserList() {
        _logger.info("toUserList");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/user");
        return modelAndView;
    }
}
