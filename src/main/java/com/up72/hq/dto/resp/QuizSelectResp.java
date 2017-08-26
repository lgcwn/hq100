package com.up72.hq.dto.resp;

import com.up72.hq.model.QuizSelect;

import java.text.DecimalFormat;

/**
 * Created by Alan on 2016/7/8.
 */
public class QuizSelectResp extends QuizSelect {
    private Double percentage;


    public Double getPercentage() {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(percentage*100));
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
