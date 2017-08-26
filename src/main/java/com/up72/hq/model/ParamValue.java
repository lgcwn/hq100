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
 * 参数值
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ParamValue  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "参数值";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_PARAM_ID = "参数id";
	public static final String ALIAS_PARAM_VALUE = "值";
	public static final String ALIAS_SORT_ID = "排序id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 参数id       db_column: PARAM_ID 
     */	
	@NotNull 
	private java.lang.Long paramId;
    /**
     * 值       db_column: PARAM_VALUE 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String paramValue;
    /**
     * 排序id       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;
	//columns END

	public ParamValue(){
	}

	public ParamValue(
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
	public void setParamId(java.lang.Long value) {
		this.paramId = value;
	}
	
	public java.lang.Long getParamId() {
		return this.paramId;
	}
	public void setParamValue(java.lang.String value) {
		this.paramValue = value;
	}
	
	public java.lang.String getParamValue() {
		return this.paramValue;
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
		if(obj instanceof ParamValue == false) return false;
		if(this == obj) return true;
		ParamValue other = (ParamValue)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

