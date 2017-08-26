/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.hq.model.ProdParam;
import com.up72.hq.model.ProdParam;


/**
 * 产品参数中间表输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ProdParamResp extends ProdParam {
	private String paramName;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

}