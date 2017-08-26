package com.up72.hq.dto.resp;

import com.up72.hq.model.Goods;
import com.up72.hq.model.OrderGoodsComment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/5/13.
 */
public class OrderGoodsCommentResp extends OrderGoodsComment {
    private String userName;
    private String headImg;
    private String timeStr;
    private Goods goods;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimeStr() {
        String str = "";
        try{
            Date date = new Date(this.getAddTime());
            SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
            str = formatter.format(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }

    public void setTimeStr(String timeStr) {
        this.timeStr = timeStr;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}
