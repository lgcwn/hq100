/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiSiteCtrl;
import com.up72.busi.model.BusiSiteCtrlData;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 站点控件
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteCtrlResp extends BusiSiteCtrl{
	private List<BusiSiteCtrlData> dataList;

	public List<BusiSiteCtrlData> getDataList() {
		return dataList;
	}

	public void setDataList(List<BusiSiteCtrlData> dataList) {
		this.dataList = dataList;
	}
}

