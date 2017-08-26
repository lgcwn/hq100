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
 * 品牌分类关系
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class CatBrand  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "品牌分类关系";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_BRAND_ID = "品牌id";
	public static final String ALIAS_CAT_ID = "分类id";
	public static final String ALIAS_ADD_TIME = "添加时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 品牌id       db_column: BRAND_ID 
     */	
	
	private java.lang.Long brandId;
    /**
     * 分类id       db_column: CAT_ID 
     */	
	
	private java.lang.Long catId;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
	//columns END

	public CatBrand(){
	}

	public CatBrand(
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
	public void setBrandId(java.lang.Long value) {
		this.brandId = value;
	}
	
	public java.lang.Long getBrandId() {
		return this.brandId;
	}
	public void setCatId(java.lang.Long value) {
		this.catId = value;
	}
	
	public java.lang.Long getCatId() {
		return this.catId;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
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
		if(obj instanceof CatBrand == false) return false;
		if(this == obj) return true;
		CatBrand other = (CatBrand)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

