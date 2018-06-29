package com.hsy.cms.better.dao;

import com.hsy.cms.better.bean.entity.TCmsPicture;
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
public interface TCmsPictureMapper {

    @Insert({
        "<script>" +
                "insert into t_cms_picture(picture_id, picture_url, source, del)" +
            "values (#{pictureId}, #{pictureUrl}, #{source}, 0)</script>"
    })
    int insert(TCmsPicture picture);
    
}
