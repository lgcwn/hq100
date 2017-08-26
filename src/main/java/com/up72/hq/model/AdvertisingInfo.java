/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.conf.SystemConfig;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 广告信息
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class AdvertisingInfo  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "广告信息";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_HQ_ADVERTISING_MANAGEMENT_ID = "广告管理ID";
	public static final String ALIAS_NAME = "广告名称";
	public static final String ALIAS_PARENT_ADDRESS = "所属广告位";
	public static final String ALIAS_LINK_ADDRESS = "链接地址";
	public static final String ALIAS_START_TIME = "起始时间";
	public static final String ALIAS_END_TIME = "终止时间";
	public static final String ALIAS_IMG = "图片地址";
	public static final String ALIAS_CONTENT = "广告内容";
	public static final String ALIAS_SEQUENCE = "排序";
	public static final String ALIAS_ENABLE = "是否启用";
	public static final String ALIAS_SUMMARY = "简介";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 广告管理ID       db_column: HQ_ADVERTISING_MANAGEMENT_ID 
     */	
	
	private java.lang.Long hqAdvertisingManagementId;
    /**
     * 名称       db_column: NAME 
     */	
	@Length(max=45)
	private java.lang.String name;
    /**
     * 链接地址       db_column: LINK_ADDRESS 
     */	
	@Length(max=500)
	private java.lang.String linkAddress;
    /**
     * wap链接地址       db_column: WAP_LINK_ADDRESS
     */
	@Length(max=500)
	private java.lang.String wapLinkAddress;
    /**
     * 起始时间       db_column: START_TIME 
     */	
	
	private java.lang.Long startTime;
    /**
     * 终止时间       db_column: END_TIME 
     */	
	
	private java.lang.Long endTime;
    /**
     * 图片       db_column: IMG 
     */	
	@Length(max=500)
	private java.lang.String img;
    /**
     * 广告内容       db_column: CONTENT 
     */
	@Length(max=2147483647)
	private java.lang.String content;
    /**
     * 简介      db_column: SUMMARY
     */
	@Length(max=1000)
	private java.lang.String summary;
    /**
     * 排序       db_column: SEQUENCE 
     */	
	
	private java.lang.Integer sequence;
    /**
     * 是否启用       db_column: ENABLE 
     */	
	
	private Integer enable;
	//columns END

	public AdvertisingInfo(){
	}

	public AdvertisingInfo(
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
	public void setHqAdvertisingManagementId(java.lang.Long value) {
		this.hqAdvertisingManagementId = value;
	}
	
	public java.lang.Long getHqAdvertisingManagementId() {
		return this.hqAdvertisingManagementId;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setLinkAddress(java.lang.String value) {
		this.linkAddress = value;
	}
	
	public java.lang.String getLinkAddress() {
		return this.linkAddress;
	}
	public void setStartTime(java.lang.Long value) {
		this.startTime = value;
	}
	
	public java.lang.Long getStartTime() {
		return this.startTime;
	}
	public void setEndTime(java.lang.Long value) {
		this.endTime = value;
	}
	
	public java.lang.Long getEndTime() {
		return this.endTime;
	}
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setSequence(java.lang.Integer value) {
		this.sequence = value;
	}
	
	public java.lang.Integer getSequence() {
		return this.sequence;
	}
	public void setEnable(Integer value) {
		this.enable = value;
	}
	
	public Integer getEnable() {
		return this.enable;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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
		if(obj instanceof AdvertisingInfo == false) return false;
		if(this == obj) return true;
		AdvertisingInfo other = (AdvertisingInfo)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	private java.lang.String fileImg;

	public String getFileImg() {
		return SystemConfig.instants().getValue("file")+this.getImg();
	}

	public String getWapLinkAddress() {
		return wapLinkAddress;
	}

	public void setWapLinkAddress(String wapLinkAddress) {
		this.wapLinkAddress = wapLinkAddress;
	}
}

