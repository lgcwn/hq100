package com.up72.hq.dto.resp;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Notice;

public class NoticeResp extends Notice{
    /** 管理员*/
    private  String creatorName;
    /**创建时间*/
    private String addTimeStr;
    /**最后修改时间*/
    private String lastupdateStr;
    /** 活动开始时间*/
    private String beginTimeStr;

    public String getBeginTimeStr() {
        return beginTimeStr;
    }

    public void setBeginTimeStr(String beginTimeStr) {
        this.beginTimeStr = beginTimeStr;
    }

    public String getLastupdateStr() {
        return Cnst.getFormatTime(this.getLastupdate());
    }

    public void setLastupdateStr(String lastupdateStr) {
        this.lastupdateStr = Cnst.getFormatTime(this.getLastupdate());
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(this.getAddtime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }
}
