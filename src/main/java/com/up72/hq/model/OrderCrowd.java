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
 * 众筹商品
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderCrowd  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "众筹商品";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_TYPE = "支持类型(0-无私支持，1-回报支持)";
	public static final String ALIAS_GOODS_ID = "商品ID";
	public static final String ALIAS_GOODS_PRICE = "商品价格";
	public static final String ALIAS_GOODS_COUNT = "商品数量";
	public static final String ALIAS_GOODS_NAME = "商品名称";
	public static final String ALIAS_CREATE_DATE = "下单时间";
	public static final String ALIAS_GOODS_SN = "商品编号";
	public static final String ALIAS_REFUND_COUNT = "退换货数量";
	public static final String ALIAS_REVIEW_STATUS = "评论审核结果(0 成功 1 失败 )";
	public static final String ALIAS_GOODS_IMG = "商品缩略图";
	public static final String ALIAS_CROWD_ID = "众筹ID";

	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID
     */

	private java.lang.Long id;
    /**
     * 订单ID       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 支持类型(0-无私支持，1-回报支持)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 商品ID       db_column: GOODS_ID 
     */	
	@NotNull 
	private java.lang.Long goodsId;
    /**
     * 商品价格       db_column: GOODS_PRICE 
     */	
	@NotNull 
	private java.lang.Double goodsPrice;
    /**
     * 商品数量       db_column: GOODS_COUNT 
     */	
	@NotNull 
	private java.lang.Integer goodsCount;
    /**
     * 商品名称       db_column: GOODS_NAME 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String goodsName;
    /**
     * 下单时间       db_column: CREATE_DATE 
     */	
	@NotNull 
	private java.lang.Long createDate;
    /**
     * 商品编号       db_column: GOODS_SN 
     */	
	@Length(max=100)
	private java.lang.String goodsSn;
    /**
     * 退换货数量       db_column: REFUND_COUNT 
     */	
	
	private java.lang.Long refundCount;
    /**
     * 评论审核结果(0 成功 1 失败 )       db_column: REVIEW_STATUS 
     */	
	
	private Integer reviewStatus;
    /**
     * 商品缩略图       db_column: GOODS_IMG 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String goodsImg;

	/**
	 * 众筹ID      db_column: CROWD_ID
	 */

	private java.lang.Long crowdId;
	//columns END

	public OrderCrowd(){
	}

	public OrderCrowd(
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
	public void setOrderId(java.lang.Long value) {
		this.orderId = value;
	}
	
	public java.lang.Long getOrderId() {
		return this.orderId;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setGoodsId(java.lang.Long value) {
		this.goodsId = value;
	}
	
	public java.lang.Long getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsPrice(java.lang.Double value) {
		this.goodsPrice = value;
	}
	
	public java.lang.Double getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsCount(java.lang.Integer value) {
		this.goodsCount = value;
	}
	
	public java.lang.Integer getGoodsCount() {
		return this.goodsCount;
	}
	public void setGoodsName(java.lang.String value) {
		this.goodsName = value;
	}
	
	public java.lang.String getGoodsName() {
		return this.goodsName;
	}
	public void setCreateDate(java.lang.Long value) {
		this.createDate = value;
	}
	
	public java.lang.Long getCreateDate() {
		return this.createDate;
	}
	public void setGoodsSn(java.lang.String value) {
		this.goodsSn = value;
	}
	
	public java.lang.String getGoodsSn() {
		return this.goodsSn;
	}
	public void setRefundCount(java.lang.Long value) {
		this.refundCount = value;
	}
	
	public java.lang.Long getRefundCount() {
		return this.refundCount;
	}
	public void setReviewStatus(Integer value) {
		this.reviewStatus = value;
	}
	
	public Integer getReviewStatus() {
		return this.reviewStatus;
	}
	public void setGoodsImg(java.lang.String value) {
		this.goodsImg = value;
	}
	
	public java.lang.String getGoodsImg() {
		return this.goodsImg;
	}

	public Long getCrowdId() {
		return crowdId;
	}

	public void setCrowdId(Long crowdId) {
		this.crowdId = crowdId;
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
		if(obj instanceof OrderCrowd == false) return false;
		if(this == obj) return true;
		OrderCrowd other = (OrderCrowd)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

