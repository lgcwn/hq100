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
 * 众筹项目进展
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ProjectProgress  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "众筹项目进展";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CROWD_ID = "crowdId";
	public static final String ALIAS_IMG = "项目图片";
	public static final String ALIAS_PROJECT_OVERVIEW = "项目概述";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * crowdId       db_column: CROWD_ID 
     */	
	
	private java.lang.Long crowdId;
    /**
     * 项目图片       db_column: IMG 
     */	
	@Length(max=500)
	private java.lang.String img;
    /**
     * 项目概述       db_column: PROJECT_OVERVIEW 
     */	
	@Length(max=1000)
	private java.lang.String projectOverview;
	/**
	 * 添加时间       db_column: ADD_TIME
	 */
	@NotNull
	private java.lang.Long addTime;
	//columns END

	public ProjectProgress(){
	}

	public ProjectProgress(
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
	public void setCrowdId(java.lang.Long value) {
		this.crowdId = value;
	}
	
	public java.lang.Long getCrowdId() {
		return this.crowdId;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setProjectOverview(java.lang.String value) {
		this.projectOverview = value;
	}
	
	public java.lang.String getProjectOverview() {
		return this.projectOverview;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
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
		if(obj instanceof ProjectProgress == false) return false;
		if(this == obj) return true;
		ProjectProgress other = (ProjectProgress)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

