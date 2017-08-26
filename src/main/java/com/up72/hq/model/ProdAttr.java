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
 * 产品属性中间表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ProdAttr  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "产品属性中间表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_PROD_ID = "产品id";
	public static final String ALIAS_ATTR_ID = "属性id";
	public static final String ALIAS_ATTR_VALUE_ID = "属性值id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 产品id       db_column: PROD_ID 
     */	
	@NotNull 
	private java.lang.Long prodId;
    /**
     * 属性id       db_column: ATTR_ID 
     */	
	@NotNull 
	private java.lang.Long attrId;
    /**
     * 属性值id       db_column: ATTR_VALUE_ID 
     */	
	@NotNull 
	private java.lang.Long attrValueId;
	//columns END

	public ProdAttr(){
	}

	public ProdAttr(
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
	public void setAttrId(java.lang.Long value) {
		this.attrId = value;
	}
	
	public java.lang.Long getAttrId() {
		return this.attrId;
	}
	public void setAttrValueId(java.lang.Long value) {
		this.attrValueId = value;
	}
	
	public java.lang.Long getAttrValueId() {
		return this.attrValueId;
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
		if(obj instanceof ProdAttr == false) return false;
		if(this == obj) return true;
		ProdAttr other = (ProdAttr)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

