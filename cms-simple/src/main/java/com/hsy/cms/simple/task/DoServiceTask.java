package com.hsy.cms.simple.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple.task
 * @date 2018/1/25 10:22
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Component
public class DoServiceTask {
    private final static Logger _logger = LoggerFactory.getLogger(DoServiceTask.class) ;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss") ;
    // 每5秒报时一次
    //@Scheduled(fixedRate = 5000)
    public void reportTime(){
        _logger.info("{}",sdf.format(Calendar.getInstance().getTime()));
    }
    // 秒 分 时 ？日 月   每10秒报时一次
    //@Scheduled(cron = "0/10 * * ? * *")
    public void reportTime2(){
        _logger.info("{}",sdf.format(Calendar.getInstance().getTime()));
    }
}
