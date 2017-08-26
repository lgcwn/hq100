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
 * 品牌表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Brand  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "品牌表";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_NAME = "品牌名称";
	public static final String ALIAS_LOGO_PATH = "品牌logo";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_CONTENT = "品牌描述、简介";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_SUPPLIER = "供应商";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 品牌名称       db_column: NAME 
     */	
	@Length(max=30)
	private java.lang.String name;
    /**
     * 品牌logo       db_column: LOGO_PATH 
     */	
	@Length(max=155)
	private java.lang.String logoPath;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 品牌描述、简介       db_column: CONTENT 
     */	
	@Length(max=500)
	private java.lang.String content;
    /**
     * 排序       db_column: SORT_ID 
     */	
	
	private java.lang.Long sortId;
    /**
     * 供应商       db_column: SUPPLIER 
     */	
	@Length(max=100)
	private java.lang.String supplier;
	//columns END

	public Brand(){
	}

	public Brand(
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
	public void setLogoPath(java.lang.String value) {
		this.logoPath = value;
	}
	
	public java.lang.String getLogoPath() {
		return this.logoPath;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setSortId(java.lang.Long value) {
		this.sortId = value;
	}
	
	public java.lang.Long getSortId() {
		return this.sortId;
	}
	public void setSupplier(java.lang.String value) {
		this.supplier = value;
	}
	
	public java.lang.String getSupplier() {
		return this.supplier;
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
		if(obj instanceof Brand == false) return false;
		if(this == obj) return true;
		Brand other = (Brand)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

