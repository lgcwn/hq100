package com.up72.hq.dto.resp;

import com.up72.hq.model.Quiz;
import com.up72.hq.model.QuizQuestio;

import java.util.List;

/**
 * Created by Administrator on 2016/6/22.
 */
public class QuizResp extends Quiz {
    //总问题数
    private  String totalNums;
    //所属赛场
    private  String sc;
    //参加会员数
    private  String memberNums;
    //问题Id
    private String hqqId;
    private String quizId;
    private String hqqName;
    //问题
   private List<QuizQuestioResp> quizQuestios;

    public String getTotalNums() {
        return totalNums;
    }

    public void setTotalNums(String totalNums) {
        this.totalNums = totalNums;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getMemberNums() {
        return memberNums;
    }

    public void setMemberNums(String memberNums) {
        this.memberNums = memberNums;
    }


    public String getHqqName() {
        return hqqName;
    }

    public void setHqqName(String hqqName) {
        this.hqqName = hqqName;
    }

    public String getHqqId() {
        return hqqId;
    }

    public void setHqqId(String hqqId) {
        this.hqqId = hqqId;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public List<QuizQuestioResp> getQuizQuestios() {
        return quizQuestios;
    }

    public void setQuizQuestios(List<QuizQuestioResp> quizQuestios) {
        this.quizQuestios = quizQuestios;
    }
}
