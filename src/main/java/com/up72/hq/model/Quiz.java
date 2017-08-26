/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.constant.Cnst;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 竞猜
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Quiz  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "竞猜";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_TITLE = "主题";
	public static final String ALIAS_ARENA_ID = "所属赛场";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_ISSUE_TIME = "发布时间";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_STATUS = "状态(0-待发布;1-已发布)";



	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 主题       db_column: TITLE 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String title;
    /**
     * 所属赛场       db_column: ARENA_ID 
     */	
	@NotNull 
	private java.lang.Long arenaId;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	@NotNull 
	private java.lang.Long startTime;
    /**
     * 结束时间       db_column: END_TIME 
     */	
	@NotNull 
	private java.lang.Long endTime;
    /**
     * 发布时间       db_column: ISSUE_TIME 
     */	
	@NotNull 
	private java.lang.Long issueTime;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
	/**
	 * 状态(0-待发布;1-已发布)       db_column: STATUS
	 */
	@NotNull
	private Integer status;
	/**
	 * 自动发布或手动发布(0-自动;1-手动)       db_column: AUTO_OR_MANUALLY
	 */
	@NotNull
	private Integer autoOrManually;
	/**
	 * 展示图片      db_column: IMG
	 */
	@Length(max=500)
	private java.lang.String img;
	/** 竞猜资讯       数据库字段: CONTENT */
	@Length(max=16777215)
	private String content;


	//columns END

	//开始时间串
	private String startTimeStr;
	//结束时间串
	private String endTimeStr;
	private String issueTimeStr;


	public Quiz(){
	}

	public Quiz(
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
	public void setArenaId(java.lang.Long value) {
		this.arenaId = value;
	}
	
	public java.lang.Long getArenaId() {
		return this.arenaId;
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
	public void setIssueTime(java.lang.Long value) {
		this.issueTime = value;
	}
	
	public java.lang.Long getIssueTime() {
		return this.issueTime;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String getStartTimeStr() {
		return Cnst.getFormatTime(getStartTime());
	}

	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}

	public String getEndTimeStr() {
		return Cnst.getFormatTime(getEndTime());
	}


	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
		Long endTime=null;
		try{
			endTime= Cnst.stringToLong(endTimeStr);
		}catch (Exception e){
			e.printStackTrace();
		}
		this.setEndTime(endTime);
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIssueTimeStr() {
		return Cnst.getFormatTime(getIssueTime());
	}

	public void setIssueTimeStr(String issueTimeStr) {
		this.issueTimeStr = issueTimeStr;
		Long issueTime=null;
		try{
			issueTime= Cnst.stringToLong(issueTimeStr);
		}catch (Exception e){
			e.printStackTrace();
		}
		this.setIssueTime(issueTime);
	}


	public Integer getAutoOrManually() {
		return autoOrManually;
	}

	public void setAutoOrManually(Integer autoOrManually) {
		this.autoOrManually = autoOrManually;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Quiz == false) return false;
		if(this == obj) return true;
		Quiz other = (Quiz)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

