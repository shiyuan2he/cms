package com.hsy.cms.simple.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple.init
 * @date 2018/1/25 9:44
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class DataInitizer {
    private final static Logger _logger = LoggerFactory.getLogger(DataInitizer.class) ;

    public void init(){
        _logger.info("开始初始化");
    }

    public void destroy(){
        _logger.info("开始销毁");
    }
}
