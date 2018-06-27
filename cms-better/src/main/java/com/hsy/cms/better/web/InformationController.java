package com.hsy.cms.better.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.web
 * @date 2018/6/27 9:30
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping(value = "/information")
public class InformationController {


    @GetMapping(value = "/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/information/list");
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/information/add");
        return modelAndView;
    }
}
