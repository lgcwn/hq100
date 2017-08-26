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
 * 反馈建议
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Feedback  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "反馈建议";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_CONTENT = "内容";
	public static final String ALIAS_FULL_NAME = "姓名";
	public static final String ALIAS_EMAIL = "邮件";
	public static final String ALIAS_CONTACT_PHONE = "联系电话";
	public static final String ALIAS_ADD_TIME = "添加时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * ID       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 内容       db_column: CONTENT 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String content;
    /**
     * 姓名       db_column: FULL_NAME 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String fullName;
    /**
     * 邮件       db_column: EMAIL 
     */	
	@Length(max=20)
	private java.lang.String email;
    /**
     * 联系电话       db_column: CONTACT_PHONE 
     */	
	@Length(max=11)
	private java.lang.String contactPhone;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;

	private String addTimeStr;

	//columns END

	public Feedback(){
	}

	public Feedback(
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
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setFullName(java.lang.String value) {
		this.fullName = value;
	}
	
	public java.lang.String getFullName() {
		return this.fullName;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setContactPhone(java.lang.String value) {
		this.contactPhone = value;
	}
	
	public java.lang.String getContactPhone() {
		return this.contactPhone;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}


	public String getAddTimeStr() {
		return Cnst.getFormatTime(getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
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
		if(obj instanceof Feedback == false) return false;
		if(this == obj) return true;
		Feedback other = (Feedback)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

