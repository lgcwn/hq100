package com.up72.hq.dto.resp;


import com.up72.hq.model.Member;
import com.up72.hq.model.ThirdPartyUsers;

/**
 * Created by liuguicheng on 16/6/28.
 */
public class MemberLoginResp implements java.io.Serializable {

    private boolean loginStatus;

    private String loginType;

    private String disableRemarks;

    private Member member;

    private Integer disableRemarksStatus;

    private String returnUrl;

    private ThirdPartyUsers thirdPartyUsers;

    private String thirdPartyUsersNickName;

    private String thirdPartyUserImg;

    private  String ucsyn;//discuz 论坛同步返回信息

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Integer getDisableRemarksStatus() {
        return disableRemarksStatus;
    }

    public void setDisableRemarksStatus(Integer disableRemarksStatus) {
        this.disableRemarksStatus = disableRemarksStatus;
    }

    public String getDisableRemarks() {
        return disableRemarks;
    }

    public void setDisableRemarks(String disableRemarks) {
        this.disableRemarks = disableRemarks;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ThirdPartyUsers getThirdPartyUsers() {
        return thirdPartyUsers;
    }

    public void setThirdPartyUsers(ThirdPartyUsers thirdPartyUsers) {
        this.thirdPartyUsers = thirdPartyUsers;
    }

    public String getThirdPartyUsersNickName() {
        return thirdPartyUsersNickName;
    }

    public void setThirdPartyUsersNickName(String thirdPartyUsersNickName) {
        this.thirdPartyUsersNickName = thirdPartyUsersNickName;
    }

    public String getThirdPartyUserImg() {
        return thirdPartyUserImg;
    }

    public void setThirdPartyUserImg(String thirdPartyUserImg) {
        this.thirdPartyUserImg = thirdPartyUserImg;
    }

    public String getUcsyn() {
        return ucsyn;
    }

    public void setUcsyn(String ucsyn) {
        this.ucsyn = ucsyn;
    }
}
