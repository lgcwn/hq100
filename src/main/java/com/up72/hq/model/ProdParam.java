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
 * 产品参数中间表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ProdParam  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "产品参数中间表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_PROD_ID = "产品id";
	public static final String ALIAS_PARA_ID = "参数id";
	public static final String ALIAS_PARAM_VALUE_ID = "参数值id";
	public static final String ALIAS_PARAM_VALUE = "参数值";
	
	
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
     * 参数id       db_column: PARA_ID 
     */	
	@NotNull 
	private java.lang.Long paramId;
    /**
     * 参数值id       db_column: PARAM_VALUE_ID 
     */	
	@NotNull 
	private java.lang.Long paramValueId;
    /**
     * 参数值       db_column: PARAM_VALUE 
     */	
	@Length(max=200)
	private java.lang.String paramValue;
	//columns END

	public ProdParam(){
	}

	public ProdParam(
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

	public Long getParamId() {
		return paramId;
	}

	public void setParamId(Long paramId) {
		this.paramId = paramId;
	}

	public void setParamValueId(java.lang.Long value) {
		this.paramValueId = value;
	}
	
	public java.lang.Long getParamValueId() {
		return this.paramValueId;
	}
	public void setParamValue(java.lang.String value) {
		this.paramValue = value;
	}
	
	public java.lang.String getParamValue() {
		return this.paramValue;
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
		if(obj instanceof ProdParam == false) return false;
		if(this == obj) return true;
		ProdParam other = (ProdParam)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

