package com.hsy.blog;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple
 * @date 2018/1/15 14:37
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringBootApplication
@EnableScheduling
public class CmsSimpleApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CmsSimpleApplication.class)
                .web(true)
                .run(args)
                ;
    }
}
