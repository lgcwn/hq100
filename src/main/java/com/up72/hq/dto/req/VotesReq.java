package com.up72.hq.dto.req;

import java.io.Serializable;

/**
 * Created by LiuGuicheng on 2016/7/10.
 */
public class VotesReq implements Serializable {
    private  boolean isFreeCnt=true;//一天当中是否还有免费投票次数，默认有
    private Integer leaveCnt=3;//一天当中剩余免费投票次数

    public boolean isFreeCnt() {
        return isFreeCnt;
    }

    public void setIsFreeCnt(boolean isFreeCnt) {
        this.isFreeCnt = isFreeCnt;
    }

    public Integer getLeaveCnt() {
        return leaveCnt;
    }

    public void setFreeCnt(boolean freeCnt) {
        isFreeCnt = freeCnt;
    }

    public void setLeaveCnt(Integer leaveCnt) {
        this.leaveCnt = leaveCnt;
    }
}
