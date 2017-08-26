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
 * 
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class IssueSet  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "IssueSet";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SITE_MENU_ID = "站点菜单id";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_IS_AUDITING = "是否需要审核";
	public static final String ALIAS_ISSUE_SET = "发布设置，0人工发布，1自动发布";
	public static final String ALIAS_ADD_USER_ID = "设置人id";
	public static final String ALIAS_ADD_USER_NAME = "设置人名称";
	public static final String ALIAS_ISSUE_HOURS = "发布小时";
	public static final String ALIAS_ISSUE_MINUTES = "发布分钟";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 站点菜单id       db_column: SITE_MENU_ID 
     */	
	@NotNull 
	private java.lang.Long siteMenuId;
    /**
     * 企业id       db_column: COMPANY_ID 
     */	
	@NotNull 
	private java.lang.Long companyId;
    /**
     * 是否需要审核       db_column: IS_AUDITING 
     */	
	@NotNull @Max(127)
	private Integer isAuditing;
    /**
     * 发布设置，0人工发布，1自动发布       db_column: ISSUE_SET 
     */	
	@NotNull @Max(127)
	private Integer issueSet;
    /**
     * 设置人id       db_column: ADD_USER_ID 
     */	
	
	private java.lang.Long addUserId;
    /**
     * 设置人名称       db_column: ADD_USER_NAME 
     */	
	@Length(max=50)
	private java.lang.String addUserName;
    /**
     * 发布小时       db_column: ISSUE_HOURS 
     */	
	
	private java.lang.Integer issueHours;
    /**
     * 发布分钟       db_column: ISSUE_MINUTES 
     */	
	
	private java.lang.Integer issueMinutes;
	//columns END

	public IssueSet(){
	}

	public IssueSet(
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
	public void setSiteMenuId(java.lang.Long value) {
		this.siteMenuId = value;
	}
	
	public java.lang.Long getSiteMenuId() {
		return this.siteMenuId;
	}
	public void setCompanyId(java.lang.Long value) {
		this.companyId = value;
	}
	
	public java.lang.Long getCompanyId() {
		return this.companyId;
	}
	public void setIsAuditing(Integer value) {
		this.isAuditing = value;
	}
	
	public Integer getIsAuditing() {
		return this.isAuditing;
	}
	public void setIssueSet(Integer value) {
		this.issueSet = value;
	}
	
	public Integer getIssueSet() {
		return this.issueSet;
	}
	public void setAddUserId(java.lang.Long value) {
		this.addUserId = value;
	}
	
	public java.lang.Long getAddUserId() {
		return this.addUserId;
	}
	public void setAddUserName(java.lang.String value) {
		this.addUserName = value;
	}
	
	public java.lang.String getAddUserName() {
		return this.addUserName;
	}
	public void setIssueHours(java.lang.Integer value) {
		this.issueHours = value;
	}
	
	public java.lang.Integer getIssueHours() {
		return this.issueHours;
	}
	public void setIssueMinutes(java.lang.Integer value) {
		this.issueMinutes = value;
	}
	
	public java.lang.Integer getIssueMinutes() {
		return this.issueMinutes;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof IssueSet == false) return false;
		if(this == obj) return true;
		IssueSet other = (IssueSet)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

