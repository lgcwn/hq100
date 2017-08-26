package com.up72.hq.dto.resp;

import com.up72.hq.conf.SystemConfig;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Crowd;

/**
 * Created by alan on 2016/7/1.
 */
public class CrowdResp extends Crowd {
    private Double percentage;
    private int wsNum;//无私奉献数量
    private String peopleNum;
    private String realMoney;
    private String endTimeStr;
    private String startTimeStr;
    private String catName;

    public int getWsNum() {
        return wsNum;
    }

    public void setWsNum(int wsNum) {
        this.wsNum = wsNum;
    }

    public String getEndTimeStr() {
        return  Cnst.getFormatTime(getEndTime());
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(String realMoney) {
        this.realMoney = realMoney;
    }

    public String getStartTimeStr() {
        return Cnst.getFormatTime(getStartTime());
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    private java.lang.String fileImg;

    public String getFileImg() {
        return SystemConfig.instants().getValue("file")+this.getImg();
    }
}
