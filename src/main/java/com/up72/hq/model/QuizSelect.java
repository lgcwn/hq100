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
 * 竞猜选项
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class QuizSelect  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "竞猜选项";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_QUIZ_QUESTIO_ID = "hqQuizQuestioId";
	public static final String ALIAS_NAME = "选项名称";
	public static final String ALIAS_ODDS = "赔率";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * hqQuizQuestioId       db_column: HQ_QUIZ_QUESTIO_ID 
     */	
	
	private java.lang.Long hqQuizQuestioId;
    /**
     * 选项名称       db_column: NAME 
     */	
	@Length(max=50)
	private java.lang.String name;
    /**
     * 赔率       db_column: ODDS 
     */	
	@Length(max=5)
	private java.lang.String odds;
	//columns END

	public QuizSelect(){
	}

	public QuizSelect(
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
	public void setHqQuizQuestioId(java.lang.Long value) {
		this.hqQuizQuestioId = value;
	}
	
	public java.lang.Long getHqQuizQuestioId() {
		return this.hqQuizQuestioId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setOdds(java.lang.String value) {
		this.odds = value;
	}
	
	public java.lang.String getOdds() {
		return this.odds;
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
		if(obj instanceof QuizSelect == false) return false;
		if(this == obj) return true;
		QuizSelect other = (QuizSelect)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

