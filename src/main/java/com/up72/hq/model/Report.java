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
public class Report  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "Report";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SITE_MENU_ID = "站点菜单id";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_TOTAL_CNT = "总入库量";
	public static final String ALIAS_ISSUE_CNT = "已发布量";
	public static final String ALIAS_SENSITIVE_COUNT = "未发布量";
	public static final String ALIAS_AUDITING_CNT = "已审核量";
	public static final String ALIAS_NOT_AUDITING_CNT = "未审核量";
	public static final String ALIAS_DEL_CNT = "删除量";
	public static final String ALIAS_REPORT_DATE = "报告日期";
	public static final String ALIAS_IS_PC = "是否PC端";
	
	
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
     * 总入库量       db_column: TOTAL_CNT 
     */	
	@NotNull 
	private java.lang.Integer totalCnt;
    /**
     * 已发布量       db_column: ISSUE_CNT 
     */	
	@NotNull 
	private java.lang.Integer issueCnt;
    /**
     * 未发布量       db_column: SENSITIVE_COUNT 
     */	
	@NotNull 
	private java.lang.Integer sensitiveCount;
    /**
     * 已审核量       db_column: AUDITING_CNT 
     */	
	@NotNull 
	private java.lang.Integer auditingCnt;
    /**
     * 未审核量       db_column: NOT_AUDITING_CNT 
     */	
	@NotNull 
	private java.lang.Integer notAuditingCnt;
    /**
     * 删除量       db_column: DEL_CNT 
     */	
	@NotNull 
	private java.lang.Integer delCnt;
    /**
     * 报告日期       db_column: REPORT_DATE 
     */	
	@NotNull 
	private java.lang.Integer reportDate;
    /**
     * 是否PC端       db_column: IS_PC 
     */	
	
	private Integer isPc;
	//columns END

	public Report(){
	}

	public Report(
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
	public void setTotalCnt(java.lang.Integer value) {
		this.totalCnt = value;
	}
	
	public java.lang.Integer getTotalCnt() {
		return this.totalCnt;
	}
	public void setIssueCnt(java.lang.Integer value) {
		this.issueCnt = value;
	}
	
	public java.lang.Integer getIssueCnt() {
		return this.issueCnt;
	}
	public void setSensitiveCount(java.lang.Integer value) {
		this.sensitiveCount = value;
	}
	
	public java.lang.Integer getSensitiveCount() {
		return this.sensitiveCount;
	}
	public void setAuditingCnt(java.lang.Integer value) {
		this.auditingCnt = value;
	}
	
	public java.lang.Integer getAuditingCnt() {
		return this.auditingCnt;
	}
	public void setNotAuditingCnt(java.lang.Integer value) {
		this.notAuditingCnt = value;
	}
	
	public java.lang.Integer getNotAuditingCnt() {
		return this.notAuditingCnt;
	}
	public void setDelCnt(java.lang.Integer value) {
		this.delCnt = value;
	}
	
	public java.lang.Integer getDelCnt() {
		return this.delCnt;
	}
	public void setReportDate(java.lang.Integer value) {
		this.reportDate = value;
	}
	
	public java.lang.Integer getReportDate() {
		return this.reportDate;
	}
	public void setIsPc(Integer value) {
		this.isPc = value;
	}
	
	public Integer getIsPc() {
		return this.isPc;
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
		if(obj instanceof Report == false) return false;
		if(this == obj) return true;
		Report other = (Report)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

