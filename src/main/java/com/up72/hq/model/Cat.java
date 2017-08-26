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
 * 分类
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Cat  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "分类";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ID_PATH = "分类上级ID路径，如：1,2,3";
	public static final String ALIAS_ROOT_ID = "根节点ID";
	public static final String ALIAS_PARENT_ID = "父节点ID";
	public static final String ALIAS_NAME = "分类名称";
	public static final String ALIAS_SORT_ID = "排序";
	public static final String ALIAS_LEVEL = "级别";
	public static final String ALIAS_IS_LEAF = "是否为叶子节点";
	public static final String ALIAS_TYPE = "分类类型(1-免税;2-虚拟;3-积分;4-明星;5-视频;6-众筹;7-资讯;)";
	public static final String ALIAS_IMG = "图标";
	public static final String ALIAS_SYNOPSIS = "简介";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 分类上级ID路径，如：1,2,3       db_column: ID_PATH 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String idPath;
    /**
     * 根节点ID       db_column: ROOT_ID 
     */	
	@NotNull 
	private java.lang.Long rootId;
    /**
     * 父节点ID       db_column: PARENT_ID 
     */	
	private java.lang.Long parentId;
    /**
     * 分类名称       db_column: NAME 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String name;
    /**
     * 简介       db_column: SYNOPSIS
     */
	@NotBlank @Length(max=256)
	private java.lang.String synopsis;
    /**
     * 排序       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;
    /**
     * 级别       db_column: LEVEL 
     */	
	@NotNull 
	private java.lang.Integer level;
    /**
     * 是否为叶子节点       db_column: IS_LEAF 
     */	
	
	private java.lang.Integer isLeaf;
    /**
     * 分类类型(1-免税;2-虚拟;3-积分;4-明星;5-视频;6-众筹;7-资讯;8-旅游)       db_column: TYPE
     */	
	@NotNull 
	private Integer type;
    /**
     * 图标       db_column: IMG 
     */	
	@Length(max=100)
	private java.lang.String img;
	//columns END

	public Cat(){
	}

	public Cat(
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
	public void setIdPath(java.lang.String value) {
		this.idPath = value;
	}
	
	public java.lang.String getIdPath() {
		return this.idPath;
	}
	public void setRootId(java.lang.Long value) {
		this.rootId = value;
	}
	
	public java.lang.Long getRootId() {
		return this.rootId;
	}
	public void setParentId(java.lang.Long value) {
		this.parentId = value;
	}
	
	public java.lang.Long getParentId() {
		return this.parentId;
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
	public void setLevel(java.lang.Integer value) {
		this.level = value;
	}
	
	public java.lang.Integer getLevel() {
		return this.level;
	}
	public void setIsLeaf(java.lang.Integer value) {
		this.isLeaf = value;
	}
	
	public java.lang.Integer getIsLeaf() {
		return this.isLeaf;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
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
		if(obj instanceof Cat == false) return false;
		if(this == obj) return true;
		Cat other = (Cat)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

