package com.hsy.cms.simple.controller;
import com.hsy.cms.better.simple.ControllerBaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.simple.controller
 * @date 2018/1/25 17:13
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsCategoryControllerTest extends ControllerBaseTest {

    @Test
    public void newsCategoryManage() throws Exception {
        super.getRequest("/news/category/newsCategoryManage_0_0_0","");
    }

    @Test
    public void newsCategoryEditGet() throws Exception {
    }

    @Test
    public void newsCategoryEditPost() throws Exception {
    }

    @Test
    public void newsCategoryEditState() throws Exception {
    }

}