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
 * 区域字典
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Region  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "区域字典";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "地区名称";
	public static final String ALIAS_PARENT_ID = "父节点id";
	public static final String ALIAS_FULL_NAME = "地区全名称";
	public static final String ALIAS_TREE_PATH = "地区分级id路径";
	public static final String ALIAS_LEVEL = "级别1-5";
	public static final String ALIAS_IS_DEL = "是否删除 0 否 1 是";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 地区名称       db_column: NAME 
     */	
	@Length(max=100)
	private java.lang.String name;
    /**
     * 父节点id       db_column: PARENT_ID 
     */	
	
	private java.lang.Long parentId;
    /**
     * 地区全名称       db_column: FULL_NAME 
     */	
	@Length(max=255)
	private java.lang.String fullName;
    /**
     * 地区分级id路径       db_column: TREE_PATH 
     */	
	@Length(max=255)
	private java.lang.String treePath;
    /**
     * 级别1-5       db_column: LEVEL 
     */	
	
	private java.lang.Integer level;
    /**
     * 是否删除 0 否 1 是       db_column: IS_DEL 
     */	
	
	private Integer isDel;
	//columns END

	public Region(){
	}

	public Region(
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
	public void setParentId(java.lang.Long value) {
		this.parentId = value;
	}
	
	public java.lang.Long getParentId() {
		return this.parentId;
	}
	public void setFullName(java.lang.String value) {
		this.fullName = value;
	}
	
	public java.lang.String getFullName() {
		return this.fullName;
	}
	public void setTreePath(java.lang.String value) {
		this.treePath = value;
	}
	
	public java.lang.String getTreePath() {
		return this.treePath;
	}
	public void setLevel(java.lang.Integer value) {
		this.level = value;
	}
	
	public java.lang.Integer getLevel() {
		return this.level;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
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
		if(obj instanceof Region == false) return false;
		if(this == obj) return true;
		Region other = (Region)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

