package com.hsy.cms.auth;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.auth
 * @date 2018/1/2 17:03
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringBootApplication
public class CmsApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CmsApplication.class)
                .web(true)
                .run(args)
                ;
    }
}
