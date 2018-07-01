package com.hsy.cms.better.web;

import com.hsy.cms.better.bean.param.request.AddInformationParam;
import com.hsy.cms.better.bean.param.response.AddInformationResponse;
import com.hsy.cms.better.service.InformationService;
import com.hsy.java.bean.dto.ResponseBodyBean;
import com.hsy.java.bean.dto.ServiceResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
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
@Api(value = "资讯管理", description = "资讯管理控制器")
@Controller
@RequestMapping(value = "/information")
public class InformationController {

    @Autowired private InformationService informationService;

    @ApiOperation(value = "添加资讯", notes = "提供添加资讯的服务")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "json", value = "json字符串", dataType = "String")
    })
    @PostMapping(value = "/add")
    @ResponseBody
    public ResponseBodyBean<Boolean> add(
            AddInformationParam param,
            HttpServletRequest request){
        ResponseBodyBean<Boolean> responseBodyBean = new ResponseBodyBean<>();

        ServiceResponseBody<AddInformationResponse> responseBody = informationService.addInformation(param);
        if (responseBody.isSuccess()){
            responseBodyBean = new ResponseBodyBean<>(true,"0000","操作成功",true);
            return responseBodyBean;
        }
        Map<String, Object> link = new HashMap<>();
        link.put("currentUrl","/information/add");
        link.put("nextUrl","/information/list");
        responseBodyBean.setLink(link);
        return responseBodyBean;
    }
}
