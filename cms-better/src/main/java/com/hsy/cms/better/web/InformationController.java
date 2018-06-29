package com.hsy.cms.better.web;

import com.hsy.cms.better.bean.param.request.AddInformationParam;
import com.hsy.cms.better.bean.param.response.AddInformationResponse;
import com.hsy.cms.better.service.InformationService;
import com.hsy.java.bean.dto.ResponseBodyBean;
import com.hsy.java.bean.dto.ServiceResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.web
 * @date 2018/6/27 9:30
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Controller
@RequestMapping(value = "/information")
public class InformationController {

    @Autowired private InformationService informationService;

    @PostMapping(value = "/add")
    public ResponseBodyBean<Boolean> add(@RequestBody String json){
        ResponseBodyBean<Boolean> responseBodyBean = new ResponseBodyBean<>();

        /*ServiceResponseBody<AddInformationResponse> responseBody = informationService.addInformation(addInformationParam);
        if (responseBody.isSuccess()){
            responseBodyBean = new ResponseBodyBean<>(true,"0000","操作成功",true);
            return responseBodyBean;
        }*/
        return new ResponseBodyBean<>();
    }
}
