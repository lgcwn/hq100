/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.dto.resp;

import com.up72.hq.constant.Cnst;
import com.up72.hq.model.RuleCanvass;


/**
 * (拉票)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RuleCanvassResp extends RuleCanvass {

	private  String auditTimeStr;
	private  String addTimeStr;
	private  String memberName;//姓名
	private  String headImg;//头像
	private  String movieName;//角色选拔名称（电影名称）
	private  String phone;//用户手机
	private  String roleName;//角色名称

	public String getAddTimeStr() {
		return Cnst.getFormatTime(super.getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public String getAuditTimeStr() {
		return Cnst.getFormatTime(super.getAuditTime());
	}

	public void setAuditTimeStr(String auditTimeStr) {
		this.auditTimeStr = auditTimeStr;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
}

