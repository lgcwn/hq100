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
 * 
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderGoodsComment  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "商品评论";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_GOODS_ID = "商品id";
	public static final String ALIAS_HQ_USER_ID = "评论人id(电商用户)";
	public static final String ALIAS_ORDER_ID = "订单id";
	public static final String ALIAS_CONTENT = "评论内容";
	public static final String ALIAS_LEVEL = "评论等级1、2、3、4、5";
	public static final String ALIAS_ADD_TIME = "评论时间";
	public static final String ALIAS_PROD_ID = "产品id";
	public static final String ALIAS_STATUS = "审核状态,0待审核,1已审核";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 商品id       db_column: GOODS_ID 
     */	
	@NotNull 
	private java.lang.Long goodsId;
    /**
     * 评论人id(电商用户)       db_column: EMEMBER_ID
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 订单id       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 评论内容       db_column: CONTENT 
     */	
	@Length(max=1000)
	private java.lang.String content;
    /**
     * 评论等级1、2、3、4、5       db_column: LEVEL 
     */	
	
	private Integer level;
    /**
     * 评论时间       db_column: ADD_TIME 
     */	
	
	private java.lang.Long addTime;
    /**
     * 产品id       db_column: PROD_ID 
     */	
	
	private java.lang.Long prodId;
    /**
     * 审核状态,0待审核,1已审核       db_column: STATUS 
     */	
	
	private Integer status;
	//columns END

	public OrderGoodsComment(){
	}

	public OrderGoodsComment(
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
	public void setGoodsId(java.lang.Long value) {
		this.goodsId = value;
	}
	
	public java.lang.Long getGoodsId() {
		return this.goodsId;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setOrderId(java.lang.Long value) {
		this.orderId = value;
	}
	
	public java.lang.Long getOrderId() {
		return this.orderId;
	}
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	public void setLevel(Integer value) {
		this.level = value;
	}
	
	public Integer getLevel() {
		return this.level;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setProdId(java.lang.Long value) {
		this.prodId = value;
	}
	
	public java.lang.Long getProdId() {
		return this.prodId;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
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
		if(obj instanceof OrderGoodsComment == false) return false;
		if(this == obj) return true;
		OrderGoodsComment other = (OrderGoodsComment)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

