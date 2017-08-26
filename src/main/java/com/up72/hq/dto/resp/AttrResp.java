/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Attr;
import com.up72.hq.model.AttrValue;

import java.util.List;


/**
 * 属性输出
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class AttrResp extends Attr {

    public AttrResp() {
    }

    public AttrResp(Attr dhsAttr){
        super(dhsAttr.getId(),dhsAttr.getCatId(),dhsAttr.getName(),dhsAttr.getSortId());
    }
    private String catName;
    private List<AttrValue> attrValueList;
    public List<AttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<AttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}