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
 * 个人用户
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Member  implements java.io.Serializable{

	//alias
	public static final String TABLE_ALIAS = "个人用户";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_NICK_NAME = "昵称";
	public static final String ALIAS_GENDER = "性别(0未知，1男，2女)";
	public static final String ALIAS_PROVINCE = "省";
	public static final String ALIAS_CITY = "市";
	public static final String ALIAS_HEAD_IMG = "头像";
	public static final String ALIAS_IS_PHONE = "是否绑定手机(0-否;1-是)";
	public static final String ALIAS_PHONE = "手机号码";
	public static final String ALIAS_IS_DELETE = "是否删除(0-否，1-是)";
	public static final String ALIAS_TYPE = "用户类型(1.普通用户)";
	public static final String ALIAS_PASSWORD = "密码";
	public static final String ALIAS_PAY_PASSWORD = "支付密码";
	public static final String ALIAS_BIRTHDAY = "生日";
	public static final String ALIAS_EMAIL = "邮箱";
	public static final String ALIAS_ADD_TIME = "注册时间";
	public static final String ALIAS_IS_DISABLE = "是否禁用(0否;1是)";
	public static final String ALIAS_USER_NAME = "用户名";
	public static final String ALIAS_SOURCE = "用户来源 (1 pc 2 wap ;3 qq用户; 4 微信用户; 5会员卡; 6  微博用户; 7 人人网; 8 支付宝; 9 百度);";
	public static final String ALIAS_IS_EMAIL = "是否邮箱验证(0-否;1-是)";
	public static final String ALIAS_DISABLE_REMARKS = "禁用备注";
	public static final String ALIAS_PASSWORD_LEVEL = "登录密码等级  0-100";
	public static final String ALIAS_EDU_INFO_ID2 = "职业信息ID";
	public static final String ALIAS_EDU_INFO_ID = "教育信息ID";
	public static final String ALIAS_IS_SYS_MESSAGE = "是否接收系统消息(0 不; 1 接受)";
	public static final String ALIAS_IS_SYS_NOTICE_MESSAGE = "是否接收系统公告(0 不; 1 接受)";
	public static final String ALIAS_TB = "T币";
	public static final String ALIAS_SCORE = "积分";
	public static final String ALIAS_INTRODUCE = "自我介绍";
	public static final String ALIAS_REAL_NAME = "真实姓名";
	public static final String ALIAS_ADDR = "联系地址";
	public static final String ALIAS_LEVEL = "等级1、2、3、4";
	public static final String ALIAS_PHOTOS = "个人相册";


	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	/**
	 * 主键       db_column: ID
	 */

	private java.lang.Long id;
	/**
	 * 昵称       db_column: NICK_NAME
	 */
	@NotBlank @Length(max=100)
	private java.lang.String nickName;
	/**
	 * 性别(0未知，1男，2女)       db_column: GENDER
	 */

	private Integer gender;
	/**
	 * 省       db_column: PROVINCE
	 */
	@Length(max=20)
	private java.lang.String province;
	/**
	 * 市       db_column: CITY
	 */
	@Length(max=20)
	private java.lang.String city;
	/**
	 * 头像       db_column: HEAD_IMG
	 */
	@Length(max=100)
	private java.lang.String headImg;
	/**
	 * 是否绑定手机(0-否;1-是)       db_column: IS_PHONE
	 */
	@NotNull
	private Integer isPhone;
	/**
	 * 手机号码       db_column: PHONE
	 */
	@Length(max=20)
	private java.lang.String phone;
	/**
	 * 是否删除(0-否，1-是)       db_column: IS_DELETE
	 */

	private Integer isDelete;
	/**
	 * 用户类型(1.普通用户)       db_column: TYPE
	 */

	private Integer type;
	/**
	 * 密码       db_column: PASSWORD
	 */
	@Length(max=50)
	private java.lang.String password;
	/**
	 * 支付密码       db_column: PAY_PASSWORD
	 */
	@Length(max=50)
	private java.lang.String payPassword;
	/**
	 * 生日       db_column: BIRTHDAY
	 */

	private java.lang.Long birthday;
	/**
	 * 邮箱       db_column: EMAIL
	 */
	@Length(max=50)
	private java.lang.String email;
	/**
	 * 注册时间       db_column: ADD_TIME
	 */
	@NotNull
	private java.lang.Long addTime;
	/**
	 * 是否禁用(0否;1是)       db_column: IS_DISABLE
	 */

	private Integer isDisable;
	/**
	 * 用户名       db_column: USER_NAME
	 */
	@Length(max=45)
	private java.lang.String userName;
	/**
	 * 用户来源 (1 pc 2 wap ;3 qq用户; 4 微信用户; 5会员卡; 6  微博用户; 7 人人网; 8 支付宝; 9 百度);       db_column: SOURCE
	 */

	private Integer source;
	/**
	 * 是否邮箱验证(0-否;1-是)       db_column: IS_EMAIL
	 */

	private Integer isEmail;
	/**
	 * 禁用备注       db_column: DISABLE_REMARKS
	 */
	@Length(max=100)
	private java.lang.String disableRemarks;
	/**
	 * 登录密码等级  0-100       db_column: PASSWORD_LEVEL
	 */

	private java.lang.Integer passwordLevel;
	/**
	 * 职业信息ID       db_column: EDU_INFO_ID2
	 */

	private java.lang.Long eduInfoId2;
	/**
	 * 教育信息ID       db_column: EDU_INFO_ID
	 */

	private java.lang.Long eduInfoId;
	/**
	 * 是否接收系统消息(0 不; 1 接受)       db_column: IS_SYS_MESSAGE
	 */

	private Integer isSysMessage;
	/**
	 * 是否接收系统公告(0 不; 1 接受)       db_column: IS_SYS_NOTICE_MESSAGE
	 */

	private Integer isSysNoticeMessage;
	/**
	 * T币       db_column: TB
	 */

	private java.lang.Integer tb;
	/**
	 * 积分       db_column: SCORE
	 */

	private java.lang.Integer score;
	/**
	 * 自我介绍       db_column: INTRODUCE
	 */
	@Length(max=500)
	private java.lang.String introduce;
	/**
	 * 真实姓名       db_column: REAL_NAME
	 */
	@Length(max=20)
	private java.lang.String realName;
	/**
	 * 联系地址       db_column: ADDR
	 */
	@Length(max=100)
	private java.lang.String addr;
	/**
	 * 等级1、2、3、4       db_column: LEVEL
	 */
	@Max(127)
	private Integer level;
	/**
	 * 个人相册       db_column: PHOTOS
	 */
	@Length(max=65535)
	private java.lang.String photos;
	/**
	 * 爱好       db_column: HOBBY
	 */
	@Length(max=500)
	private java.lang.String hobby;
	//columns END

	private String custNo;//客户编号

	/**
	 * 图片验证码
	 */
	private String picCode;
	/**
	 * 手机验证码
	 */
	private String phoneCode;

	public Member(){
	}

	public Member(
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
	public void setNickName(java.lang.String value) {
		this.nickName = value;
	}

	public java.lang.String getNickName() {
		return this.nickName;
	}
	public void setGender(Integer value) {
		this.gender = value;
	}

	public Integer getGender() {
		return this.gender;
	}
	public void setProvince(java.lang.String value) {
		this.province = value;
	}

	public java.lang.String getProvince() {
		return this.province;
	}
	public void setCity(java.lang.String value) {
		this.city = value;
	}

	public java.lang.String getCity() {
		return this.city;
	}
	public void setHeadImg(java.lang.String value) {
		this.headImg = value;
	}

	public java.lang.String getHeadImg() {
		return this.headImg;
	}
	public void setIsPhone(Integer value) {
		this.isPhone = value;
	}

	public Integer getIsPhone() {
		return this.isPhone;
	}
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}

	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setType(Integer value) {
		this.type = value;
	}

	public Integer getType() {
		return this.type;
	}
	public void setPassword(java.lang.String value) {
		this.password = value;
	}

	public java.lang.String getPassword() {
		return this.password;
	}
	public void setPayPassword(java.lang.String value) {
		this.payPassword = value;
	}

	public java.lang.String getPayPassword() {
		return this.payPassword;
	}
	public void setBirthday(java.lang.Long value) {
		this.birthday = value;
	}

	public java.lang.Long getBirthday() {
		return this.birthday;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}

	public java.lang.String getEmail() {
		return this.email;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}

	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setIsDisable(Integer value) {
		this.isDisable = value;
	}

	public Integer getIsDisable() {
		return this.isDisable;
	}
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}

	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setSource(Integer value) {
		this.source = value;
	}

	public Integer getSource() {
		return this.source;
	}
	public void setIsEmail(Integer value) {
		this.isEmail = value;
	}

	public Integer getIsEmail() {
		return this.isEmail;
	}
	public void setDisableRemarks(java.lang.String value) {
		this.disableRemarks = value;
	}

	public java.lang.String getDisableRemarks() {
		return this.disableRemarks;
	}
	public void setPasswordLevel(java.lang.Integer value) {
		this.passwordLevel = value;
	}

	public java.lang.Integer getPasswordLevel() {
		return this.passwordLevel;
	}
	public void setEduInfoId2(java.lang.Long value) {
		this.eduInfoId2 = value;
	}

	public java.lang.Long getEduInfoId2() {
		return this.eduInfoId2;
	}
	public void setEduInfoId(java.lang.Long value) {
		this.eduInfoId = value;
	}

	public java.lang.Long getEduInfoId() {
		return this.eduInfoId;
	}
	public void setIsSysMessage(Integer value) {
		this.isSysMessage = value;
	}

	public Integer getIsSysMessage() {
		return this.isSysMessage;
	}
	public void setIsSysNoticeMessage(Integer value) {
		this.isSysNoticeMessage = value;
	}

	public Integer getIsSysNoticeMessage() {
		return this.isSysNoticeMessage;
	}
	public void setTb(java.lang.Integer value) {
		this.tb = value;
	}

	public java.lang.Integer getTb() {
		return this.tb;
	}
	public void setScore(java.lang.Integer value) {
		this.score = value;
	}

	public java.lang.Integer getScore() {
		return this.score;
	}
	public void setIntroduce(java.lang.String value) {
		this.introduce = value;
	}

	public java.lang.String getIntroduce() {
		return this.introduce;
	}
	public void setRealName(java.lang.String value) {
		this.realName = value;
	}

	public java.lang.String getRealName() {
		return this.realName;
	}
	public void setAddr(java.lang.String value) {
		this.addr = value;
	}

	public java.lang.String getAddr() {
		return this.addr;
	}
	public void setLevel(Integer value) {
		this.level = value;
	}

	public Integer getLevel() {
		return this.level;
	}
	public void setPhotos(java.lang.String value) {
		this.photos = value;
	}

	public java.lang.String getPhotos() {
		return this.photos;
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
		if(obj instanceof Member == false) return false;
		if(this == obj) return true;
		Member other = (Member)obj;
		return new EqualsBuilder()
				.append(getId(),other.getId())
				.isEquals();
	}

	public String getPicCode() {
		return picCode;
	}

	public void setPicCode(String picCode) {
		this.picCode = picCode;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}



	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
}

