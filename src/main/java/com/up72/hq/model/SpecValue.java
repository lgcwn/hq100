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
 * 规格值
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class SpecValue  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "规格值";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_SPEC_ID = "规格id";
	public static final String ALIAS_SPEC_VALUE = "值";
	public static final String ALIAS_SORT_ID = "排序id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 规格id       db_column: SPEC_ID 
     */	
	@NotNull 
	private java.lang.Long specId;
    /**
     * 值       db_column: SPEC_VALUE 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String specValue;
    /**
     * 排序id       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;
	//columns END

	public SpecValue(){
	}

	public SpecValue(
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
	public void setSpecId(java.lang.Long value) {
		this.specId = value;
	}
	
	public java.lang.Long getSpecId() {
		return this.specId;
	}
	public void setSpecValue(java.lang.String value) {
		this.specValue = value;
	}
	
	public java.lang.String getSpecValue() {
		return this.specValue;
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
		if(obj instanceof SpecValue == false) return false;
		if(this == obj) return true;
		SpecValue other = (SpecValue)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

