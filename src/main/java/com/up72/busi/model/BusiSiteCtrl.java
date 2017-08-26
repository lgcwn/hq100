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
 * 站点控件
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteCtrl  implements java.io.Serializable{
	public static final String TABLE_ALIAS = "站点控件";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_SITE_MENU_ID = "站点ID";
	public static final String ALIAS_NAME = "name";
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
    /** name       数据库字段: NAME */
	@NotBlank @Length(max=50)
	private String name;
    /** 排序       数据库字段: SORT_ID */
	@NotNull 
	private Integer sortId;
    /** 图片，逗号分隔       数据库字段: IMAGES */
	@Length(max=1000)
	private String images;
    /** 文字，逗号分隔       数据库字段: TEXTS */
	@Length(max=1000)
	private String texts;
    /** 链接，逗号分隔       数据库字段: URLS */
	@Length(max=1000)
	private String urls;
	//columns END

	public BusiSiteCtrl(){
	}

	public BusiSiteCtrl(
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
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
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
		if(obj instanceof BusiSiteCtrl == false) return false;
		if(this == obj) return true;
		BusiSiteCtrl other = (BusiSiteCtrl)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

