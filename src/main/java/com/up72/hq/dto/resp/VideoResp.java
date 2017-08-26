package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Video;

/**
 * Created by Alan on 2016/7/5.
 */
public class VideoResp extends Video {
    private String publishTimeStr;
    private String typeName;
    private String catSelectName;

    public String getPublishTimeStr() {
        return Cnst.getFormatTime(getPublishTime());
    }

    public void setPublishTimeStr(String publishTimeStr) {
        this.publishTimeStr = publishTimeStr;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCatSelectName() {
        return catSelectName;
    }

    public void setCatSelectName(String catSelectName) {
        this.catSelectName = catSelectName;
    }
}
