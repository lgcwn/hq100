package com.up72.hq.dto.resp;

import com.up72.hq.model.AdvertisingManagement;

/**
 * Created by ktmt on 2016/6/29.
 */
public class AdvertisingManagementResp extends AdvertisingManagement {

    /*图片数量*/
    private String countImg;

    public String getCountImg() {
        return countImg;
    }

    public void setCountImg(String countImg) {
        this.countImg = countImg;
    }
}
