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
 * 回复表
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Reply  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "回复表";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_REVIEW_ID = "评论ID";
	public static final String ALIAS_CONTENT = "回复内容";
	public static final String ALIAS_MEMBER_ID = "会员ID";
	public static final String ALIAS_ADD_TIME = "回复时间";
	public static final String ALIAS_ROOT_ID = "根节点ID";
	public static final String ALIAS_PARENT_ID = "父节点ID";
	public static final String ALIAS_COUNT_REPLY = "回复数量";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 评论ID       db_column: HQ_REVIEW_ID 
     */	
//	@NotNull
	private java.lang.Long hqReviewId;
    /**
     * 回复内容       db_column: CONTENT 
     */	
	@NotBlank @Length(max=300)
	private java.lang.String content;
    /**
     * 会员ID       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 回复时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;

    /**
     * 根节点ID       db_column: ROOT_ID 
     */	
//	@NotNull
	private java.lang.Long rootId;
    /**
     * 父节点ID       db_column: PARENT_ID 
     */	
	private java.lang.Long parentId;
	//columns END

	public Reply(){
	}

	public Reply(
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
	public void setHqReviewId(java.lang.Long value) {
		this.hqReviewId = value;
	}
	
	public java.lang.Long getHqReviewId() {
		return this.hqReviewId;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Reply == false) return false;
		if(this == obj) return true;
		Reply other = (Reply)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

