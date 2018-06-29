package com.hsy.cms.better.dao;

import com.hsy.cms.better.bean.entity.TCmsCheck;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.dao
 * @date 2018/6/27 15:18
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Mapper
public interface TCmsCheckMapper {

    @Insert({
        "<script>" +
            "insert into t_cms_check" +
                "(check_id, check_state, check_name,check_remark, create_time, create_user_id, check_time, check_user_id, del) " +
            "values (#{checkId}, #{checkState}, #{checkName}, #{checkRemark}, #{createTime}, #{createUserId}, #{checkTime}, #{checkUserId}, #{del})</script>"
    })
    int insert(TCmsCheck tCmsCheck);
}
