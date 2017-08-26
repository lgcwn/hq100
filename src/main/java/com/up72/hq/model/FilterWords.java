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
 * 过滤词
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class FilterWords  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "评论管理";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_WORDS = "过滤词语";
	public static final String ALIAS_REPLACE_WORDS = "替换词语";
	public static final String ALIAS_ADD_TIME = "添加时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 词语       db_column: WORDS 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String words;
    /**
     * 替换词       db_column: REPLACE_WORDS 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String replaceWords;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
	//columns END

	public FilterWords(){
	}

	public FilterWords(
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
	public void setWords(java.lang.String value) {
		this.words = value;
	}
	
	public java.lang.String getWords() {
		return this.words;
	}
	public void setReplaceWords(java.lang.String value) {
		this.replaceWords = value;
	}
	
	public java.lang.String getReplaceWords() {
		return this.replaceWords;
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
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof FilterWords == false) return false;
		if(this == obj) return true;
		FilterWords other = (FilterWords)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

