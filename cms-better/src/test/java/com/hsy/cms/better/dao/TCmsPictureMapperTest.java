package com.hsy.cms.better.dao;

import com.hsy.cms.better.bean.entity.TCmsPicture;
import com.hsy.cms.better.mapper.TCmsPictureMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.dao
 * @date 2018/6/29 14:46
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@SpringBootTest
@RunWith(SpringRunner.class)
public class TCmsPictureMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(TCmsPictureMapperTest.class);
    @Autowired private TCmsPictureMapper tCmsPictureMapper;
    @Test
    public void insert() throws Exception {
        TCmsPicture picture = new TCmsPicture();
        String pictureId = String.valueOf(new Random().nextInt()*100000);
        picture.setPictureId(pictureId);
        picture.setPictureUrl("localhost:8080/assets/upload/20180629144802.png");
        picture.setSource("information");
        logger.info("---{}",tCmsPictureMapper.insert(picture));
    }

}