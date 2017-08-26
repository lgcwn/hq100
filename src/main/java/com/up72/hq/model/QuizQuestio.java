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
 * 竞猜问题
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class QuizQuestio  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "竞猜问题";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_QUIZ_ID = "竞猜ID";
	public static final String ALIAS_NAME = "题目名称";
	public static final String ALIAS_STATUS = "状态";
	public static final String SELECT_ID = "问题答案";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 竞猜ID       db_column: QUIZ_ID 
     */	
	
	private java.lang.Long quizId;
    /**
     * 问题答案       db_column: SELECT_ID
     */

	private java.lang.Long selectId;
    /**
     * 题目名称       db_column: NAME 
     */	
	@Length(max=100)
	private java.lang.String name;
    /**
     * 状态       db_column: STATUS 
     */	
	
	private Integer status;
	//columns END

	public QuizQuestio(){
	}

	public QuizQuestio(
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
	public void setQuizId(java.lang.Long value) {
		this.quizId = value;
	}
	
	public java.lang.Long getQuizId() {
		return this.quizId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}

	public Long getSelectId() {
		return selectId;
	}

	public void setSelectId(Long selectId) {
		this.selectId = selectId;
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
		if(obj instanceof QuizQuestio == false) return false;
		if(this == obj) return true;
		QuizQuestio other = (QuizQuestio)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

