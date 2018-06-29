package com.hsy.cms.better.bean.param.response;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path cms/com.hsy.cms.better.bean.param.response
 * @date 2018/6/29 13:33
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2018 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
public class UploadPictureResponse {

    private String pictureId;
    private String pictureUrl;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
