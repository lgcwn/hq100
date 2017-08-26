/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;


/**
 * 统计报告
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiReport implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "统计报告";
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
     * 总入库量       db_column: TOTAL_CNT 
     */	
	@NotNull 
	private Integer totalCnt;
    /**
     * 已发布量       db_column: ISSUE_CNT 
     */	
	@NotNull 
	private Integer issueCnt;
    /**
     * 未发布量       db_column: SENSITIVE_COUNT 
     */	
	@NotNull 
	private Integer sensitiveCount;
    /**
     * 已审核量       db_column: AUDITING_CNT 
     */	
	@NotNull 
	private Integer auditingCnt;
    /**
     * 未审核量       db_column: NOT_AUDITING_CNT 
     */	
	@NotNull 
	private Integer notAuditingCnt;
    /**
     * 删除量       db_column: DEL_CNT 
     */	
	@NotNull 
	private Integer delCnt;
    /**
     * 报告日期       db_column: REPORT_DATE 
     */	
	@NotNull 
	private Integer reportDate;
	//columns END

	public BusiReport(){
	}

	public BusiReport(
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
	public void setTotalCnt(Integer value) {
		this.totalCnt = value;
	}
	
	public Integer getTotalCnt() {
		return this.totalCnt;
	}
	public void setIssueCnt(Integer value) {
		this.issueCnt = value;
	}
	
	public Integer getIssueCnt() {
		return this.issueCnt;
	}
	public void setSensitiveCount(Integer value) {
		this.sensitiveCount = value;
	}
	
	public Integer getSensitiveCount() {
		return this.sensitiveCount;
	}
	public void setAuditingCnt(Integer value) {
		this.auditingCnt = value;
	}
	
	public Integer getAuditingCnt() {
		return this.auditingCnt;
	}
	public void setNotAuditingCnt(Integer value) {
		this.notAuditingCnt = value;
	}
	
	public Integer getNotAuditingCnt() {
		return this.notAuditingCnt;
	}
	public void setDelCnt(Integer value) {
		this.delCnt = value;
	}
	
	public Integer getDelCnt() {
		return this.delCnt;
	}
	public void setReportDate(Integer value) {
		this.reportDate = value;
	}
	
	public Integer getReportDate() {
		return this.reportDate;
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
		if(obj instanceof BusiReport == false) return false;
		if(this == obj) return true;
		BusiReport other = (BusiReport)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

