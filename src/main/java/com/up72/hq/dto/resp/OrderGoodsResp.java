package com.up72.hq.dto.resp;


import com.up72.hq.model.OrderGoods;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/26.
 */
public class OrderGoodsResp extends OrderGoods {

    //包装清单
    private String packingList;
    private String createDateStr;
    private Integer goodsCommentStatus;
    private Integer commentScore;
    private String specNames;
    private String goodsPriceStr;

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getCreateDateStr() {
        String addTimeStr = "";
        try{
            if(getCreateDate() != null){
                SimpleDateFormat formatter = new SimpleDateFormat(" yyyy-MM-dd ");
                addTimeStr = formatter.format(new Date(getCreateDate()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return addTimeStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }


    public Integer getGoodsCommentStatus() {
        return goodsCommentStatus;
    }

    public void setGoodsCommentStatus(Integer goodsCommentStatus) {
        this.goodsCommentStatus = goodsCommentStatus;
    }

    public Integer getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Integer commentScore) {
        this.commentScore = commentScore;
    }

    public String getSpecNames() {
        return specNames;
    }

    public void setSpecNames(String specNames) {
        this.specNames = specNames;
    }

    @Override
    public String getGoodsPriceStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getGoodsPrice() != null){
            goodsPriceStr=df.format(getGoodsPrice());
        }
        return goodsPriceStr;
    }
}
