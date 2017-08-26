/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Goods;

/**
 * 商品输出，用于商品列表页，显示分类名称
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Goods3Resp extends Goods {
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}