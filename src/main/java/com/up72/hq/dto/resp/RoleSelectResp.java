/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dto.resp;

import com.up72.hq.conf.SystemConfig;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.Choose;
import com.up72.hq.model.RoleSelect;

import java.util.List;


/**
 * (角色选拔)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RoleSelectResp extends RoleSelect {

	private  String signStartTimeStr;
	private  String signEndTimeStr;
	private  String voteStartTimeStr;
	private  String voteEndTimeStr;
	private  String addTimeStr;
	private  Integer signPeoples;//报名人数
	private  Integer canvassPeoples;//拉票人数
	private List<RuleManagerOrderResp> ruleManagerOrderRespList;//报名人数

	public String getSignStartTimeStr() {
		return Cnst.getFormatDate(super.getSignStartTime());
	}

	public void setSignStartTimeStr(String signStartTimeStr) {
		this.signStartTimeStr = signStartTimeStr;
	}

	public String getSignEndTimeStr() {
		return Cnst.getFormatDate(super.getSignEndTime());
	}

	public void setSignEndTimeStr(String signEndTimeStr) {
		this.signEndTimeStr = signEndTimeStr;
	}

	public String getVoteStartTimeStr() {
		return Cnst.getFormatDate(super.getVoteStartTime());
	}

	public void setVoteStartTimeStr(String voteStartTimeStr) {
		this.voteStartTimeStr = voteStartTimeStr;
	}

	public String getVoteEndTimeStr() {
		return Cnst.getFormatDate(super.getVoteEndTime());
	}

	public void setVoteEndTimeStr(String voteEndTimeStr) {
		this.voteEndTimeStr = voteEndTimeStr;
	}

	public String getAddTimeStr() {
		return Cnst.getFormatDate(super.getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public Integer getSignPeoples() {
		return signPeoples;
	}

	public void setSignPeoples(Integer signPeoples) {
		this.signPeoples = signPeoples;
	}

	public Integer getCanvassPeoples() {
		return canvassPeoples;
	}

	public void setCanvassPeoples(Integer canvassPeoples) {
		this.canvassPeoples = canvassPeoples;
	}

	public List<RuleManagerOrderResp> getRuleManagerOrderRespList() {
		return ruleManagerOrderRespList;
	}

	public void setRuleManagerOrderRespList(List<RuleManagerOrderResp> ruleManagerOrderRespList) {
		this.ruleManagerOrderRespList = ruleManagerOrderRespList;
	}

	private java.lang.String fileImg;
	public String getFileImg() {
		return SystemConfig.instants().getValue("file")+this.getCoverImg();
	}
}

