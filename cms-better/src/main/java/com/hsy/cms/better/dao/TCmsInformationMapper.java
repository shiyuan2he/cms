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
public interface TCmsInformationMapper {
    @Insert({
        "insert into t_cms_picture(title, big_title, description, category, " +
                "content, picture_id, check_id, create_date, update_date, " +
                "create_user_id, update_user_id, del, browses_count, likes_count, comments_count)" +
                    "values(#{title}, #{bigTitle}, #{description}, #{category}, " +
                "#{content}, #{pictureId}, #{checkId}, #{createDate}, #{updateDate}, " +
                "#{createUserId}, #{updateUserId}, #{del}, #{browsesCount}, #{likesCount}," +
                "#{commentsCount})"
    })
    int insert();

}
