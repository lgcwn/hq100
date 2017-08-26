package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiSiteCtrlData;

import java.util.LinkedHashMap;
import java.util.Map;

public class BusiSiteCtrlDataResp extends BusiSiteCtrlData {
    private Map<String,String> image = new LinkedHashMap<String,String>(); // 图片
    private Map<String,String> url = new LinkedHashMap<String,String>(); // url
    private Map<String,String> text = new LinkedHashMap<String,String>();//文本

    public Map<String, String> getImage() {
        return image;
    }

    public void setImage(Map<String, String> image) {
        this.image = image;
    }

    public Map<String, String> getUrl() {
        return url;
    }

    public void setUrl(Map<String, String> url) {
        this.url = url;
    }

    public Map<String, String> getText() {
        return text;
    }

    public void setText(Map<String, String> text) {
        this.text = text;
    }
}
