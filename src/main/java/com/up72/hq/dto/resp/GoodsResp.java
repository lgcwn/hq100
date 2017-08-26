/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.hq.conf.SystemConfig;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.*;
import com.up72.hq.service.ICatService;
import com.up72.hq.utils.CodeEncryption;
import com.up72.framework.util.ObjectUtils;
import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.model.Goods;
import com.up72.hq.model.ProdSpec;
import org.apache.commons.lang.StringUtils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * 商品输出，用于后台，关联查询出规格列表
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class GoodsResp extends Goods {
	private List<ProdSpec> prodSpecList;
    private String catName;
    private String addTimeStr;//添加时间
    private String markeTimeStr;//上架时间
    private String imgStr;//图片
    private String mianImgStr;//主图片
    private Long oneCatId;//分类一级ID
    private String goodsPriceStr;//价格
    private String marketPriceStr;//市场价格
    private String catStr;//分类字符串
    private String catIdCipher;//分类
    private Integer count;//商品数量
    private String priceStr;
    private Integer priceInt;//整数价格（T币或积分使用）
    private Integer marketPriceInt;//市场价格
    private String prodName;//产品名称
    private Integer commentCount;//评论人数
    private Integer niceCount;//好评人数
    private String praise;//好评率
    private String totalAmount;//商品价格
    private Cat cat;
    private  String [] imagesList;

    public String getCatIdCipher() {
        catIdCipher= CodeEncryption.encryption(getCatId());
        return catIdCipher;
    }

    public String getPriceStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getPrice() != null){
            priceStr=df.format(getPrice());
        }
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCatIdCipher(String catIdCipher) {
        this.catIdCipher = catIdCipher;
    }

    public List<ProdSpec> getProdSpecList() {
        return prodSpecList;
    }

    public void setProdSpecList(List<ProdSpec> prodSpecList) {
        this.prodSpecList = prodSpecList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(this.getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public String getMarkeTimeStr() {
        return Cnst.getFormatTime(this.getMarkeTime());
    }

    public void setMarkeTimeStr(String markeTimeStr) {
        this.markeTimeStr = markeTimeStr;
    }

    public String getImgStr() {
        return imgStr;
    }

    public void setImgStr(String imgStr) {
        this.imgStr = imgStr;
    }

    public String getMianImgStr() {
        String mainImg = "";
        try{
            if(StringUtils.isNotEmpty(getImgStr())){
                String [] imgs = getImgStr().split(",");
                if(imgs.length >0){
                    mainImg = imgs[0];
                }
            }else{
                mainImg = this.getFirstImg();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return mainImg;
    }

    public void setMianImgStr(String mianImgStr) {
        this.mianImgStr = mianImgStr;
    }

    public Long getOneCatId() {
        Long oneId = 0l;
        try{
            if(getCatId() != null){
                ICatService service = (ICatService) ApplicationContextHolder.getBean("catService");
                Cat cat = service.getById(getCatId());
                if(ObjectUtils.isNotEmpty(cat)){
                    String []path = cat.getIdPath().split(",");
                    oneId = Long.parseLong(path[0]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        if(oneId != null){
            return oneId;
        }else{
            return  null;
        }
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setOneCatId(Long oneCatId) {
        this.oneCatId = oneCatId;
    }

    public String getGoodsPriceStr() {
        String s1 = "0.0";
        if(this.getPrice() != null && !"".equals(this.getPrice())){
            DecimalFormat    df   = new DecimalFormat("######0.00");
            s1 = df.format(this.getPrice());
        }
        return s1;
    }

    public void setGoodsPriceStr(String goodsPriceStr) {
        this.goodsPriceStr = goodsPriceStr;
    }

    public String getCatStr() {
        String str = "";
        try{
            if(getCatId() != null){
                ICatService service = (ICatService) ApplicationContextHolder.getBean("catService");
                Cat cat = service.getById(getCatId());
                if(ObjectUtils.isNotEmpty(cat)){
                    str = cat.getIdPath();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }

    public void setCatStr(String catStr) {
        this.catStr = catStr;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getNiceCount() {
        return niceCount;
    }

    public void setNiceCount(Integer niceCount) {
        this.niceCount = niceCount;
    }

    public String getPraise() {
        String praiseStr = "";
        try{
            Integer cC = this.getCommentCount();
            Integer cN = this.getNiceCount();
            if(cC != null && cC > 0){
                if(cN != null && cN > 0){
                    int str= cN/cC;
                    praiseStr=str*100+"";
                }else{
                    praiseStr = "0";
                }
            }else{
                praiseStr = "0";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return praiseStr;
    }

    public void setPraise(String praise) {
        this.praise = praise;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String[] getImagesList() {
        try{
            if(StringUtils.isNotEmpty(super.getImages())){
                imagesList=super.getImages().split(",");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return imagesList;
    }

    public void setImagesList(String[] imagesList) {
        this.imagesList = imagesList;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPriceInt() {
        double price=getPrice();
        return (int)(price);
    }

    public int getMarketPriceInt() {
        if(ObjectUtils.isNotEmpty(getMarketPrice())){
            double price=getMarketPrice();
            return (int)(price);
        }
        return 0;
    }

    public void setPriceInt(Integer priceInt) {
        this.priceInt = priceInt;
    }

    public String getMarketPriceStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getMarketPrice() != null){
            marketPriceStr=df.format(getMarketPrice());
        }
        return marketPriceStr;
    }


    private java.lang.String fileImg;

    public String getFileImg() {
        return SystemConfig.instants().getValue("file")+this.getFirstImg();
    }
}