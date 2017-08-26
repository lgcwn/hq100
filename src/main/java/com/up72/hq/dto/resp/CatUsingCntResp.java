/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import java.io.Serializable;


/**
 * 中文
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class CatUsingCntResp implements Serializable {
    private Long id;
    private String name;
    private int attrCnt;
    private int paramCnt;
    private int tagCnt;
    private int specCnt;
    private int prodCnt;
    private int salesCnt;
    private int starCnt;

    public int getAttrCnt() {
        return attrCnt;
    }

    public void setAttrCnt(int attrCnt) {
        this.attrCnt = attrCnt;
    }

    public int getParamCnt() {
        return paramCnt;
    }

    public void setParamCnt(int paramCnt) {
        this.paramCnt = paramCnt;
    }

    public int getSpecCnt() {
        return specCnt;
    }

    public void setSpecCnt(int specCnt) {
        this.specCnt = specCnt;
    }

    public int getProdCnt() {
        return prodCnt;
    }

    public void setProdCnt(int prodCnt) {
        this.prodCnt = prodCnt;
    }

    public int getTagCnt() {
        return tagCnt;
    }

    public void setTagCnt(int tagCnt) {
        this.tagCnt = tagCnt;
    }

    public int getSalesCnt() {
        return salesCnt;
    }

    public void setSalesCnt(int salesCnt) {
        this.salesCnt = salesCnt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarCnt() {
        return starCnt;
    }

    public void setStarCnt(int starCnt) {
        this.starCnt = starCnt;
    }
}