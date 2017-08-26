/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.hq.model.Spec;
import com.up72.hq.model.SpecValue;

import java.util.List;


/**
 *
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class SpecResp extends Spec {
    private String catName;
    private List<SpecValue> specValueList;

    public List<SpecValue> getSpecValueList() {
        return specValueList;
    }

    public void setSpecValueList(List<SpecValue> specValueList) {
        this.specValueList = specValueList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}