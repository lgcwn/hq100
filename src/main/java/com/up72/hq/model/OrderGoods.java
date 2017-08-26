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

import java.text.DecimalFormat;


/**
 * 订单商品
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class OrderGoods  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "订单商品";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_GOODS_ID = "商品ID";
	public static final String ALIAS_GOODS_PRICE = "商品价格";
	public static final String ALIAS_GOODS_COUNT = "商品数量";
	public static final String ALIAS_GOODS_NAME = "商品名称";
	public static final String ALIAS_CREATE_DATE = "下单时间";
	public static final String ALIAS_MODIFY_DATE = "修改时间";
	public static final String ALIAS_GOODS_IMG = "商品缩略图";
	public static final String ALIAS_REFUND_TRANSACTION_NUMBER = "退款交易号(对接第三方支付渠道的退款交易编号)";
	public static final String ALIAS_IS_REFUND = "是否退货(0否;1是)";
	public static final String ALIAS_IS_EXCHANGE = "是否换货(0否;1是)";
	public static final String ALIAS_COMMENT_STATUS = "评论状态( 0未评论;1买家评论;2卖家评论;3双方已评)";
	public static final String ALIAS_RETURNS_STATUS = "退货申请流程状态(0未申请;1退款申请等待卖家确认;2卖家不同意协议，等待买家修改;3退款申请达成;等待买家发货;4买家已退货;等待卖家确认收货;5退款关闭;6退款成功)";
	public static final String ALIAS_GOODS_SN = "商品编号";
	public static final String ALIAS_REFUND_COUNT = "退换货数量";
	public static final String ALIAS_REVIEW_STATUS = "评论审核结果(0 成功 1 失败 )";
	
	
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
     * 商品ID       db_column: GOODS_ID 
     */	
	@NotNull 
	private java.lang.Long goodsId;
	private String goodsIdCipher;
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
     * 修改时间       db_column: MODIFY_DATE 
     */	
	
	private java.lang.Long modifyDate;
    /**
     * 商品缩略图       db_column: GOODS_IMG 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String goodsImg;
    /**
     * 退款交易号(对接第三方支付渠道的退款交易编号)       db_column: REFUND_TRANSACTION_NUMBER 
     */	
	@Length(max=100)
	private java.lang.String refundTransactionNumber;
    /**
     * 是否退货(0否;1是)       db_column: IS_REFUND 
     */	
	
	private Integer isRefund;
    /**
     * 是否换货(0否;1是)       db_column: IS_EXCHANGE 
     */	
	
	private Integer isExchange;
    /**
     * 评论状态( 0未评论;1买家评论;2卖家评论;3双方已评)       db_column: COMMENT_STATUS 
     */	
	@NotNull 
	private Integer commentStatus;
    /**
     * 退货申请流程状态(0未申请;1退款申请等待卖家确认;2卖家不同意协议，等待买家修改;3退款申请达成;等待买家发货;4买家已退货;等待卖家确认收货;5退款关闭;6退款成功)       db_column: RETURNS_STATUS 
     */	
	@NotNull 
	private Integer returnsStatus;
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

	private  Integer goodsPriceInt;
	//columns END

	private String idCipher;

	public OrderGoods(){
	}

	public OrderGoods(
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
	public void setModifyDate(java.lang.Long value) {
		this.modifyDate = value;
	}
	
	public java.lang.Long getModifyDate() {
		return this.modifyDate;
	}
	public void setGoodsImg(java.lang.String value) {
		this.goodsImg = value;
	}
	
	public java.lang.String getGoodsImg() {
		return this.goodsImg;
	}
	public void setRefundTransactionNumber(java.lang.String value) {
		this.refundTransactionNumber = value;
	}
	
	public java.lang.String getRefundTransactionNumber() {
		return this.refundTransactionNumber;
	}
	public void setIsRefund(Integer value) {
		this.isRefund = value;
	}
	
	public Integer getIsRefund() {
		return this.isRefund;
	}
	public void setIsExchange(Integer value) {
		this.isExchange = value;
	}
	
	public Integer getIsExchange() {
		return this.isExchange;
	}
	public void setCommentStatus(Integer value) {
		this.commentStatus = value;
	}
	
	public Integer getCommentStatus() {
		return this.commentStatus;
	}
	public void setReturnsStatus(Integer value) {
		this.returnsStatus = value;
	}
	
	public Integer getReturnsStatus() {
		return this.returnsStatus;
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

	public String getGoodsIdCipher() {
		goodsIdCipher = CodeEncryption.encryption(getGoodsId());
		return goodsIdCipher;
	}

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}
	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
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
		if(obj instanceof OrderGoods == false) return false;
		if(this == obj) return true;
		OrderGoods other = (OrderGoods)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public Integer getGoodsPriceInt() {
		double price=getGoodsPrice();
		return (int)(price);
	}

	public void setGoodsPriceInt(Integer goodsPriceInt) {
		this.goodsPriceInt = goodsPriceInt;
	}

	private  String goodsPriceStr;

	public String getGoodsPriceStr() {
		DecimalFormat df   = new DecimalFormat("######0.00");
		if(getGoodsPrice() != null){
			goodsPriceStr=df.format(getGoodsPrice());
		}
		return goodsPriceStr;
	}
}