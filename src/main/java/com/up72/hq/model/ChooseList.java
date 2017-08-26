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
 * (评选名单)
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ChooseList  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "评选名单";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_HQ_CHOOSE_ID = "(评选之最id)";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_IMG = "图片";
	public static final String ALIAS_REAL_VOTES = "真实票数";
	public static final String ALIAS_VIRTUAL_VOTES = "虚拟票数";
	public static final String ALIAS_ADD_TIME = "创建时间";
	public static final String ALIAS_CONTENT = "评选简介";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * (评选之最id)       db_column: HQ_CHOOSE_ID 
     */	
	@NotNull 
	private java.lang.Long hqChooseId;
    /**
     * (名称)       db_column: NAME 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String name;
    /**
     * 图片       db_column: IMG 
     */	
	@NotBlank @Length(max=500)
	private java.lang.String img;
    /**
     * (真实票数)       db_column: REAL_VOTES 
     */	
	
	private java.lang.Long realVotes;
    /**
     * (虚拟票数)       db_column: VIRTUAL_VOTES 
     */	
	
	private java.lang.Long virtualVotes;
    /**
     * (创建时间)       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 评选简介       db_column: CONTENT 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String content;
	//columns END

	public ChooseList(){
	}

	public ChooseList(
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
	public void setHqChooseId(java.lang.Long value) {
		this.hqChooseId = value;
	}
	
	public java.lang.Long getHqChooseId() {
		return this.hqChooseId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setRealVotes(java.lang.Long value) {
		this.realVotes = value;
	}
	
	public java.lang.Long getRealVotes() {
		return this.realVotes;
	}
	public void setVirtualVotes(java.lang.Long value) {
		this.virtualVotes = value;
	}
	
	public java.lang.Long getVirtualVotes() {
		return this.virtualVotes;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
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
		if(obj instanceof ChooseList == false) return false;
		if(this == obj) return true;
		ChooseList other = (ChooseList)obj;
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


}

