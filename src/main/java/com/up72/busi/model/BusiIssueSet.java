/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;


/**
 * 发布配置
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiIssueSet implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "发布配置";
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
	
	private Long id;
    /**
     * 站点菜单id       db_column: SITE_MENU_ID
     */
	@NotNull
	private Long siteMenuId;
    /**
     * 企业id       db_column: COMPANY_ID
     */
	@NotNull
	private Long companyId;
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

	private Long addUserId;
    /**
     * 设置人名称       db_column: ADD_USER_NAME
     */
	@Length(max=50)
	private String addUserName;

	private Integer issueHours;
	private Integer issueMinutes;
	//columns END

	public BusiIssueSet(){
	}

	public BusiIssueSet(
			Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}

	public Long getId() {
		return this.id;
	}
	public void setSiteMenuId(Long value) {
		this.siteMenuId = value;
	}

	public Long getSiteMenuId() {
		return this.siteMenuId;
	}
	public void setCompanyId(Long value) {
		this.companyId = value;
	}

	public Long getCompanyId() {
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
	public void setAddUserId(Long value) {
		this.addUserId = value;
	}

	public Long getAddUserId() {
		return this.addUserId;
	}
	public void setAddUserName(String value) {
		this.addUserName = value;
	}

	public String getAddUserName() {
		return this.addUserName;
	}

	public Integer getIssueHours() {
		return issueHours;
	}

	public void setIssueHours(Integer issueHours) {
		this.issueHours = issueHours;
	}

	public Integer getIssueMinutes() {
		return issueMinutes;
	}

	public void setIssueMinutes(Integer issueMinutes) {
		this.issueMinutes = issueMinutes;
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
		if(obj instanceof BusiIssueSet == false) return false;
		if(this == obj) return true;
		BusiIssueSet other = (BusiIssueSet)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

