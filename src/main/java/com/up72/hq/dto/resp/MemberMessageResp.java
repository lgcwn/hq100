package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.MemberMessage;

/**
 * Created by ss330 on 2016/7/21.
 */
public class MemberMessageResp extends MemberMessage {
    private MemberResp memberResp;
    private String addTimeStr;
    private int countAll;
    private int countWd;

    public MemberResp getMemberResp() {
        return memberResp;
    }

    public void setMemberResp(MemberResp memberResp) {
        this.memberResp = memberResp;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public int getCountAll() {
        return countAll;
    }

    public void setCountAll(int countAll) {
        this.countAll = countAll;
    }

    public int getCountWd() {
        return countWd;
    }

    public void setCountWd(int countWd) {
        this.countWd = countWd;
    }
}
