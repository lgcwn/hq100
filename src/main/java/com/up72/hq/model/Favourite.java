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
 * 我的收藏
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Favourite  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "我的收藏";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_MEMBER_ID = "基础用户id";
	public static final String ALIAS_TYPE = "收藏对象类型(1-评选;2-视频;3-资讯;4-商品)";
	public static final String ALIAS_SOURCE_ID = "收藏id(根据收藏对象类型来存储其对应id)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 基础用户id       db_column: MEMBER_ID
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 收藏对象类型(1-评选;2-视频;3-资讯;4-商品)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 收藏id(根据收藏对象类型来存储其对应id)       db_column: SOURCE_ID 
     */	
	
	private java.lang.Long sourceId;
	//columns END

	public Favourite(){
	}

	public Favourite(
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

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Favourite == false) return false;
		if(this == obj) return true;
		Favourite other = (Favourite)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

