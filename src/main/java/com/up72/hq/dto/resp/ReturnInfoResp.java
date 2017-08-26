package com.up72.hq.dto.resp;

import com.up72.hq.model.ReturnInfo;

/**
 * Created by alans on 2016/8/4.
 */
public class ReturnInfoResp extends ReturnInfo {
    private int buyNum;

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }
}
