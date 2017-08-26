/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Prod;

/**
 * 产品输出，用于产品列表页
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Prod2Resp extends Prod {
    private String catName;
    private Integer realSaleCnt;
    private Integer goodsSaleCnt;
    private Integer stockCnt;

    public Integer getRealSaleCnt() {
        return realSaleCnt;
    }

    public void setRealSaleCnt(Integer realSaleCnt) {
        this.realSaleCnt = realSaleCnt;
    }

    public Integer getGoodsSaleCnt() {
        return goodsSaleCnt;
    }

    public void setGoodsSaleCnt(Integer goodsSaleCnt) {
        this.goodsSaleCnt = goodsSaleCnt;
    }

    public Integer getStockCnt() {
        return stockCnt;
    }

    public void setStockCnt(Integer stockCnt) {
        this.stockCnt = stockCnt;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}