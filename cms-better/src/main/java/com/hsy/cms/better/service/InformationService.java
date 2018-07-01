package com.hsy.cms.better.service;

import com.hsy.cms.better.bean.entity.TCmsCheck;
import com.hsy.cms.better.bean.entity.TCmsInformation;
import com.hsy.cms.better.bean.param.request.AddInformationParam;
import com.hsy.cms.better.bean.param.response.AddInformationResponse;
import com.hsy.cms.better.dao.TCmsCheckMapper;
import com.hsy.cms.better.dao.TCmsInformationMapper;
import com.hsy.java.bean.dto.ServiceResponseBody;
import com.hsy.java.exception.service.BusinessException;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

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
@Service(value = "informationService")
public class InformationService {
    private static final Logger logger = LoggerFactory.getLogger(InformationService.class);
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired private TCmsCheckMapper tCmsCheckMapper;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired private TCmsInformationMapper tCmsInformationMapper;
    /**
     * @description <p>
     *     1.保存审核信息
     *     2.保存information
     * </p>
     * @param param
     * @return
     */
    @Transactional
    public ServiceResponseBody<AddInformationResponse> addInformation(AddInformationParam param){
        ServiceResponseBody<AddInformationResponse> responseBody = new ServiceResponseBody<>();
        TCmsCheck check = new TCmsCheck();
        // 根据redis生成业务编号
        check.setCheckId("checkId:"+ new Random().nextInt(10000));
        check.setCheckName("咨询审核");
        check.setCheckState((byte) 0);
        Calendar calendar = Calendar.getInstance();
        check.setCreateTime(calendar.getTime());
        check.setCheckUserId("1111");
        check.setDel((byte) 0);
        if(tCmsCheckMapper.insert(check) > 0){
            logger.info("【添加资讯】添加审核信息成功。");
        }

        TCmsInformation information = new TCmsInformation();
        try {
            BeanUtils.copyProperties(information,param);
            information.setCreateDate(calendar.getTime());
        } catch (Exception e) {
           throw new BusinessException("9999","复制bean异常");
        }
        if(tCmsInformationMapper.insert(information)>0){
            logger.info("【添加资讯】添加资讯信息成功。");
        }
        return new ServiceResponseBody(true,"0000","成功",true);
    }
}
