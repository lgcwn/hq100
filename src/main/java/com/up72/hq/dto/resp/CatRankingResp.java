package com.up72.hq.dto.resp;

import com.up72.hq.model.Cat;
import com.up72.hq.model.StarRanking;

import java.util.List;

/**
 * Created by from on 2016/7/7.
 */
public class CatRankingResp extends Cat {
    private List<StarRankingResp> starRankingList;

    public List<StarRankingResp> getStarRankingList() {
        return starRankingList;
    }

    public void setStarRankingList(List<StarRankingResp> starRankingList) {
        this.starRankingList = starRankingList;
    }
}
