/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;


import com.up72.hq.model.Param;
import com.up72.hq.model.ParamValue;

import java.util.List;


/**
 * 参数输出
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ParamResp extends Param {

    private List<ParamValue> paramValueList;
    private String catName;

    public List<ParamValue> getParamValueList() {
        return paramValueList;
    }

    public void setParamValueList(List<ParamValue> paramValueList) {
        this.paramValueList = paramValueList;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}