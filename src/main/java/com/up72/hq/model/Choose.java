/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.utils.CodeEncryption;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * (评选之最)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Choose  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "(评选之最)";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_YEAR = "年份";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_STATUS = "状态（1-未开始，2-进行中，3-已结束）";
	public static final String ALIAS_CREATOR = "创建者";
	public static final String ALIAS_ADD_TIME = "创建时间";
	public static final String ALIAS_TYPE = "类型(1-评选之最;2-时事评选)";
	public static final String ALIAS_BANNER = "banner图";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
	/**
	 * 资讯ID
     */
	private java.lang.Long newsId;
	/**
	 * 资讯名称
	 */
	private java.lang.Long newsName;
    /**
     * 标题       db_column: TITLE 
     */	
	@Length(max=20)
	private java.lang.String title;
    /**
     * 年份       db_column: YEAR 
     */	
	@Length(max=5)
	private java.lang.String year;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	
	private java.lang.Long startTime;
    /**
     * 结束时间       db_column: END_TIME 
     */	
	
	private java.lang.Long endTime;
    /**
     * 状态（1-未开始，2-进行中，3-已结束,4-已下架）       db_column: STATUS
     */	
	
	private Integer status;
    /**
     * 创建者       db_column: CREATOR 
     */	
	
	private java.lang.Long creator;
    /**
     * 创建时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 类型(1-评选之最;2-时事评选)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * banner图       db_column: BANNER 
     */	
	@NotBlank @Length(max=250)
	private java.lang.String banner;

	/**
	 * 允许投票次数      db_column: VOTE_CNT
	 */
	@NotNull
	private Integer voteCnt;
	//columns END

	public Choose(){
	}

	public Choose(
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
	public void setTitle(java.lang.String value) {
		this.title = value;
	}
	
	public java.lang.String getTitle() {
		return this.title;
	}
	public void setYear(java.lang.String value) {
		this.year = value;
	}
	
	public java.lang.String getYear() {
		return this.year;
	}
	public void setStartTime(java.lang.Long value) {
		this.startTime = value;
	}
	
	public java.lang.Long getStartTime() {
		return this.startTime;
	}
	public void setEndTime(java.lang.Long value) {
		this.endTime = value;
	}
	
	public java.lang.Long getEndTime() {
		return this.endTime;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setCreator(java.lang.Long value) {
		this.creator = value;
	}
	
	public java.lang.Long getCreator() {
		return this.creator;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setBanner(java.lang.String value) {
		this.banner = value;
	}
	
	public java.lang.String getBanner() {
		return this.banner;
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
		if(obj instanceof Choose == false) return false;
		if(this == obj) return true;
		Choose other = (Choose)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	/**
	 * id 密文
	 */
	private String idCipher;
	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}

	public Integer getVoteCnt() {
		return voteCnt;
	}

	public void setVoteCnt(Integer voteCnt) {
		this.voteCnt = voteCnt;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

	public Long getNewsName() {
		return newsName;
	}

	public void setNewsName(Long newsName) {
		this.newsName = newsName;
	}
}

