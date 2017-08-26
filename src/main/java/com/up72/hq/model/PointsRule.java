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
 * 积分规则
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class PointsRule  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "积分规则";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "规则名称";
	public static final String ALIAS_SCORE = "积分T币";
	public static final String ALIAS_UPPER_LIMIT = "上限";
	public static final String ALIAS_ENABLE = "是否启用";
	public static final String ALIAS_TIME_LIMIT = "时间限制(1-一周；2-一个月；3-一年)";
	public static final String ALIAS_CONSTANT = "常量值";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 规则名称       db_column: NAME 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String name;
    /**
     * 积分T币       db_column: SCORE 
     */	
	@NotNull 
	private java.lang.Integer score;
    /**
     * 上限       db_column: UPPER_LIMIT 
     */	
	@NotBlank @Length(max=10)
	private java.lang.String upperLimit;
    /**
     * 是否启用       db_column: ENABLE 
     */	
	@NotNull 
	private java.lang.Integer enable;
    /**
     * 时间限制(1-一周；2-一个月；3-一年)       db_column: TIME_LIMIT 
     */	
	@NotNull 
	private java.lang.Integer timeLimit;
    /**
     * 常量值       db_column: CONSTANT 
     */	
	@NotNull 
	private java.lang.Integer constant;
	//columns END

	public PointsRule(){
	}

	public PointsRule(
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
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setScore(java.lang.Integer value) {
		this.score = value;
	}
	
	public java.lang.Integer getScore() {
		return this.score;
	}
	public void setUpperLimit(java.lang.String value) {
		this.upperLimit = value;
	}
	
	public java.lang.String getUpperLimit() {
		return this.upperLimit;
	}
	public void setEnable(java.lang.Integer value) {
		this.enable = value;
	}
	
	public java.lang.Integer getEnable() {
		return this.enable;
	}
	public void setTimeLimit(java.lang.Integer value) {
		this.timeLimit = value;
	}
	
	public java.lang.Integer getTimeLimit() {
		return this.timeLimit;
	}
	public void setConstant(java.lang.Integer value) {
		this.constant = value;
	}
	
	public java.lang.Integer getConstant() {
		return this.constant;
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
		if(obj instanceof PointsRule == false) return false;
		if(this == obj) return true;
		PointsRule other = (PointsRule)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

