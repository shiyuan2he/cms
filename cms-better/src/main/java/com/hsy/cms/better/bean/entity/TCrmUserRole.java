package com.hsy.cms.better.bean.entity;


public class TCrmUserRole{
	private Long id;
	private Long userId;
	private Long roleId;
	public void setId(Long id){
		this.id=id;
	}
	public Long getId(){
		return id;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}
	public Long getUserId(){
		return userId;
	}
	public void setRoleId(Long roleId){
		this.roleId=roleId;
	}
	public Long getRoleId(){
		return roleId;
	}
}

