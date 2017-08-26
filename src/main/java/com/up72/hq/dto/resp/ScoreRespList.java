package com.up72.hq.dto.resp;

import com.up72.hq.model.ScoreList;

/**
 * Created by ktmt on 2016/6/28.
 */
public class ScoreRespList extends ScoreList {

    /*会员名称*/
    private String memberName;

    /*积分类型*/
    private String scoreType;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }
}
