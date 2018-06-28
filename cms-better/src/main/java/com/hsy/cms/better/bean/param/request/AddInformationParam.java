package com.hsy.cms.better.bean.param.request;

import java.util.Date;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.bean.entity
 * @date 2018/6/28 9:29
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class AddInformationParam {
    private Long id;
    private String title;
    private String bigTitle;
    private String description;
    private Integer category;
    private String content;
    private String pictureId;
    private String checkId;
    private Byte allowComment;
    private Date commentStartTime;
    private Date commentEndTime;
    private Integer sort;
    private String keywords;
    private String classifiedColumn;
    private String author;
    private String source;
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setBigTitle(String bigTitle){
        this.bigTitle=bigTitle;
    }
    public String getBigTitle(){
        return bigTitle;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setCategory(Integer category){
        this.category=category;
    }
    public Integer getCategory(){
        return category;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public void setPictureId(String pictureId){
        this.pictureId=pictureId;
    }
    public String getPictureId(){
        return pictureId;
    }
    public void setCheckId(String checkId){
        this.checkId=checkId;
    }
    public String getCheckId(){
        return checkId;
    }
    public void setAllowComment(Byte allowComment){
        this.allowComment=allowComment;
    }
    public Byte getAllowComment(){
        return allowComment;
    }
    public void setCommentStartTime(Date commentStartTime){
        this.commentStartTime=commentStartTime;
    }
    public Date getCommentStartTime(){
        return commentStartTime;
    }
    public void setCommentEndTime(Date commentEndTime){
        this.commentEndTime=commentEndTime;
    }
    public Date getCommentEndTime(){
        return commentEndTime;
    }
    public void setSort(Integer sort){
        this.sort=sort;
    }
    public Integer getSort(){
        return sort;
    }
    public void setKeywords(String keywords){
        this.keywords=keywords;
    }
    public String getKeywords(){
        return keywords;
    }
    public void setClassifiedColumn(String classifiedColumn){
        this.classifiedColumn=classifiedColumn;
    }
    public String getClassifiedColumn(){
        return classifiedColumn;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setSource(String source){
        this.source=source;
    }
    public String getSource(){
        return source;
    }
}
