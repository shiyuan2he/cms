package com.hsy.cms.better.bean.entity;

import java.util.Date;


public class TCrmUser{
	private Long id;
	private String userCode;
	private String userName;
	private String password;
	private String passwordEncryptionType;
	private Long mobile;
	private String email;
	private Byte sex;
	private String remark;
	private String source;
	private Byte isDel;
	private Long creater;
	private Date createTime;
	private Long updater;
	private Date updateTime;
	private Short age;
	private String picture;
	private String realName;
	public void setId(Long id){
		this.id=id;
	}
	public Long getId(){
		return id;
	}
	public void setUserCode(String userCode){
		this.userCode=userCode;
	}
	public String getUserCode(){
		return userCode;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setPasswordEncryptionType(String passwordEncryptionType){
		this.passwordEncryptionType=passwordEncryptionType;
	}
	public String getPasswordEncryptionType(){
		return passwordEncryptionType;
	}
	public void setMobile(Long mobile){
		this.mobile=mobile;
	}
	public Long getMobile(){
		return mobile;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setSex(Byte sex){
		this.sex=sex;
	}
	public Byte getSex(){
		return sex;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}
	public void setSource(String source){
		this.source=source;
	}
	public String getSource(){
		return source;
	}
	public void setIsDel(Byte isDel){
		this.isDel=isDel;
	}
	public Byte getIsDel(){
		return isDel;
	}
	public void setCreater(Long creater){
		this.creater=creater;
	}
	public Long getCreater(){
		return creater;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setUpdater(Long updater){
		this.updater=updater;
	}
	public Long getUpdater(){
		return updater;
	}
	public void setUpdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	public Date getUpdateTime(){
		return updateTime;
	}
	public void setAge(Short age){
		this.age=age;
	}
	public Short getAge(){
		return age;
	}
	public void setPicture(String picture){
		this.picture=picture;
	}
	public String getPicture(){
		return picture;
	}
	public void setRealName(String realName){
		this.realName=realName;
	}
	public String getRealName(){
		return realName;
	}
}

