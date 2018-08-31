package com.hsy.cms.better.dao;

import com.hsy.cms.better.CmsApplication;
import com.hsy.cms.better.bean.entity.TCrmUser;
import com.hsy.cms.better.mapper.TCrmUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.dao
 * @date 2018/8/29 22:14
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=CmsApplication.class)
@Slf4j
public class ITCrmUserMapperTest {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired private TCrmUserMapper tCrmUserMapper;
    @Test
    public void insert() {
        TCrmUser user = new TCrmUser();
        user.setAge((short) 20);
        user.setCreater((long)0);
        user.setCreateTime(Calendar.getInstance().getTime());
        user.setEmail("shiyuan4work@sina.com");
        user.setIsDel(new byte[0]);
        user.setMobile(15910868535l);
        user.setPassword("123123");
        user.setPasswordEncryptionType("none");

        log.info("{}",tCrmUserMapper.insert(user));
    }
}