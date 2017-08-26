package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Crowd;
import com.up72.hq.model.CrowdOrder;
import com.up72.hq.model.OrderCrowd;
import com.up72.hq.model.ReturnInfo;

/**
 * Created by Alan on 2016/7/14.
 */
public class OrderCrowdResp extends OrderCrowd {

    private ReturnInfo returnInfo;
    private Crowd crowd;
    private CrowdOrder crowdOrder;
    private String orderSn;
    private String userName;
    private String headImg;
    private String payTimeStr;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPayTimeStr() {
        return Cnst.getFormatTime(getCreateDate());
    }

    public void setPayTimeStr(String payTimeStr) {
        this.payTimeStr = payTimeStr;
    }

    public ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(ReturnInfo returnInfo) {
        this.returnInfo = returnInfo;
    }

    public Crowd getCrowd() {
        return crowd;
    }

    public void setCrowd(Crowd crowd) {
        this.crowd = crowd;
    }

    public CrowdOrder getCrowdOrder() {
        return crowdOrder;
    }

    public void setCrowdOrder(CrowdOrder crowdOrder) {
        this.crowdOrder = crowdOrder;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}
