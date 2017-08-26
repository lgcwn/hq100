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
 * 参数
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Param  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "参数";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CAT_ID = "分类id";
	public static final String ALIAS_NAME = "参数名称";
	public static final String ALIAS_SORT_ID = "排序id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 分类id       db_column: CAT_ID 
     */	
	@NotNull 
	private java.lang.Long catId;
    /**
     * 参数名称       db_column: NAME 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String name;
    /**
     * 排序id       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;
	//columns END

	public Param(){
	}

	public Param(
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
	public void setCatId(java.lang.Long value) {
		this.catId = value;
	}
	
	public java.lang.Long getCatId() {
		return this.catId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
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
		if(obj instanceof Param == false) return false;
		if(this == obj) return true;
		Param other = (Param)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

