package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Reply;
import com.up72.hq.model.Review;

import java.util.List;

/**
 * Created by ktmt on 2016/6/27.
 */
public class ReviewResp extends Review {

    /*会员名称*/
        private String memberName;

    /*回复数量*/
        private String countReplay;

    /*菜单名称*/
        private String menuName;

    /*品论时间*/
    private String addTimeStr;

    /*回复信息*/
    private List<ReplyResp> replys;
    /*用户信息*/
    private MemberResp memberResp;
    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getCountReplay() {
        return countReplay;
    }

    public void setCountReplay(String countReplay) {
        this.countReplay = countReplay;
    }

    public List<ReplyResp> getReplys() {
        return replys;
    }

    public void setReplys(List<ReplyResp> replys) {
        this.replys = replys;
    }

    public MemberResp getMemberResp() {
        return memberResp;
    }

    public void setMemberResp(MemberResp memberResp) {
        this.memberResp = memberResp;
    }
}
