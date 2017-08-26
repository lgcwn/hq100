package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.ProjectProgress;

import java.util.Date;

/**
 * Created by ss330 on 2016/7/21.
 */
public class ProjectProgressResp extends ProjectProgress {
    private String days;
    private String addTimeStr;

    public String getDays() {

         Date date = new Date();
        long x = date.getTime() - Cnst.stringToDate(Cnst.getFormatDate(getAddTime())).getTime();
        return (x/86400000)+"天";
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }
}
