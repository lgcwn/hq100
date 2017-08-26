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
 * 产品颜色图片
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ProdImg  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "产品颜色图片";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_PROD_ID = "产品id";
	public static final String ALIAS_SPEC_ID = "颜色规格id";
	public static final String ALIAS_SPEC_VALUE_ID = "颜色规格值";
	public static final String ALIAS_IMGS = "图片，逗号分隔";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 产品id       db_column: PROD_ID 
     */	
	@NotNull 
	private java.lang.Long prodId;
    /**
     * 颜色规格id       db_column: SPEC_ID 
     */	
	@NotNull 
	private java.lang.Long specId;
    /**
     * 颜色规格值       db_column: SPEC_VALUE_ID 
     */	
	@NotNull 
	private java.lang.Long specValueId;
    /**
     * 图片，逗号分隔       db_column: IMGS 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String imgs;
	//columns END

	public ProdImg(){
	}

	public ProdImg(
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
	public void setProdId(java.lang.Long value) {
		this.prodId = value;
	}
	
	public java.lang.Long getProdId() {
		return this.prodId;
	}
	public void setSpecId(java.lang.Long value) {
		this.specId = value;
	}
	
	public java.lang.Long getSpecId() {
		return this.specId;
	}
	public void setSpecValueId(java.lang.Long value) {
		this.specValueId = value;
	}
	
	public java.lang.Long getSpecValueId() {
		return this.specValueId;
	}
	public void setImgs(java.lang.String value) {
		this.imgs = value;
	}
	
	public java.lang.String getImgs() {
		return this.imgs;
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
		if(obj instanceof ProdImg == false) return false;
		if(this == obj) return true;
		ProdImg other = (ProdImg)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

