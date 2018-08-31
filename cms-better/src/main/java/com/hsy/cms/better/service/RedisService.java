package com.hsy.cms.better.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.service
 * @date 2018/7/2 14:26
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Service(value = "redisService")
public class RedisService {
    private static final Logger logger = LoggerFactory.getLogger(RedisService.class);

    /**
     * @description <p></p>
     * @param businessType 业务开头
     * @param length 递增的流水号长度
     * @return 业务开头 + 当前年月日 + 指定长度并且递增的流水号
     * @author heshiyuan
     * @date 2018/7/2 14:42
     */
    public String getSerialNoByType(String businessType, int length){
        logger.info("[业务编号生成]-当前业务类型:{},递增序列号长度:{},开始获取", businessType, length);
        /*if(StringUtils.isEmpty(businessType)){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //当前系统日期
        String currentDate = sdf.format(Calendar.getInstance().getTime());
        //组织生成后的编号
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(businessType);
        stringBuffer.append(currentDate);
        //组织Key
        StringBuffer keyStr = new StringBuffer();
        keyStr.append("serialNo:");
        keyStr.append(currentDate);
        keyStr.append(":");
        keyStr.append(businessType);
        Long ret = redisRepository.incr(keyStr.toString(), 1L);
        if(ret != null){
            stringBuffer.append(String.format("%0"+length+"d", ret));
        }else{
            return null;
        }
        logger.info("[业务编号生成]-获取业务编号为:{}", stringBuffer.toString());
        return stringBuffer.toString();*/
        return null;
    }
}
