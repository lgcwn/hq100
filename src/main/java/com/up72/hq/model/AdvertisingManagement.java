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
 * 广告位管理
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class AdvertisingManagement  implements java.io.Serializable{
	//alias
	public static final String TABLE_ALIAS = "广告管理";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "广告位名称";
	public static final String ALIAS_COLUMNS = "所属栏目";
	public static final String ALIAS_TYPES = "类型(1-广告位，2-轮播图)";

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * 广告位名称       db_column: NAME 
     */	
	@Length(max=50)
	private java.lang.String name;
    /**
     * 所属栏目()       db_column: COLUMNS 
     */	
	@Length(max=10)
	private java.lang.Integer columns;
    /**
     * 类型(1-广告位，2-轮播图)       db_column: TYPES 
     */	
	@Max(127)
	private Integer types;
	//columns END

	public AdvertisingManagement(){
	}

	public AdvertisingManagement(
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
	public void setColumns(java.lang.Integer value) {
		this.columns = value;
	}
	
	public java.lang.Integer getColumns() {
		return this.columns;
	}
	public void setTypes(Integer value) {
		this.types = value;
	}
	
	public Integer getTypes() {
		return this.types;
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
		if(obj instanceof AdvertisingManagement == false) return false;
		if(this == obj) return true;
		AdvertisingManagement other = (AdvertisingManagement)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

