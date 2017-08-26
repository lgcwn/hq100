package com.up72.hq.dto.resp;

import java.io.Serializable;

/**
 * Created by LiuGuicheng on 2016/7/10.
 */
public class VotesResp implements Serializable {
    private  Long open;//开盘值
    private  Long close;//收盘值
    private  Long highest;//最高票数
    private  Long lowest;//最低票数
    private  Integer ranking;//排名


    public Long getHighest() {
        return highest;
    }

    public void setHighest(Long highest) {
        this.highest = highest;
    }

    public Long getLowest() {
        return lowest;
    }

    public void setLowest(Long lowest) {
        this.lowest = lowest;
    }

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public Long getClose() {
        return close;
    }

    public void setClose(Long close) {
        this.close = close;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
