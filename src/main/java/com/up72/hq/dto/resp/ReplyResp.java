package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Member;
import com.up72.hq.model.Reply;

/**
 * Created by Alan on 2016/7/5.
 */
public class ReplyResp extends Reply {
    private String nickName;
    private String addTimeStr;
    private MemberResp member;
    private ReplyResp replyResp;
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public MemberResp getMember() {
        return member;
    }

    public void setMember(MemberResp member) {
        this.member = member;
    }

    public ReplyResp getReplyResp() {
        return replyResp;
    }

    public void setReplyResp(ReplyResp replyResp) {
        this.replyResp = replyResp;
    }
}
