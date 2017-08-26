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
 * 标签
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Tag  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "标签";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CAT_ID = "分类id";
	public static final String ALIAS_NAME = "标签名称";
	public static final String ALIAS_ICON = "标签图片";
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
     * 标签名称       db_column: NAME 
     */	
	@NotBlank @Length(max=256)
	private java.lang.String name;
    /**
     * 标签图片       db_column: ICON 
     */	
	@Length(max=256)
	private java.lang.String icon;
    /**
     * 排序id       db_column: SORT_ID 
     */	
	@NotNull 
	private java.lang.Long sortId;

	private java.lang.Integer isShowInHome;
	//columns END

	public Tag(){
	}

	public Tag(
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
	public void setIcon(java.lang.String value) {
		this.icon = value;
	}
	
	public java.lang.String getIcon() {
		return this.icon;
	}
	public void setSortId(java.lang.Long value) {
		this.sortId = value;
	}
	
	public java.lang.Long getSortId() {
		return this.sortId;
	}

	public Integer getIsShowInHome() {
		return isShowInHome;
	}

	public void setIsShowInHome(Integer isShowInHome) {
		this.isShowInHome = isShowInHome;
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
		if(obj instanceof Tag == false) return false;
		if(this == obj) return true;
		Tag other = (Tag)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

