package com.hsy.cms.better.dao;

import com.hsy.cms.better.bean.entity.TCrmUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.dao
 * @date 2018/8/29 21:59
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@Mapper
public interface ITCrmUserMapper {
    @Insert(
            "insert into t_crm_user(user_code, user_name, password, password_encryption_type," +
            "mobile, email, sex, remark, source, is_del, creater, create_time, age, picture, real_name" +
            ") values (#{userCode}, #{userName}, #{password}, #{passwordEncryptionType}" +
                    "mobile,email,sex,remark,source,isDel,creater,now(),age,picture,realName)")
    int insert(TCrmUser user);
    /*select * from t_crm_user_role userRole
    left join t_crm_user user2 on userRole.user_id = user2.id
    left join t_crm_role tcr on user2.id = tcr.creater
    left join t_crm_role_permission t on tcr.id = t.role_id
    left join t_crm_permission t2 on t.permission_id = t2.id
    where user2.id = '0';

    insert into t_crm_role(role_name, role_description, creater, create_time, updater, update_time)
    values ('admin', '管理员', '0', now(), '0', now());

    insert into t_crm_user(user_code, user_name, password, password_encryption_type,
                           mobile, email, sex, remark, source, is_del, creater, create_time, age, picture, real_name
                           ) values ()
*/
}
