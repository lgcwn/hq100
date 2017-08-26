/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.req;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



/**
 * 标签库输入
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiLabelReq  implements java.io.Serializable{
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 标签名称       db_column: NAME 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String name;
    /**
     * 企业id       db_column: COMPANY_ID 
     */	
	@NotNull 
	private java.lang.Long companyId;
    /**
     * 站点菜单id       db_column: SITE_MENU_ID 
     */	
	@NotNull 
	private java.lang.Long siteMenuId;
    /**
     * 是否启用       db_column: IS_ENABLE 
     */	
	@NotNull 
	private Integer isEnable;
    /**
     * 添加人id       db_column: ADD_USER_ID 
     */	
	@NotNull 
	private java.lang.Long addUserId;
    /**
     * 添加人名称       db_column: ADD_USER_NAME 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String addUserName;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 排序       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Integer sortId;
	//columns END

	public BusiLabelReq(){
	}

	public BusiLabelReq(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setCompanyId(java.lang.Long value) {
		this.companyId = value;
	}
	
	public java.lang.Long getCompanyId() {
		return this.companyId;
	}
	public void setSiteMenuId(java.lang.Long value) {
		this.siteMenuId = value;
	}
	
	public java.lang.Long getSiteMenuId() {
		return this.siteMenuId;
	}
	public void setIsEnable(Integer value) {
		this.isEnable = value;
	}
	
	public Integer getIsEnable() {
		return this.isEnable;
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
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setSortId(java.lang.Integer value) {
		this.sortId = value;
	}
	
	public java.lang.Integer getSortId() {
		return this.sortId;
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
		if(obj instanceof BusiLabelReq == false) return false;
		if(this == obj) return true;
		BusiLabelReq other = (BusiLabelReq)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

