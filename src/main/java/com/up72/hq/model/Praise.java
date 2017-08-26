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
 * 我的点赞
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Praise  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "我的点赞";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_MEMBER_ID = "会员ID";
	public static final String ALIAS_TYPE = "点赞对象类型(1-资讯;2-评论点)";
	public static final String ALIAS_SOURCE_ID = "点赞id(根据收藏对象类型来存储其对应id)";
	public static final String ALIAS_IS_SUPPORT = "是否支持";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 会员ID       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 点赞对象类型(1-资讯;2-评论点)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 点赞id(根据收藏对象类型来存储其对应id)       db_column: SOURCE_ID 
     */	
	
	private java.lang.Long sourceId;
    /**
     * 是否支持(点赞 0，点踩 1)       db_column: IS_SUPPORT
     */	
	
	private Integer isSupport;
	//columns END

	public Praise(){
	}

	public Praise(
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
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setSourceId(java.lang.Long value) {
		this.sourceId = value;
	}
	
	public java.lang.Long getSourceId() {
		return this.sourceId;
	}
	public void setIsSupport(Integer value) {
		this.isSupport = value;
	}
	
	public Integer getIsSupport() {
		return this.isSupport;
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
		if(obj instanceof Praise == false) return false;
		if(this == obj) return true;
		Praise other = (Praise)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

