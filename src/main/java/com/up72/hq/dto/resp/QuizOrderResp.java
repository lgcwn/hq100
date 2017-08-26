package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.QuizOrder;

/**
 * Created by Administrator on 2016/6/23.
 */
public class QuizOrderResp extends QuizOrder {
    //题目选项名称
    private String quizSelectName;
    //题目名称
    private String quizQuestioName;
    //题目选项数量
    private Integer selectNum;
    //赔率
    private String hqsOdds;
    //正确答案
    private String trueName;

    private String addTimeStr;
    private Long quizId;


    public String getQuizSelectName() {
        return quizSelectName;
    }

    public void setQuizSelectName(String quizSelectName) {
        this.quizSelectName = quizSelectName;
    }

    public String getQuizQuestioName() {
        return quizQuestioName;
    }

    public void setQuizQuestioName(String quizQuestioName) {
        this.quizQuestioName = quizQuestioName;
    }

    public Integer getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(Integer selectNum) {
        this.selectNum = selectNum;
    }

    public String getHqsOdds() {
        return hqsOdds;
    }

    public void setHqsOdds(String hqsOdds) {
        this.hqsOdds = hqsOdds;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
