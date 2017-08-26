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
 * 角色管理
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RoleManager  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "角色管理";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ROLE_SELECT_ID = "角色选拔ID";
	public static final String ALIAS_NAME = "角色名称";
	public static final String ALIAS_ACTOR_CNT = "演员数量";
	public static final String ALIAS_GENDER = "性别";
	public static final String ALIAS_IMG = "图片";
	public static final String ALIAS_RULES = "选拔规则";
	public static final String ALIAS_REMARK = "报名须知";
	public static final String ALIAS_INTRO = "简介详情";
	public static final String IS_DELETE = "上下架（0-下架，1-上架）";
	public static final String ALIAS_GET_POINTS = "获得积分";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 角色选拔ID       db_column: ROLE_SELECT_ID
     */	
	@NotNull 
	private java.lang.Long roleSelectId;
    /**
     * (角色名称)       db_column: NAME 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String name;
    /**
     * (演员数量)       db_column: ACTOR_CNT 
     */	
	@NotNull 
	private java.lang.Integer actorCnt;
    /**
     * (性别)       db_column: GENDER 
     */	
	@NotNull 
	private Integer gender;
    /**
     * 图片       db_column: IMG 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String img;
    /**
     * (选拔规则)       db_column: RULES 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String rules;
    /**
     * (报名须知)       db_column: REMARK 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String remark;
    /**
     * (简介)       db_column: INTRO
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String intro;
    /**
     * (详情)       db_column: DETAILS
     */
	@NotBlank @Length(max=2147483647)
	private java.lang.String details;
	//columns END

	/**
	 * 添加时间       db_column: ADD_TIME
	 */
	@NotNull
	private java.lang.Long addTime;
	/**
	 * 排序ID       db_column: SORT_ID
	 */
	@NotNull
	private java.lang.Long sortId;
	/**
	 * 排序ID       db_column: IS_DELETE
	 */
	@NotNull
	private java.lang.Integer isDelete;
	/**
	 * 报名费       db_column: SIGN_MONEY
	 */
	@NotNull
	private java.lang.Integer signMoney;

	/**
	 * 获得积分       db_column: GIVE_POINTS
	 */

	private java.lang.Integer givePoints;

	/**
	 * id 密文
	 */
	private String idCipher;

	public RoleManager(){
	}

	public RoleManager(
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
	public void setRoleSelectId(java.lang.Long value) {
		this.roleSelectId = value;
	}
	
	public java.lang.Long getRoleSelectId() {
		return this.roleSelectId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setActorCnt(java.lang.Integer value) {
		this.actorCnt = value;
	}
	
	public java.lang.Integer getActorCnt() {
		return this.actorCnt;
	}
	public void setGender(Integer value) {
		this.gender = value;
	}
	
	public Integer getGender() {
		return this.gender;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setRules(java.lang.String value) {
		this.rules = value;
	}
	
	public java.lang.String getRules() {
		return this.rules;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setIntro(java.lang.String value) {
		this.intro = value;
	}
	
	public java.lang.String getIntro() {
		return this.intro;
	}


	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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
		if(obj instanceof RoleManager == false) return false;
		if(this == obj) return true;
		RoleManager other = (RoleManager)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public Long getSortId() {
		return sortId;
	}

	public void setSortId(Long sortId) {
		this.sortId = sortId;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getSignMoney() {
		return signMoney;
	}

	public void setSignMoney(Integer signMoney) {
		this.signMoney = signMoney;
	}


	public Integer getGivePoints() {
		return givePoints;
	}

	public void setGivePoints(Integer givePoints) {
		this.givePoints = givePoints;
	}

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}
}

