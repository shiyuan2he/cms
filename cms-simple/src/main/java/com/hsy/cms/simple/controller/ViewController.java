package com.hsy.cms.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple.controller
 * @date 2018/1/15 17:37
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping(value = "/view")
public class ViewController {
    /**
     * 首页登录
     */
    @GetMapping("/")
    public String index() {
        return "dashboard";
    }
    /**
     * 登录跳转
     */
    @GetMapping("/user/login")
    public String loginGet() {
        return "user/login";
    }
    /**
     * 登录跳转
     */
    @GetMapping("/user/reg")
    public String regGet() {
        return "user/register";
    }
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
