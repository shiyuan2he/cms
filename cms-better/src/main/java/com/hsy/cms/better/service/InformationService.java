package com.hsy.cms.better.service;

import com.hsy.cms.better.bean.param.request.AddInformationParam;
import com.hsy.cms.better.bean.param.response.AddInformationResponse;
import com.hsy.java.bean.dto.ServiceResponseBody;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better
 * @date 2018/6/27 21:48
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
//@Service(value = "informationService")
public class InformationService {

    /**
     * @description <p>
     *     1.保存图片信息
     *     2.保存审核信息
     *     3.保存information
     * </p>
     * @param param
     * @return
     */
    //@Transactional
    public ServiceResponseBody<AddInformationResponse> addInformation(AddInformationParam param){
        ServiceResponseBody<AddInformationResponse> responseBody = new ServiceResponseBody<>();

        // 图片上传


        return null;
    }
}
