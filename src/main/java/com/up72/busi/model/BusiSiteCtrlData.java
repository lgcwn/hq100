/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 站点控件数据
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteCtrlData  implements java.io.Serializable{
	public static final String TABLE_ALIAS = "站点控件数据";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_SITE_MENU_ID = "站点ID";
	public static final String ALIAS_CTRL_ID = "控件ID";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_IMAGES = "图片，逗号分隔";
	public static final String ALIAS_TEXTS = "文字，逗号分隔";
	public static final String ALIAS_URLS = "链接，逗号分隔";
	//columns START
    /** ID       数据库字段: ID */
	
	private Long id;
    /** 站点ID       数据库字段: SITE_MENU_ID */
	@NotNull 
	private Long siteMenuId;
    /** 控件ID       数据库字段: CTRL_ID */
	@NotNull 
	private Long ctrlId;
    /** 排序       数据库字段: SORT_ID */
	@NotNull 
	private Integer sortId;
    /** 图片，逗号分隔       数据库字段: IMAGES */
	@Length(max=65535)
	private String images;
    /** 文字，逗号分隔       数据库字段: TEXTS */
	@Length(max=65535)
	private String texts;
    /** 链接，逗号分隔       数据库字段: URLS */
	@Length(max=65535)
	private String urls;
	//columns END

	public BusiSiteCtrlData(){
	}

	public BusiSiteCtrlData(
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
	public void setCtrlId(Long value) {
		this.ctrlId = value;
	}
	
	public Long getCtrlId() {
		return this.ctrlId;
	}
	public void setSortId(Integer value) {
		this.sortId = value;
	}
	
	public Integer getSortId() {
		return this.sortId;
	}
	public void setImages(String value) {
		this.images = value;
	}
	
	public String getImages() {
		return this.images;
	}
	public void setTexts(String value) {
		this.texts = value;
	}
	
	public String getTexts() {
		return this.texts;
	}
	public void setUrls(String value) {
		this.urls = value;
	}
	
	public String getUrls() {
		return this.urls;
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
		if(obj instanceof BusiSiteCtrlData == false) return false;
		if(this == obj) return true;
		BusiSiteCtrlData other = (BusiSiteCtrlData)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

