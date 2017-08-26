/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 角色拉票
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RuleCanvass  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "角色拉票";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ROLE_SELECT_ID = "角色选拔ID";
	public static final String ALIAS_STATUS = "状态";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_AUDIT_TIME = "审核时间";
	public static final String ALIAS_CONTENT = "内容";
	public static final String ALIAS_MEMBER_ID = "会员ID";
	public static final String ALIAS_REJECT_REASON = "驳回原因";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 角色选拔ID       db_column: ROLE_SELECT_ID 
     */	
	@NotNull 
	private java.lang.Long roleSelectId;
    /**
     * 角色管理ID       db_column: ROLE_MANAGER_ID
     */
	@NotNull
	private java.lang.Long roleManagerId;
    /**
     * 状态(0-待审核，1-已驳回，2-已通过)       db_column: STATUS 
     */	
	@NotNull 
	private Integer status;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 审核时间       db_column: AUDIT_TIME 
     */	
	
	private java.lang.Long auditTime;
    /**
     * 内容       db_column: CONTENT 
     */
	@NotBlank @Length(max=256)
	private java.lang.String content;
    /**
     * 会员ID       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 驳回原因       db_column: REJECT_REASON 
     */	
	@Length(max=256)
	private java.lang.String rejectReason;
	//columns END

	public RuleCanvass(){
	}

	public RuleCanvass(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setRoleSelectId(java.lang.Long value) {
		this.roleSelectId = value;
	}
	
	public java.lang.Long getRoleSelectId() {
		return this.roleSelectId;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setAuditTime(java.lang.Long value) {
		this.auditTime = value;
	}
	
	public java.lang.Long getAuditTime() {
		return this.auditTime;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setRejectReason(java.lang.String value) {
		this.rejectReason = value;
	}
	
	public java.lang.String getRejectReason() {
		return this.rejectReason;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Long getRoleManagerId() {
		return roleManagerId;
	}

	public void setRoleManagerId(Long roleManagerId) {
		this.roleManagerId = roleManagerId;
	}

	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RuleCanvass == false) return false;
		if(this == obj) return true;
		RuleCanvass other = (RuleCanvass)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

