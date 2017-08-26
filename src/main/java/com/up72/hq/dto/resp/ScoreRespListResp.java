package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.ScoreList;

/**
 * Created by from on 2016/7/5.
 */
public class ScoreRespListResp extends ScoreList {
    private  String memberName;
    private  String addTimeStr;
    private  String ruleName;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(super.getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
