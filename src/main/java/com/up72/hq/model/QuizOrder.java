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
 * 竞猜订单
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class QuizOrder  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "竞猜订单";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_QUIZ_SELECT_ID = "竞猜选项ID";
	public static final String ALIAS_HQ_QUIZ_QUESTIO_ID = "竞猜问题ID";
	public static final String ALIAS_HQ_CROWD_ID = "众筹项目ID";
	public static final String ALIAS_QUIZ_MONEY = "竞猜金额";
	public static final String ALIAS_QUIZ_RETURN = "竞猜回报";
	public static final String ALIAS_MEMBER_ID = "竞猜用户ID";
	public static final String ALIAS_ADD_TIME = "竞猜时间";
	public static final String ALIAS_IS_SUCCESS = "竞猜是否成功（0-未结束，1-成功，2-失败）";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 竞猜选项ID       db_column: HQ_QUIZ_SELECT_ID
     */
	@NotNull
	private java.lang.Long hqQuizSelectId;
    /**
     * 竞猜问题ID       db_column: HQ_QUIZ_QUESTIO_ID 
     */	
	
	private java.lang.Long hqQuizQuestioId;
    /**
     * 众筹项目ID       db_column: HQ_CROWD_ID 
     */	
//	@NotNull
	private java.lang.Long hqCrowdId;
    /**
     * 竞猜金额       db_column: QUIZ_MONEY 
     */	
	@NotNull 
	private java.lang.Integer quizMoney;
    /**
     * 竞猜回报/竞猜赔率       db_column: QUIZ_RETURN 
     */	
	@NotNull 
	private java.lang.Integer quizReturn;
    /**
     * 竞猜用户ID       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 竞猜时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 竞猜是否成功（0-未结束，1-成功，2-失败）       db_column: IS_SUCCESS 
     */	
	@NotNull 
	private Integer isSuccess;
	//columns END

	public QuizOrder(){
	}

	public QuizOrder(
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
	public void setHqQuizSelectId(java.lang.Long value) {
		this.hqQuizSelectId = value;
	}
	
	public java.lang.Long getHqQuizSelectId() {
		return this.hqQuizSelectId;
	}
	public void setHqQuizQuestioId(java.lang.Long value) {
		this.hqQuizQuestioId = value;
	}
	
	public java.lang.Long getHqQuizQuestioId() {
		return this.hqQuizQuestioId;
	}
	public void setHqCrowdId(java.lang.Long value) {
		this.hqCrowdId = value;
	}
	
	public java.lang.Long getHqCrowdId() {
		return this.hqCrowdId;
	}
	public void setQuizMoney(java.lang.Integer value) {
		this.quizMoney = value;
	}
	
	public java.lang.Integer getQuizMoney() {
		return this.quizMoney;
	}
	public void setQuizReturn(java.lang.Integer value) {
		this.quizReturn = value;
	}
	
	public java.lang.Integer getQuizReturn() {
		return this.quizReturn;
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
	public void setIsSuccess(Integer value) {
		this.isSuccess = value;
	}
	
	public Integer getIsSuccess() {
		return this.isSuccess;
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
		if(obj instanceof QuizOrder == false) return false;
		if(this == obj) return true;
		QuizOrder other = (QuizOrder)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

