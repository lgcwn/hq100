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

import java.util.List;


/**
 * 订单
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Order  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "订单";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_SN = "订单编号";
	public static final String ALIAS_TRADE_NO = "交易号(对应第三方支付渠道索要的支付订单号，与第三方支付渠道唯一标示)";
	public static final String ALIAS_TYPE = "订单类型(1-免税，2-虚拟，3-积分，4-众筹,5-角色选拔)";
	public static final String ALIAS_ORDER_STATUS = "订单流程状态(0-待付款，1-待发货，2-待收货，3-已完成,4已取消订单5拒收,6待自提 7 异常、库存不足)";
	public static final String ALIAS_PAY_TIME = "付款时间";
	public static final String ALIAS_DELIVERY_TIME = "发货时间";
	public static final String ALIAS_RECEIVING_TIME = "收货时间";
	public static final String ALIAS_COMPLETE_TIME = "完成时间";
	public static final String ALIAS_CANCEL_TIME = "取消时间";
	public static final String ALIAS_REJECT_TIME = "拒收时间";
	public static final String ALIAS_SHIPPING_METHODS_NAME = "物流公司名称";
	public static final String ALIAS_DELIVERY_NUMBER = "物流运送单号";
	public static final String ALIAS_TRANSPORT_COST = "运单费";
	public static final String ALIAS_PAYABLE_GOODS_AMOUNT = "(包含所有商品的价格总和)";
	public static final String ALIAS_PAYABLE_AMOUNT = "应付订单金额(打折或积分抵扣前所要付的总金额)";
	public static final String ALIAS_ACTUAL_PAYMENTS = "实付订单金额(打折或积分抵扣或使用优惠券等之后+运费的付款)";
	public static final String ALIAS_IS_USE_SCORE = "是否使用积分(0否;1是)";
	public static final String ALIAS_TB_COUNT = "T币数量";
	public static final String ALIAS_SCORE_COUNT = "积分数量";
	public static final String ALIAS_CONSIGNEE = "收货人姓名";
	public static final String ALIAS_ADDRESS_DETAIL = "收货人详细地址";
	public static final String ALIAS_ZIP_CODE = "邮政编码";
	public static final String ALIAS_MOBILE_PHONE = "收货人电话";
	public static final String ALIAS_FIXED_PHONE = "收货人固定电话";
	public static final String ALIAS_EMAIL = "收货人邮箱";
	public static final String ALIAS_IS_INVOICE = "是否开发票(0否;1是)";
	public static final String ALIAS_ADD_TIME = "下单时间";
	public static final String ALIAS_EXPIRE_DATE = "订单过期时间";
	public static final String ALIAS_IS_EXPIRE = "是否过期(0否;1是)";
	public static final String ALIAS_PAYMENT_DATE = "支付完成时间";
	public static final String ALIAS_MODIFY_DATE = "修改时间";
	public static final String ALIAS_MODIFYER_ID = "修改人ID(后台运营人员，特殊情况下进行的修改)";
	public static final String ALIAS_IS_COMMENT = "是否评价（0否1是）";
	public static final String ALIAS_REMARK = "订单备注";
	public static final String ALIAS_PAY_CHANNEL = "支付渠道（1支付宝，2微信,3银联，4余额）";
	public static final String ALIAS_IS_DELETE = "是否删除 (0否;1是)";
	public static final String ALIAS_MEMBER_ID = "下单用户id";
	public static final String ALIAS_AUTO_RECEIVED_TIME = "自动确认收货时间";
	public static final String ALIAS_BUYER_EXTENDED_RECEIVED = "买家是否已延长收货时间(0否1是)";
	public static final String ALIAS_IS_PHONE_ORDER = "是否手机下单";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 订单编号       db_column: SN 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String sn;
    /**
     * 交易号(对应第三方支付渠道索要的支付订单号，与第三方支付渠道唯一标示)       db_column: TRADE_NO 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String tradeNo;
    /**
     * 订单类型(1-免税，2-虚拟，3-积分，4-众筹,5-角色选拔)       db_column: TYPE 
     */	
	@NotNull 
	private Integer type;
    /**
     * 订单流程状态(0-待付款，1-待发货，2-待收货，3-已完成,4已取消订单5拒收,6待自提 7 异常、库存不足)       db_column: ORDER_STATUS
     */	
	@NotNull 
	private Integer orderStatus;
    /**
     * 付款时间       db_column: PAY_TIME 
     */	
	
	private java.lang.Long payTime;
    /**
     * 发货时间       db_column: DELIVERY_TIME 
     */	
	
	private java.lang.Long deliveryTime;
    /**
     * 收货时间       db_column: RECEIVING_TIME 
     */	
	
	private java.lang.Long receivingTime;
    /**
     * 完成时间       db_column: COMPLETE_TIME 
     */	
	
	private java.lang.Long completeTime;
    /**
     * 取消时间       db_column: CANCEL_TIME 
     */	
	
	private java.lang.Long cancelTime;
    /**
     * 拒收时间       db_column: REJECT_TIME 
     */	
	
	private java.lang.Long rejectTime;
    /**
     * 物流公司名称       db_column: SHIPPING_METHODS_NAME 
     */	
	@Length(max=100)
	private java.lang.String shippingMethodsName;
    /**
     * 物流运送单号       db_column: DELIVERY_NUMBER 
     */	
	@Length(max=100)
	private java.lang.String deliveryNumber;
    /**
     * 运单费       db_column: TRANSPORT_COST 
     */	
	
	private java.lang.Double transportCost;
    /**
     * 商品总金额(包含所有商品的价格总和)       db_column: PAYABLE_GOODS_AMOUNT 
     */	
	@NotNull 
	private java.lang.Double payableGoodsAmount;
    /**
     * 应付订单金额(打折或积分抵扣前所要付的总金额)       db_column: PAYABLE_AMOUNT 
     */	
	@NotNull 
	private java.lang.Double payableAmount;
    /**
     * 实付订单金额(打折或积分抵扣或使用优惠券等之后+运费的付款)       db_column: ACTUAL_PAYMENTS 
     */	
	@NotNull 
	private java.lang.Double actualPayments;
    /**
     * 是否使用积分(0否;1是)       db_column: IS_USE_SCORE 
     */	
	
	private Integer isUseScore;
    /**
     * T币数量       db_column: TB_COUNT 
     */	
	
	private java.lang.Integer tbCount;
    /**
     * 积分数量       db_column: SCORE_COUNT 
     */	
	
	private java.lang.Integer scoreCount;
    /**
     * 收货人姓名       db_column: CONSIGNEE 
     */	
