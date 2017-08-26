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
 * 
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Area  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "Area";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_FULL_NAME = "地区分级全名";
	public static final String ALIAS_NAME = "地区名称";
	public static final String ALIAS_TREE_PATH = "地区分级id路径";
	public static final String ALIAS_PARENT_ID = "父级id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 地区分级全名       db_column: FULL_NAME 
     */	
	@Length(max=2147483647)
	private java.lang.String fullName;
    /**
     * 地区名称       db_column: NAME 
     */	
	@Length(max=100)
	private java.lang.String name;
    /**
     * 地区分级id路径       db_column: TREE_PATH 
     */	
	@Length(max=255)
	private java.lang.String treePath;
    /**
     * 父级id       db_column: PARENT_ID 
     */	
	
	private java.lang.Long parentId;
	//columns END

	public Area(){
	}

	public Area(
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
	public void setFullName(java.lang.String value) {
		this.fullName = value;
	}
	
	public java.lang.String getFullName() {
		return this.fullName;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setTreePath(java.lang.String value) {
		this.treePath = value;
	}
	
	public java.lang.String getTreePath() {
		return this.treePath;
	}
	public void setParentId(java.lang.Long value) {
		this.parentId = value;
	}
	
	public java.lang.Long getParentId() {
		return this.parentId;
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
		if(obj instanceof Area == false) return false;
		if(this == obj) return true;
		Area other = (Area)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

