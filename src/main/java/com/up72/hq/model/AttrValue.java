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
 * 属性值
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class AttrValue  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "属性值";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ATTR_ID = "属性id";
	public static final String ALIAS_ATTR_VALUE = "值";
	public static final String ALIAS_SORT_ID = "排序id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 属性id       db_column: ATTR_ID 
     */	
	@NotNull 
	private java.lang.Long attrId;
    /**
     * 值       db_column: ATTR_VALUE 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String attrValue;
    /**
     * 排序id       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;
	//columns END

	public AttrValue(){
	}

	public AttrValue(
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
	public void setAttrId(java.lang.Long value) {
		this.attrId = value;
	}
	
	public java.lang.Long getAttrId() {
		return this.attrId;
	}
	public void setAttrValue(java.lang.String value) {
		this.attrValue = value;
	}
	
	public java.lang.String getAttrValue() {
		return this.attrValue;
	}
	public void setSortId(java.lang.Long value) {
		this.sortId = value;
	}
	
	public java.lang.Long getSortId() {
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
		if(obj instanceof AttrValue == false) return false;
		if(this == obj) return true;
		AttrValue other = (AttrValue)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

