package com.up72.hq.dto.resp;

import com.up72.hq.model.QuizQuestio;
import com.up72.hq.model.QuizSelect;

import java.util.List;

/**
 * Created by Alan on 2016/7/6.
 */
public class QuizQuestioResp extends QuizQuestio {
    private String memberNum;
    private String selectIdStr;

    private List<QuizSelect> quizSelectList;
    private List<QuizSelectResp> quizSelectListResp;



    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public String getSelectIdStr() {
        return selectIdStr;
    }

    public void setSelectIdStr(String selectIdStr) {
        this.selectIdStr = selectIdStr;
    }

    public List<QuizSelect> getQuizSelectList() {
        return quizSelectList;
    }

    public void setQuizSelectList(List<QuizSelect> quizSelectList) {
        this.quizSelectList = quizSelectList;
    }


    public List<QuizSelectResp> getQuizSelectListResp() {

        return quizSelectListResp;
    }

    public void setQuizSelectListResp(List<QuizSelectResp> quizSelectListResp) {
        this.quizSelectListResp = quizSelectListResp;
    }
}
