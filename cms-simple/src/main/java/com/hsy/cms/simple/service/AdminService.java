package com.hsy.cms.simple.service;

import com.hsy.cms.simple.model.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminService {

	@Select("SELECT * FROM `admin` where userName = #{userName} and password = #{password} and state = 1;")
    Admin findByNameAndPassword(Admin admin);

	@Insert("INSERT INTO `admin` (`id`, `userName`, `password`, `realName`, `age`, `phoneNumber`, `headPicture`, `addDate`, `updateDate`, `state`) VALUES (null, #{userName}, #{password}, #{realName}, #{age}, #{phoneNumber}, #{headPicture}, now(), now(), 1);")
	int insert(Admin admin);

}
