package com.hsy.cms.better.bean.entity;

import java.util.Date;

/**
 * Database Table Remarks:
 *   统一用户表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_crm_user
 */
public class TCrmUser {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   用户编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.user_code
     *
     * @mbg.generated
     */
    private String userCode;

    /**
     * Database Column Remarks:
     *   用户名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   用户密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   密码加密类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.password_encryption_type
     *
     * @mbg.generated
     */
    private String passwordEncryptionType;

    /**
     * Database Column Remarks:
     *   用户手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.mobile
     *
     * @mbg.generated
     */
    private Long mobile;

    /**
     * Database Column Remarks:
     *   邮箱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   性别：0 保密，1男2女
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.sex
     *
     * @mbg.generated
     */
    private byte[] sex;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   用户来源
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     * Database Column Remarks:
     *   是否逻辑删除 0：启用 1：禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.is_del
     *
     * @mbg.generated
     */
    private byte[] isDel;

    /**
     * Database Column Remarks:
     *   创建者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.creater
     *
     * @mbg.generated
     */
    private Long creater;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.updater
     *
     * @mbg.generated
     */
    private Long updater;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.age
     *
     * @mbg.generated
     */
    private Short age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.picture
     *
     * @mbg.generated
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_crm_user.real_name
     *
     * @mbg.generated
     */
    private String realName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.id
     *
     * @return the value of t_crm_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.id
     *
     * @param id the value for t_crm_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.user_code
     *
     * @return the value of t_crm_user.user_code
     *
     * @mbg.generated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.user_code
     *
     * @param userCode the value for t_crm_user.user_code
     *
     * @mbg.generated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.user_name
     *
     * @return the value of t_crm_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.user_name
     *
     * @param userName the value for t_crm_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.password
     *
     * @return the value of t_crm_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.password
     *
     * @param password the value for t_crm_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.password_encryption_type
     *
     * @return the value of t_crm_user.password_encryption_type
     *
     * @mbg.generated
     */
    public String getPasswordEncryptionType() {
        return passwordEncryptionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.password_encryption_type
     *
     * @param passwordEncryptionType the value for t_crm_user.password_encryption_type
     *
     * @mbg.generated
     */
    public void setPasswordEncryptionType(String passwordEncryptionType) {
        this.passwordEncryptionType = passwordEncryptionType == null ? null : passwordEncryptionType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.mobile
     *
     * @return the value of t_crm_user.mobile
     *
     * @mbg.generated
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.mobile
     *
     * @param mobile the value for t_crm_user.mobile
     *
     * @mbg.generated
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.email
     *
     * @return the value of t_crm_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.email
     *
     * @param email the value for t_crm_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.sex
     *
     * @return the value of t_crm_user.sex
     *
     * @mbg.generated
     */
    public byte[] getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.sex
     *
     * @param sex the value for t_crm_user.sex
     *
     * @mbg.generated
     */
    public void setSex(byte[] sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.remark
     *
     * @return the value of t_crm_user.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.remark
     *
     * @param remark the value for t_crm_user.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.source
     *
     * @return the value of t_crm_user.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.source
     *
     * @param source the value for t_crm_user.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.is_del
     *
     * @return the value of t_crm_user.is_del
     *
     * @mbg.generated
     */
    public byte[] getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.is_del
     *
     * @param isDel the value for t_crm_user.is_del
     *
     * @mbg.generated
     */
    public void setIsDel(byte[] isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.creater
     *
     * @return the value of t_crm_user.creater
     *
     * @mbg.generated
     */
    public Long getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.creater
     *
     * @param creater the value for t_crm_user.creater
     *
     * @mbg.generated
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.create_time
     *
     * @return the value of t_crm_user.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.create_time
     *
     * @param createTime the value for t_crm_user.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.updater
     *
     * @return the value of t_crm_user.updater
     *
     * @mbg.generated
     */
    public Long getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.updater
     *
     * @param updater the value for t_crm_user.updater
     *
     * @mbg.generated
     */
    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.update_time
     *
     * @return the value of t_crm_user.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.update_time
     *
     * @param updateTime the value for t_crm_user.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.age
     *
     * @return the value of t_crm_user.age
     *
     * @mbg.generated
     */
    public Short getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.age
     *
     * @param age the value for t_crm_user.age
     *
     * @mbg.generated
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.picture
     *
     * @return the value of t_crm_user.picture
     *
     * @mbg.generated
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.picture
     *
     * @param picture the value for t_crm_user.picture
     *
     * @mbg.generated
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_crm_user.real_name
     *
     * @return the value of t_crm_user.real_name
     *
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_crm_user.real_name
     *
     * @param realName the value for t_crm_user.real_name
     *
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }
}