//	@NotBlank @Length(max=100)
	private java.lang.String consignee;
    /**
     * 收货人详细地址       db_column: ADDRESS_DETAIL 
     */	
//	@NotBlank @Length(max=500)
	private java.lang.String addressDetail;
    /**
     * 邮政编码       db_column: ZIP_CODE 
     */	
	@Length(max=100)
	private java.lang.String zipCode;
    /**
     * 收货人电话       db_column: MOBILE_PHONE 
     */	
//	@NotBlank @Length(max=20)
	private java.lang.String mobilePhone;
    /**
     * 收货人固定电话       db_column: FIXED_PHONE 
     */	
	@Length(max=20)
	private java.lang.String fixedPhone;
    /**
     * 收货人邮箱       db_column: EMAIL 
     */	
	@Length(max=20)
	private java.lang.String email;
    /**
     * 是否开发票(0否;1是)       db_column: IS_INVOICE 
     */	
	
	private Integer isInvoice;
    /**
     * 下单时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 订单过期时间       db_column: EXPIRE_DATE 
     */	
	
	private java.lang.Long expireDate;
    /**
     * 是否过期(0否;1是)       db_column: IS_EXPIRE 
     */	
	@NotNull 
	private Integer isExpire;
    /**
     * 支付完成时间       db_column: PAYMENT_DATE 
     */	
	
	private java.lang.Long paymentDate;
    /**
     * 修改时间       db_column: MODIFY_DATE 
     */	
	
	private java.lang.Long modifyDate;
    /**
     * 修改人ID(后台运营人员，特殊情况下进行的修改)       db_column: MODIFYER_ID 
     */	
	
	private java.lang.Long modifyerId;
    /**
     * 是否评价（0否1是）       db_column: IS_COMMENT 
     */	
	
	private Integer isComment;
    /**
     * 订单备注       db_column: REMARK 
     */	
	@Length(max=256)
	private java.lang.String remark;
    /**
     * 支付渠道（1支付宝，2微信,3银联，4余额）       db_column: PAY_CHANNEL
     */	
	
	private Integer payChannel;
    /**
     * 是否删除 (0否;1是)       db_column: IS_DELETE 
     */	
	@NotNull @Max(127)
	private Integer isDelete;
    /**
     * 下单用户id       db_column: MEMBER_ID 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 自动确认收货时间       db_column: AUTO_RECEIVED_TIME 
     */	
	
	private java.lang.Long autoReceivedTime;
    /**
     * 买家是否已延长收货时间(0否1是)       db_column: BUYER_EXTENDED_RECEIVED 
     */	
	
	private Integer buyerExtendedReceived;
    /**
     * 是否手机下单       db_column: IS_PHONE_ORDER 
     */	
	@NotNull 
	private Integer isPhoneOrder;
	//columns END

	/**
	 * 订单商品
	 */
	private List<OrderGoods> orderGoodses;

	/**
	 * id 密文
	 */
	private String idCipher;

	public Order(){
	}

	public Order(
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
	public void setSn(java.lang.String value) {
		this.sn = value;
	}
	
	public java.lang.String getSn() {
		return this.sn;
	}
	public void setTradeNo(java.lang.String value) {
		this.tradeNo = value;
	}
	
	public java.lang.String getTradeNo() {
		return this.tradeNo;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setOrderStatus(Integer value) {
		this.orderStatus = value;
	}
	
	public Integer getOrderStatus() {
		return this.orderStatus;
	}
	public void setPayTime(java.lang.Long value) {
		this.payTime = value;
	}
	
	public java.lang.Long getPayTime() {
		return this.payTime;
	}
	public void setDeliveryTime(java.lang.Long value) {
		this.deliveryTime = value;
	}
	
	public java.lang.Long getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setReceivingTime(java.lang.Long value) {
		this.receivingTime = value;
	}
	
	public java.lang.Long getReceivingTime() {
		return this.receivingTime;
	}
	public void setCompleteTime(java.lang.Long value) {
		this.completeTime = value;
	}
	
	public java.lang.Long getCompleteTime() {
		return this.completeTime;
	}
	public void setCancelTime(java.lang.Long value) {
		this.cancelTime = value;
	}
	
	public java.lang.Long getCancelTime() {
		return this.cancelTime;
	}
	public void setRejectTime(java.lang.Long value) {
		this.rejectTime = value;
	}
	
	public java.lang.Long getRejectTime() {
		return this.rejectTime;
	}
	public void setShippingMethodsName(java.lang.String value) {
		this.shippingMethodsName = value;
	}
	
	public java.lang.String getShippingMethodsName() {
		return this.shippingMethodsName;
	}
	public void setDeliveryNumber(java.lang.String value) {
		this.deliveryNumber = value;
	}
	
	public java.lang.String getDeliveryNumber() {
		return this.deliveryNumber;
	}
	public void setTransportCost(java.lang.Double value) {
		this.transportCost = value;
	}
	
	public java.lang.Double getTransportCost() {
		return this.transportCost;
	}
	public void setPayableGoodsAmount(java.lang.Double value) {
		this.payableGoodsAmount = value;
	}
	
	public java.lang.Double getPayableGoodsAmount() {
		return this.payableGoodsAmount;
	}
	public void setPayableAmount(java.lang.Double value) {
		this.payableAmount = value;
	}
	
	public java.lang.Double getPayableAmount() {
		return this.payableAmount;
	}
	public void setActualPayments(java.lang.Double value) {
		this.actualPayments = value;
	}
	
	public java.lang.Double getActualPayments() {
		return this.actualPayments;
	}
	public void setIsUseScore(Integer value) {
		this.isUseScore = value;
	}
	
	public Integer getIsUseScore() {
		return this.isUseScore;
	}
	public void setTbCount(java.lang.Integer value) {
		this.tbCount = value;
	}
	
	public java.lang.Integer getTbCount() {
		return this.tbCount;
	}
	public void setScoreCount(java.lang.Integer value) {
		this.scoreCount = value;
	}
	
	public java.lang.Integer getScoreCount() {
		return this.scoreCount;
	}
	public void setConsignee(java.lang.String value) {
		this.consignee = value;
	}
	
	public java.lang.String getConsignee() {
		return this.consignee;
	}
	public void setAddressDetail(java.lang.String value) {
		this.addressDetail = value;
	}
	
	public java.lang.String getAddressDetail() {
		return this.addressDetail;
	}
	public void setZipCode(java.lang.String value) {
		this.zipCode = value;
	}
	
	public java.lang.String getZipCode() {
		return this.zipCode;
	}
	public void setMobilePhone(java.lang.String value) {
		this.mobilePhone = value;
	}
	
	public java.lang.String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setFixedPhone(java.lang.String value) {
		this.fixedPhone = value;
	}
	
	public java.lang.String getFixedPhone() {
		return this.fixedPhone;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setIsInvoice(Integer value) {
		this.isInvoice = value;
	}
	
	public Integer getIsInvoice() {
		return this.isInvoice;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setExpireDate(java.lang.Long value) {
		this.expireDate = value;
	}
	
	public java.lang.Long getExpireDate() {
		return this.expireDate;
	}
	public void setIsExpire(Integer value) {
		this.isExpire = value;
	}
	
	public Integer getIsExpire() {
		return this.isExpire;
	}
	public void setPaymentDate(java.lang.Long value) {
		this.paymentDate = value;
	}
	
	public java.lang.Long getPaymentDate() {
		return this.paymentDate;
	}
	public void setModifyDate(java.lang.Long value) {
		this.modifyDate = value;
	}
	
	public java.lang.Long getModifyDate() {
		return this.modifyDate;
	}
	public void setModifyerId(java.lang.Long value) {
		this.modifyerId = value;
	}
	
	public java.lang.Long getModifyerId() {
		return this.modifyerId;
	}
	public void setIsComment(Integer value) {
		this.isComment = value;
	}
	
	public Integer getIsComment() {
		return this.isComment;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setPayChannel(Integer value) {
		this.payChannel = value;
	}
	
	public Integer getPayChannel() {
		return this.payChannel;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setAutoReceivedTime(java.lang.Long value) {
		this.autoReceivedTime = value;
	}
	
	public java.lang.Long getAutoReceivedTime() {
		return this.autoReceivedTime;
	}
	public void setBuyerExtendedReceived(Integer value) {
		this.buyerExtendedReceived = value;
	}
	
	public Integer getBuyerExtendedReceived() {
		return this.buyerExtendedReceived;
	}
	public void setIsPhoneOrder(Integer value) {
		this.isPhoneOrder = value;
	}
	
	public Integer getIsPhoneOrder() {
		return this.isPhoneOrder;
	}

	public List<OrderGoods> getOrderGoodses() {
		return orderGoodses;
	}

	public void setOrderGoodses(List<OrderGoods> orderGoodses) {
		this.orderGoodses = orderGoodses;
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
		if(obj instanceof Order == false) return false;
		if(this == obj) return true;
		Order other = (Order)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

