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
 * 购物车
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ShoppingCart  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "购物车";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_HQ_MEMBER_ID = "电商基础用户id";
	public static final String ALIAS_GOODS_ID = "商品id";
	public static final String ALIAS_COUNT = "数量";
	public static final String ALIAS_GOODS_IMG = "商品图片";
	public static final String ALIAS_GOODS_NAME = "商品名称";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_STATUS = "购物车状态 1. 正常 2 已下单 3 已删除 4 移到我的收藏";
	public static final String ALIAS_ORDER_TIME = "下单时间";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 电商基础用户id       db_column: MEMBER_ID
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 商品id       db_column: GOODS_ID 
     */	
	@NotNull 
	private java.lang.Long goodsId;
    /**
     * 数量       db_column: COUNT 
     */	
	@NotNull 
	private java.lang.Integer count;
    /**
     * 商品图片       db_column: GOODS_IMG 
     */	
	@Length(max=100)
	private java.lang.String goodsImg;
    /**
     * 商品名称       db_column: GOODS_NAME 
     */	
	@Length(max=100)
	private java.lang.String goodsName;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 购物车状态 1. 正常 2 已下单 3 已删除 4 移到我的收藏       db_column: STATUS 
     */	
	
	private Integer status;
    /**
     * 下单时间       db_column: ORDER_TIME 
     */	
	
	private java.lang.Long orderTime;
	//columns END

	public ShoppingCart(){
	}

	public ShoppingCart(
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

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setGoodsId(java.lang.Long value) {
		this.goodsId = value;
	}
	
	public java.lang.Long getGoodsId() {
		return this.goodsId;
	}
	public void setCount(java.lang.Integer value) {
		this.count = value;
	}
	
	public java.lang.Integer getCount() {
		return this.count;
	}
	public void setGoodsImg(java.lang.String value) {
		this.goodsImg = value;
	}
	
	public java.lang.String getGoodsImg() {
		return this.goodsImg;
	}
	public void setGoodsName(java.lang.String value) {
		this.goodsName = value;
	}
	
	public java.lang.String getGoodsName() {
		return this.goodsName;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setOrderTime(java.lang.Long value) {
		this.orderTime = value;
	}
	
	public java.lang.Long getOrderTime() {
		return this.orderTime;
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
		if(obj instanceof ShoppingCart == false) return false;
		if(this == obj) return true;
		ShoppingCart other = (ShoppingCart)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

