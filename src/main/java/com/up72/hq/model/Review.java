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
 * 评论
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Review  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "评论管理";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_CAT_ID = "分类";
	public static final String ALIAS_CONTENT = "评论内容";
	public static final String ALIAS_ADD_TIME = "评论时间";
	public static final String ALIAS_MEMBER_ID = "评论人";
	public static final String ALIAS_SOURCE_ID = "评论id(根据评论对象类型来存储其对应id)";
	public static final String ALIAS_ID_PATH = "评论上级ID路径，如：1,2,3";
    public static final String ALIAS_LIKE_NUM = "支持数量";
    public static final String ALIAS_HOOTING_NUM = "反对数量";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 首页菜单ID       db_column: CAT_ID 
     */	
	@NotNull 
	private java.lang.Long catId;
    /**
     * 内容       db_column: CONTENT 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String content;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 会员ID       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 评论id(根据评论对象类型来存储其对应id)       db_column: SOURCE_ID 
     */
	@NotNull
	private java.lang.Long sourceId;
    /**
     * 评论上级ID路径，如：1,2,3       db_column: ID_PATH 
     */	

	private java.lang.String idPath;

    /**
     * 点赞数量       db_column: LIKE_NUM
     */

    private java.lang.Integer likeNum;
    /**
     * 倒彩数量       db_column: HOOTING_NUM
     */

    private java.lang.Integer hootingNum;
	//columns END

	public Review(){
	}

	public Review(
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
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setSourceId(java.lang.Long value) {
		this.sourceId = value;
	}
	
	public java.lang.Long getSourceId() {
		return this.sourceId;
	}
	public void setIdPath(java.lang.String value) {
		this.idPath = value;
	}
	
	public java.lang.String getIdPath() {
		return this.idPath;
	}
    public void setLikeNum(java.lang.Integer value) {
        this.likeNum = value;
    }

    public java.lang.Integer getLikeNum() {
        return this.likeNum;
    }
    public void setHootingNum(java.lang.Integer value) {
        this.hootingNum = value;
    }

    public java.lang.Integer getHootingNum() {
        return this.hootingNum;
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
		if(obj instanceof Review == false) return false;
		if(this == obj) return true;
		Review other = (Review)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

