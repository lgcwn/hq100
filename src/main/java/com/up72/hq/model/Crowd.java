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
 * 众筹
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Crowd  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "众筹";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CAT_ID = "分类";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_IMG = "项目图片";
	public static final String ALIAS_DAYS = "募款天数";
	public static final String ALIAS_TARGET_AMOUNT = "目标金额";
	public static final String ALIAS_PROJECT_OVERVIEW = "项目概述";
	public static final String ALIAS_PROJECT_INTRO = "项目介绍";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_STATUS = "状态";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 分类       db_column: CAT_ID 
     */	
	@NotNull 
	private java.lang.Long catId;
    /**
     * 名称       db_column: NAME 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String name;
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
     * 项目图片       db_column: IMG 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String img;
    /**
     * 募款天数       db_column: DAYS 
     */	
	@NotNull 
	private java.lang.Integer days;
    /**
     * 目标金额       db_column: TARGET_AMOUNT 
     */	
	@NotNull 
	private java.lang.Long targetAmount;
    /**
     * 项目概述       db_column: PROJECT_OVERVIEW 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String projectOverview;
    /**
     * 项目介绍       db_column: PROJECT_INTRO 
     */	
	@NotBlank @Length(max=2147483647)
	private java.lang.String projectIntro;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 状态       db_column: STATUS 
     */	
	@NotNull 
	private Integer status;
	//columns END

	public Crowd(){
	}

	public Crowd(
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
	public void setStartTime(java.lang.Long value) {
		this.startTime = value;
	}
	
	public java.lang.Long getStartTime() {
		return this.startTime;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setDays(java.lang.Integer value) {
		this.days = value;
	}
	
	public java.lang.Integer getDays() {
		return this.days;
	}
	public void setTargetAmount(java.lang.Long value) {
		this.targetAmount = value;
	}
	
	public java.lang.Long getTargetAmount() {
		return this.targetAmount;
	}
	public void setProjectOverview(java.lang.String value) {
		this.projectOverview = value;
	}
	
	public java.lang.String getProjectOverview() {
		return this.projectOverview;
	}
	public void setProjectIntro(java.lang.String value) {
		this.projectIntro = value;
	}
	
	public java.lang.String getProjectIntro() {
		return this.projectIntro;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
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
		if(obj instanceof Crowd == false) return false;
		if(this == obj) return true;
		Crowd other = (Crowd)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

