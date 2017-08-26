package com.up72.hq.dto.resp;

import com.up72.hq.model.ShoppingCart;
import com.up72.hq.utils.CodeEncryption;

/**
 * Created by liuguicheng on 16/7/13.
 */
public class ShoppingCartResp extends ShoppingCart implements  java.io.Serializable {


    private String totalAmount;


    private String price;
    private String marketPrice;//市场价格

    private String goodsIdIdCipher;


    private String idCipher;

    private String specNames;


    public String getIdCipher() {
        idCipher= CodeEncryption.encryption(getId());
        return idCipher;
    }

    public void setIdCipher(String idCipher) {
        this.idCipher = idCipher;
    }

    public String getGoodsIdIdCipher() {
        goodsIdIdCipher= CodeEncryption.encryption(getGoodsId());
        return goodsIdIdCipher;
    }

    public void setGoodsIdIdCipher(String goodsIdIdCipher) {
        this.goodsIdIdCipher = goodsIdIdCipher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSpecNames() {
        return specNames;
    }

    public void setSpecNames(String specNames) {
        this.specNames = specNames;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }
}
