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
public class EditorSet  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "EditorSet";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SITE_MENU_ID = "站点菜单id";
	public static final String ALIAS_COMPANY_ID = "企业id";
	public static final String ALIAS_IS_SHOW_SUBTITLE_PC = "(网站)是否显示编辑副标题";
	public static final String ALIAS_IS_SHOW_SUBTITLE_M = "(移动)是否显示编辑副标题";
	public static final String ALIAS_IS_SHOW_OUTLINK_PC = "(网站)是否显示编辑外部链接";
	public static final String ALIAS_IS_SHOW_OUTLINK_M = "(移动)是否显示编辑外部链接";
	public static final String ALIAS_IS_SHOW_LABEL_PC = "(网站)是否显示编辑标签";
	public static final String ALIAS_IS_SHOW_LABEL_M = "(移动)是否显示编辑标签";
	public static final String ALIAS_IS_SHOW_SOURCE_PC = "(网站)是否显示编辑来源";
	public static final String ALIAS_IS_SHOW_SOURCE_M = "(移动)是否显示编辑来源";
	public static final String ALIAS_IS_SHOW_SUMMARY_PC = "(网站)是否显示编辑摘要";
	public static final String ALIAS_IS_SHOW_SUMMARY_M = "(移动)是否显示编辑摘要";
	
	
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
     * (网站)是否显示编辑副标题       db_column: IS_SHOW_SUBTITLE_PC 
     */	
	@NotNull 
	private Integer isShowSubtitlePc;
    /**
     * (移动)是否显示编辑副标题       db_column: IS_SHOW_SUBTITLE_M 
     */	
	@NotNull 
	private Integer isShowSubtitleM;
    /**
     * (网站)是否显示编辑外部链接       db_column: IS_SHOW_OUTLINK_PC 
     */	
	@NotNull 
	private Integer isShowOutlinkPc;
    /**
     * (移动)是否显示编辑外部链接       db_column: IS_SHOW_OUTLINK_M 
     */	
	@NotNull 
	private Integer isShowOutlinkM;
    /**
     * (网站)是否显示编辑标签       db_column: IS_SHOW_LABEL_PC 
     */	
	@NotNull 
	private Integer isShowLabelPc;
    /**
     * (移动)是否显示编辑标签       db_column: IS_SHOW_LABEL_M 
     */	
	@NotNull 
	private Integer isShowLabelM;
    /**
     * (网站)是否显示编辑来源       db_column: IS_SHOW_SOURCE_PC 
     */	
	@NotNull 
	private Integer isShowSourcePc;
    /**
     * (移动)是否显示编辑来源       db_column: IS_SHOW_SOURCE_M 
     */	
	@NotNull 
	private Integer isShowSourceM;
    /**
     * (网站)是否显示编辑摘要       db_column: IS_SHOW_SUMMARY_PC 
     */	
	@NotNull 
	private Integer isShowSummaryPc;
    /**
     * (移动)是否显示编辑摘要       db_column: IS_SHOW_SUMMARY_M 
     */	
	@NotNull 
	private Integer isShowSummaryM;
	//columns END

	public EditorSet(){
	}

	public EditorSet(
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
	public void setIsShowSubtitlePc(Integer value) {
		this.isShowSubtitlePc = value;
	}
	
	public Integer getIsShowSubtitlePc() {
		return this.isShowSubtitlePc;
	}
	public void setIsShowSubtitleM(Integer value) {
		this.isShowSubtitleM = value;
	}
	
	public Integer getIsShowSubtitleM() {
		return this.isShowSubtitleM;
	}
	public void setIsShowOutlinkPc(Integer value) {
		this.isShowOutlinkPc = value;
	}
	
	public Integer getIsShowOutlinkPc() {
		return this.isShowOutlinkPc;
	}
	public void setIsShowOutlinkM(Integer value) {
		this.isShowOutlinkM = value;
	}
	
	public Integer getIsShowOutlinkM() {
		return this.isShowOutlinkM;
	}
	public void setIsShowLabelPc(Integer value) {
		this.isShowLabelPc = value;
	}
	
	public Integer getIsShowLabelPc() {
		return this.isShowLabelPc;
	}
	public void setIsShowLabelM(Integer value) {
		this.isShowLabelM = value;
	}
	
	public Integer getIsShowLabelM() {
		return this.isShowLabelM;
	}
	public void setIsShowSourcePc(Integer value) {
		this.isShowSourcePc = value;
	}
	
	public Integer getIsShowSourcePc() {
		return this.isShowSourcePc;
	}
	public void setIsShowSourceM(Integer value) {
		this.isShowSourceM = value;
	}
	
	public Integer getIsShowSourceM() {
		return this.isShowSourceM;
	}
	public void setIsShowSummaryPc(Integer value) {
		this.isShowSummaryPc = value;
	}
	
	public Integer getIsShowSummaryPc() {
		return this.isShowSummaryPc;
	}
	public void setIsShowSummaryM(Integer value) {
		this.isShowSummaryM = value;
	}
	
	public Integer getIsShowSummaryM() {
		return this.isShowSummaryM;
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
		if(obj instanceof EditorSet == false) return false;
		if(this == obj) return true;
		EditorSet other = (EditorSet)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

