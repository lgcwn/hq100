/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Goods;

/**
 * 商品输出，用于商品详情页显示参数
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class Goods2Resp extends Goods {
    private String paramInfo;

    public String getParamInfo() {
        return paramInfo;
    }

    public void setParamInfo(String paramInfo) {
        this.paramInfo = paramInfo;
    }
}