/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dto.resp;

import com.up72.hq.conf.SystemConfig;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Choose;
import com.up72.hq.model.ChooseList;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * (评选之最)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ChooseResp extends Choose {

	private  String startTimeStr;
	private  String endTimeStr;
	private  String addTimeStr;
	private  Long sumVotes;//总票数
	private List<ChooseListResp> chooseLists;

	public String getStartTimeStr() {
		return Cnst.getFormatDate(super.getStartTime());
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public String getEndTimeStr() {
		return Cnst.getFormatDate(super.getEndTime());
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}

	public Long getSumVotes() {
		return sumVotes;
	}

	public void setSumVotes(Long sumVotes) {
		this.sumVotes = sumVotes;
	}

	public String getAddTimeStr() {
		return Cnst.getFormatDate(super.getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public List<ChooseListResp> getChooseLists() {
		return chooseLists;
	}

	public void setChooseLists(List<ChooseListResp> chooseLists) {
		this.chooseLists = chooseLists;
	}


	private java.lang.String fileImg;
	public String getFileImg() {
		return SystemConfig.instants().getValue("file")+this.getBanner();
	}
}

