/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.RoleManager;
import com.up72.hq.model.RoleSelect;

import java.util.List;


/**
 * (角色选拔)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RoleManagerResp extends RoleManager{

	private  String addTimeStr;
	private  Integer signPeoples;//报名人数
	private  Integer loginuserIsSignUp=0;//当前登录用户是否针对该角色报名 默认没有报名
	private List<RuleManagerOrderResp> ruleManagerOrderRespList;//报名名单

	public String getAddTimeStr() {
		return Cnst.getFormatTime(super.getAddTime());
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

	public List<RuleManagerOrderResp> getRuleManagerOrderRespList() {
		return ruleManagerOrderRespList;
	}

	public void setRuleManagerOrderRespList(List<RuleManagerOrderResp> ruleManagerOrderRespList) {
		this.ruleManagerOrderRespList = ruleManagerOrderRespList;
	}

	public Integer getLoginuserIsSignUp() {
		return loginuserIsSignUp;
	}

	public void setLoginuserIsSignUp(Integer loginuserIsSignUp) {
		this.loginuserIsSignUp = loginuserIsSignUp;
	}
}

