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
 * 我的投票
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Votes  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "我的投票";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_MEMBER_ID = "基础用户id";
	public static final String ALIAS_TYPE = "投票对象类型(1-评选之最;2-时事评选，3-明星排行榜)";
	public static final String ALIAS_SOURCE_ID = "投票id(根据投票对象类型来存储其对应id)";
	public static final String ALIAS_ADD_TIME = "投票时间";
	public static final String ALIAS_YEAR = "年份";
	public static final String ALIAS_MONTH = "月份";
	public static final String ALIAS_DAY = "日";
	public static final String ALIAS_STATUS = "状态(1-加分；2-不加不减；3-减分)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 基础用户id       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 投票对象类型(1-评选之最;2-时事评选，3-明星排行榜)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 投票id(根据投票对象类型来存储其对应id)       db_column: SOURCE_ID 
     */	
	@NotNull 
	private java.lang.Long sourceId;
    /**
     * 投票时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 年份       db_column: YEAR 
     */	
	@NotNull 
	private java.lang.Integer year;
    /**
     * 月份       db_column: MONTH 
     */	
	@NotNull 
	private java.lang.Integer month;
    /**
     * 日       db_column: DAY 
     */	
	@NotNull 
	private java.lang.Integer day;
    /**
     * 票数       db_column: VOTES
     */	
	
	private java.lang.Long votes;
    /**
     * 状态(1-加分；2-不加不减；3-减分)       db_column: STATUS 
     */	
	@NotNull 
	private Integer status;
	/**
	 * 投票数       db_column: NUMBER
	 */
	private Integer number;
	/**
	 * 排名       db_column: RANKING
	 */
	private Integer ranking;

	public Votes(){
	}

	public Votes(
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
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setSourceId(java.lang.Long value) {
		this.sourceId = value;
	}
	
	public java.lang.Long getSourceId() {
		return this.sourceId;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setYear(java.lang.Integer value) {
		this.year = value;
	}
	
	public java.lang.Integer getYear() {
		return this.year;
	}
	public void setMonth(java.lang.Integer value) {
		this.month = value;
	}
	
	public java.lang.Integer getMonth() {
		return this.month;
	}
	public void setDay(java.lang.Integer value) {
		this.day = value;
	}
	
	public java.lang.Integer getDay() {
		return this.day;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}

	public Long getVotes() {
		return votes;
	}

	public void setVotes(Long votes) {
		this.votes = votes;
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
		if(obj instanceof Votes == false) return false;
		if(this == obj) return true;
		Votes other = (Votes)obj;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
}

