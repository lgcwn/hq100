package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.StarRanking;

/**
 * 明星排行榜
 * Created by from on 2016/7/4.
 */
public class StarRankingResp  extends StarRanking {
    private  String auditTimeStr;
    private  String addTimeStr;
    private  String catName;
    private  String memberName;
    private  Long sumVotes;//总票数
    private  Long renqi;//人气
    private Integer ranking;//票数票名
    private MemberResp memberResp;//提名人

    public String getAuditTimeStr() {
        return Cnst.getFormatTime(super.getAuditTime());
    }

    public void setAuditTimeStr(String auditTimeStr) {
        this.auditTimeStr = auditTimeStr;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(super.getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Long getSumVotes() {
        return sumVotes;
    }

    public void setSumVotes(Long sumVotes) {
        this.sumVotes = sumVotes;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public MemberResp getMemberResp() {
        return memberResp;
    }

    public void setMemberResp(MemberResp memberResp) {
        this.memberResp = memberResp;
    }

    public Long getRenqi() {
        return renqi;
    }

    public void setRenqi(Long renqi) {
        this.renqi = renqi;
    }
}
