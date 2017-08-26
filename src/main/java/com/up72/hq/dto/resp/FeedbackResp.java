package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Feedback;

/**
 * Created by alans on 2016/8/9.
 */
public class FeedbackResp extends Feedback {
    private String addTimeStr;

    public String getAddTimeStr() {
        return Cnst.getFormatTime(getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }
}
