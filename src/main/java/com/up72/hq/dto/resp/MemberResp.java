package com.up72.hq.dto.resp;

import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Information;
import com.up72.hq.model.Member;
import com.up72.hq.model.UserLoginLog;
import com.up72.hq.service.IInformationService;
import com.up72.hq.service.IVideoService;
import com.up72.hq.utils.DateUtils;

/**
 * Created by from on 2016/7/4.
 */
public class MemberResp extends Member {

    private Long chooseCnt;//参与评选数量
    private String birthdayTimeStr; //生日
    private String addTimeStr; //注册时间
    private String genderStr; //性别
    private Integer age;//年龄
    private String eduInfoIdStr; //教育背景
    private String eduInfoId2Str; //职业
    private UserLoginLog userLoginLog;


    public String getBirthdayTimeStr() {
        return Cnst.getFormatTime(super.getBirthday());
    }

    public void setBirthdayTimeStr(String birthdayTimeStr) {
        this.birthdayTimeStr = birthdayTimeStr;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatDate(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public Long getChooseCnt() {
        return chooseCnt;
    }

    public void setChooseCnt(Long chooseCnt) {
        this.chooseCnt = chooseCnt;
    }

    public Integer getAge() {
        return DateUtils.compareDate(this.getBirthdayTimeStr(), Cnst.getFormatDate(Cnst.getCurTime()), 2);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenderStr() {
        if (this.getGender() == null) {
            genderStr = "未知";
        }
        if (getGender() == 0) {
            genderStr = "未知";
        }
        if (getGender() == 1) {
            genderStr = "男";
        }
        if (getGender() == 2) {
            genderStr = "女";
        }
        return genderStr;
    }

    public void setGenderStr(String genderStr) {
        this.genderStr = genderStr;
    }

    public String getEduInfoIdStr() {
        IInformationService informationService = (IInformationService) ApplicationContextHolder.getBean("informationService");
        Information information = informationService.getById(getEduInfoId());
        if (information == null) {
            eduInfoIdStr = "未知";
        } else {
            eduInfoIdStr = information.getTitle();
        }

        return eduInfoIdStr;
    }

    public void setEduInfoIdStr(String eduInfoIdStr) {
        this.eduInfoIdStr = eduInfoIdStr;
    }

    public String getEduInfoId2Str() {
        IInformationService informationService = (IInformationService) ApplicationContextHolder.getBean("informationService");
        Information information = informationService.getById(getEduInfoId2());
        if (information == null) {
            eduInfoId2Str = "未知";
        } else {
            eduInfoId2Str = information.getTitle();
        }
        return eduInfoId2Str;
    }

    public void setEduInfoId2Str(String eduInfoId2Str) {
        this.eduInfoId2Str = eduInfoId2Str;
    }

    public UserLoginLog getUserLoginLog() {
        return userLoginLog;
    }

    public void setUserLoginLog(UserLoginLog userLoginLog) {
        this.userLoginLog = userLoginLog;
    }


}
