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
 * 人名币兑换积分
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class ExchangePoints  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "人名币兑换积分";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_RMB = "人民币";
	public static final String ALIAS_POINTS = "积分";
	public static final String ALIAS_RATIO = "兑换比例";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 人民币       db_column: RMB 
     */	
	@NotNull 
	private java.lang.Integer rmb;
    /**
     * 积分       db_column: POINTS 
     */	
	@NotNull 
	private java.lang.Integer points;
    /**
     * 兑换比例       db_column: RATIO 
     */	
	@NotNull 
	private java.lang.Double ratio;
	//columns END

	public ExchangePoints(){
	}

	public ExchangePoints(
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
	public void setRmb(java.lang.Integer value) {
		this.rmb = value;
	}
	
	public java.lang.Integer getRmb() {
		return this.rmb;
	}
	public void setPoints(java.lang.Integer value) {
		this.points = value;
	}
	
	public java.lang.Integer getPoints() {
		return this.points;
	}
	public void setRatio(java.lang.Double value) {
		this.ratio = value;
	}
	
	public java.lang.Double getRatio() {
		return this.ratio;
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
		if(obj instanceof ExchangePoints == false) return false;
		if(this == obj) return true;
		ExchangePoints other = (ExchangePoints)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

