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
 * 会员收货地址
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class MemberAddress  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "会员收货地址";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_HQ_MEMBER_ID = "基础用户id";
	public static final String ALIAS_MEMBER_NAME = "会员姓名";
	public static final String ALIAS_PHONE = "联系电话";
	public static final String ALIAS_PROVINCE_ID = "省ID";
	public static final String ALIAS_CITY_ID = "市ID";
	public static final String ALIAS_COUNTY_ID = "区或县ID";
	public static final String ALIAS_DETAIL_ADDRESS = "详细地址";
	public static final String ALIAS_POSTAL_CODE = "邮政编码";
	public static final String ALIAS_EMAIL = "电子邮件";
	public static final String ALIAS_IS_DEFAULT = "是否是默认地址(0-否;1-是)";
	public static final String ALIAS_IS_DEL = "是否删除(0-否;1-是)";
	public static final String ALIAS_TOWN_ID = "城镇id";
	public static final String ALIAS_VILLAGE_ID = "村庄id";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 基础用户id       db_column: HQ_MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long hqMemberId;
    /**
     * 会员姓名       db_column: MEMBER_NAME 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String memberName;
    /**
     * 联系电话       db_column: PHONE 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String phone;
    /**
     * 省ID       db_column: PROVINCE_ID 
     */	
	@NotNull 
	private java.lang.Long provinceId;
    /**
     * 市ID       db_column: CITY_ID 
     */	
	@NotNull 
	private java.lang.Long cityId;
    /**
     * 区或县ID       db_column: COUNTY_ID 
     */	
	@NotNull 
	private java.lang.Long countyId;
    /**
     * 详细地址       db_column: DETAIL_ADDRESS 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String detailAddress;
    /**
     * 邮政编码       db_column: POSTAL_CODE 
     */	
	@Length(max=100)
	private java.lang.String postalCode;
    /**
     * 电子邮件       db_column: EMAIL 
     */	
	@Length(max=100)
	private java.lang.String email;
    /**
     * 是否是默认地址(0-否;1-是)       db_column: IS_DEFAULT 
     */	
	@NotNull 
	private Integer isDefault;
    /**
     * 是否删除(0-否;1-是)       db_column: IS_DEL 
     */	
	@NotNull 
	private Integer isDel;
    /**
     * 城镇id       db_column: TOWN_ID 
     */	
	
	private java.lang.Long townId;
    /**
     * 村庄id       db_column: VILLAGE_ID 
     */	
	
	private java.lang.Long villageId;
	//columns END

	public MemberAddress(){
	}

	public MemberAddress(
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
	public void setHqMemberId(java.lang.Long value) {
		this.hqMemberId = value;
	}
	
	public java.lang.Long getHqMemberId() {
		return this.hqMemberId;
	}
	public void setMemberName(java.lang.String value) {
		this.memberName = value;
	}
	
	public java.lang.String getMemberName() {
		return this.memberName;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setProvinceId(java.lang.Long value) {
		this.provinceId = value;
	}
	
	public java.lang.Long getProvinceId() {
		return this.provinceId;
	}
	public void setCityId(java.lang.Long value) {
		this.cityId = value;
	}
	
	public java.lang.Long getCityId() {
		return this.cityId;
	}
	public void setCountyId(java.lang.Long value) {
		this.countyId = value;
	}
	
	public java.lang.Long getCountyId() {
		return this.countyId;
	}
	public void setDetailAddress(java.lang.String value) {
		this.detailAddress = value;
	}
	
	public java.lang.String getDetailAddress() {
		return this.detailAddress;
	}
	public void setPostalCode(java.lang.String value) {
		this.postalCode = value;
	}
	
	public java.lang.String getPostalCode() {
		return this.postalCode;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setIsDefault(Integer value) {
		this.isDefault = value;
	}
	
	public Integer getIsDefault() {
		return this.isDefault;
	}
	public void setIsDel(Integer value) {
		this.isDel = value;
	}
	
	public Integer getIsDel() {
		return this.isDel;
	}
	public void setTownId(java.lang.Long value) {
		this.townId = value;
	}
	
	public java.lang.Long getTownId() {
		return this.townId;
	}
	public void setVillageId(java.lang.Long value) {
		this.villageId = value;
	}
	
	public java.lang.Long getVillageId() {
		return this.villageId;
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
		if(obj instanceof MemberAddress == false) return false;
		if(this == obj) return true;
		MemberAddress other = (MemberAddress)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

