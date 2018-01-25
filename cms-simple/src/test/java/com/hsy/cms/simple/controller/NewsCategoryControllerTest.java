package com.hsy.cms.simple.controller;
import com.hsy.cms.simple.ControllerBaseTest;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
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