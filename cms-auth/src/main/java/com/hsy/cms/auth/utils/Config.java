package com.hsy.cms.auth.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.auth.Utils
 * @date 2017/11/16 16:29
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class Config {
    private static final Logger _logger = LoggerFactory.getLogger(Config.class);
    public static String SSO_SERVER_TICKET = null ;
    static{
        Properties prop = new Properties();
        FileInputStream in = null;
        String path = "/properties/config.properties" ;
        try {
            _logger.info("正在读取config配置文件");
            path = Config.class.getResource(path).getPath() ;
            in = new FileInputStream(path);
            prop.load(in);
            SSO_SERVER_TICKET = prop.getProperty("sso.server.ticket") ;
            in.close();
        } catch (FileNotFoundException e) {
            _logger.error("去读{}配置文件发生异常，异常信息：{}",path,e.getMessage());
        } catch (IOException e1) {
            _logger.error("去读{}配置文件发生异常，异常信息：{}",path,e1.getMessage());
        }
    }
}
