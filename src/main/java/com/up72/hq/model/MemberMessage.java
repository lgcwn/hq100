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
 * 用户消息
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class MemberMessage  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "用户消息";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_MEMBER_ID = "基础用户id";
	public static final String ALIAS_CONTENT = "消息内容";
	public static final String ALIAS_TYPE = "消息类型(1 系统消息; 2用户消息 )";
	public static final String ALIAS_STATUS = "消息阅读状态(0未读;1已读)";
	public static final String ALIAS_IS_DEL = "用户是否删除( 0 否 1是)";
	public static final String ALIAS_ADD_TIME = "消息接收时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 基础用户id       db_column: HQ_MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long hqMemberId;
    /**
     * 消息内容       db_column: TITLE
     */	
	@NotBlank @Length(max=256)
	private java.lang.String title;
    /**
     * 消息内容       db_column: CONTENT
     */
	@NotBlank @Length(max=256)
	private java.lang.String content;
    /**
     * 消息类型(1 系统消息; 2用户消息 )       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 标签ID       db_column: Column_8 
     */	
	
	private java.lang.Long column8;
    /**
     * 消息阅读状态(0未读;1已读)       db_column: STATUS 
     */	
	@NotNull 
	private Integer status;
    /**
     * 用户是否删除( 0 否 1是)       db_column: IS_DEL 
     */	
	
	private Integer isDel;
    /**
     * 消息接收时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;


	//columns END

	public MemberMessage(){
	}

	public MemberMessage(
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
	public void setHqMemberId(java.lang.Long value) {
		this.hqMemberId = value;
	}
	
	public java.lang.Long getHqMemberId() {
		return this.hqMemberId;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setColumn8(java.lang.Long value) {
		this.column8 = value;
	}
	
	public java.lang.Long getColumn8() {
		return this.column8;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		if(obj instanceof MemberMessage == false) return false;
		if(this == obj) return true;
		MemberMessage other = (MemberMessage)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

