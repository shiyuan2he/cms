package com.hsy.cms.simple.config;

import com.hsy.cms.simple.init.DataInitizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple.config
 * @date 2018/1/25 9:59
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Configuration
public class BeanConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public DataInitizer dataInitizer(){
        return new DataInitizer() ;
    }
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver() ;
        commonsMultipartResolver.setMaxUploadSize(100000);
        commonsMultipartResolver.setMaxUploadSizePerFile(1000);
        return commonsMultipartResolver ;
    }
}
