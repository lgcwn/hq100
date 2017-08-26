package com.up72.hq.dto.resp;

import com.up72.hq.model.ChooseList;

/**
 * Created by LiuGuicheng on 2016/6/30.
 */
public class ChooseListResp extends ChooseList {

    private Integer ranking;//票数票名
    private boolean isVotes;//判断当前用户是否投票
    private ChooseResp chooseResp;

    public ChooseResp getChooseResp() {
        return chooseResp;
    }

    public void setChooseResp(ChooseResp chooseResp) {
        this.chooseResp = chooseResp;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public boolean getIsVotes() {
        return isVotes;
    }

    public void setIsVotes(boolean isVotes) {
        this.isVotes = isVotes;
    }
}
