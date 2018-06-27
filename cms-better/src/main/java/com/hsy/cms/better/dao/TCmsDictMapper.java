package com.hsy.cms.better.dao;

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
public interface TCmsDictMapper {

    @Insert({
        "insert into t_cms_dict(dict_id, dict_name, parent_id, " +
            "create_time, create_user_id, update_time, update_user_id, del)" +
            "values(${dictId}, ${dictName}, ${parentId}, ${createTime}, " +
            "${createUserId}, ${updateTime}, ${updateUserId}, ${del})"
    })
    int insert();
    
}
