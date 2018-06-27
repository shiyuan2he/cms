package com.hsy.cms.better.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author heshiyuan
 * @description <p>controller层全局日志</p>
 * @path spring-boot/com.springboot.core
 * @date 2017/6/11 下午2:24
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception , WebRequest request){
        logger.error("【全局异常处理】捕获异常");
        ModelAndView modelAndView = new ModelAndView("exception") ;
        modelAndView.addObject("exceptionMsg",exception.getMessage()) ;
        return modelAndView ;
    }

    @ExceptionHandler(value = Error.class)
    public ModelAndView exception(Error error, WebRequest request){
        logger.error("【全局异常处理】捕获错误");
        ModelAndView modelAndView = new ModelAndView("error") ;
        modelAndView.addObject("errorMsg",error.getMessage()) ;
        return modelAndView ;
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息") ;
    }
}
