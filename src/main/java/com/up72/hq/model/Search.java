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
 * 搜索表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Search  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "搜索表";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_HQ_MENU_ID = "菜单ID";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_LINK = "链接";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 菜单ID       db_column: HQ_MENU_ID 
     */	
	@NotNull 
	private java.lang.Long hqMenuId;
    /**
     * 标题       db_column: TITLE 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String title;
    /**
     * 链接       db_column: LINK 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String link;
	//columns END

	public Search(){
	}

	public Search(
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
	public void setHqMenuId(java.lang.Long value) {
		this.hqMenuId = value;
	}
	
	public java.lang.Long getHqMenuId() {
		return this.hqMenuId;
	}
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setLink(java.lang.String value) {
		this.link = value;
	}
	
	public java.lang.String getLink() {
		return this.link;
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
		if(obj instanceof Search == false) return false;
		if(this == obj) return true;
		Search other = (Search)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

