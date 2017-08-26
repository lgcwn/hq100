/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.hq.model.ProdAttr;

/**
 * 产品属性中间表输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ProdAttrResp extends ProdAttr {
    private String attrName;
	private String attrValueName;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValueName() {
        return attrValueName;
    }

    public void setAttrValueName(String attrValueName) {
        this.attrValueName = attrValueName;
    }
}