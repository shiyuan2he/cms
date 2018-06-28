package com.hsy.cms.better.dao;

import com.hsy.cms.better.bean.entity.TCmsCheck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.dao
 * @date 2018/6/27 15:57
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TCmsCheckMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(TCmsCheckMapperTest.class);
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired private TCmsCheckMapper tCmsCheckMapper;
    @Test
    public void insert() throws Exception {
        TCmsCheck tCmsCheck = new TCmsCheck();
        tCmsCheck.setCheckId("1342342342341234");
        tCmsCheck.setCheckState((byte) 0);
        tCmsCheck.setCheckRemark("fasdfsf sdf");
        tCmsCheck.setDel((byte) 0);
        Calendar calendar = Calendar.getInstance();
        tCmsCheck.setCheckUserId("sfsdf");
        tCmsCheck.setCheckTime(calendar.getTime());
        tCmsCheck.setCreateTime(calendar.getTime());
        tCmsCheck.setCreateUserId("sdfsfsdf");
        tCmsCheck.setCheckName("dfsfsfsdf");
        logger.info("------{}------",tCmsCheckMapper.insert(tCmsCheck));
    }

}