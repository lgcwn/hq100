/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.hq.constant.Cnst;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 退款/换货申请
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RefundRequest  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "退款/换货申请";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ORDER_GOODS_ID = "订单商品ID";
	public static final String ALIAS_GOODS_COUNT = "商品数量";
	public static final String ALIAS_MEMBER_ID = "退货或换货 的申请人id";
	public static final String ALIAS_ORDER_ID = "订单ID";
	public static final String ALIAS_RETURN_SN = "退换货申请单编号";
	public static final String ALIAS_SYS_USER_ID = "后台客服id";
	public static final String ALIAS_REFUND_TYPE = "退换货类型(0换货;1退货退款)";
	public static final String ALIAS_GOODS_STATUS = "退换货物状态(-2 待客服处理 -1 待服务中心处理 0 待收货;1 已发货;2 已收货3 退款成功 4 取消退款 )";
	public static final String ALIAS_REFUND_REASON = "退款理由";
	public static final String ALIAS_REFUND_AMOUNT = "退款金额";
	public static final String ALIAS_REFUND_REMARK = "退款备注";
	public static final String ALIAS_CS_STATUS = "客服处理状态(-1:驳回;0待处理;1通过)";
	public static final String ALIAS_CS_STATUS_TIME = "客服处理时间";
	public static final String ALIAS_CS_RETUNR_INFO = "客服处理信息";
	public static final String ALIAS_SHIPPING_METHODS_ID = "物流ID";
	public static final String ALIAS_SHIPPING_METHODS_NAME = "物流名称";
	public static final String ALIAS_DELIVERY_NUMBER = "物流单号";
	public static final String ALIAS_CONSIGNEE = "收货人姓名";
	public static final String ALIAS_ADDRESS_DETAIL = "收货人详细地址";
	public static final String ALIAS_ZIP_CODE = "收货人邮政编码";
	public static final String ALIAS_MOBILE_PHONE = "收货人联系电话";
	public static final String ALIAS_ADD_TIME = "申请时间";
	public static final String ALIAS_IS_DELETE = "是否删除(0-否;1-是)";
	public static final String ALIAS_IS_SMALL_TICKET = "是否有小票  (0-否;1-是)";
	public static final String ALIAS_IS_TEST_REPORT = "是否有检测报告  (0-否;1-是)";
	public static final String ALIAS_IMAGES = "图片";
	public static final String ALIAS_PICKUP_ADDRESS = "取货点详细地址";
	public static final String ALIAS_PICKUP_METHOD = "取件方式  0 上门取件 1 送货至自提点";
	public static final String ALIAS_PICKUP_TIME = "取件时间";
	public static final String ALIAS_ORDER_SN = "订单编号";
	public static final String ALIAS_ACTUAL_AMOUNT = "实际退款金额（商家可修改）";
	public static final String ALIAS_DELIVERY_TIME = "发货时间";
	public static final String ALIAS_RECEIVING_TIME = "收货时间";
	public static final String ALIAS_COMPLETE_TIME = "完成时间";
	public static final String ALIAS_CANCEL_TIME = "取消时间";
	public static final String ALIAS_PICKUP_TIME_TYPE = "取货时间类型 0全天 1(10-12) 2(12-2) 3(2-4) 4(4-6) 5 (6-8)";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 订单商品ID       db_column: ORDER_GOODS_ID 
     */	
	@NotNull 
	private java.lang.Long orderGoodsId;
    /**
     * 商品数量       db_column: GOODS_COUNT 
     */	
	@NotNull 
	private java.lang.Integer goodsCount;
    /**
     * 退货或换货 的申请人id       db_column: MEMBER_ID
     */	
	
	private java.lang.Long memberId;
    /**
     * 订单ID       db_column: ORDER_ID 
     */	
	@NotNull 
	private java.lang.Long orderId;
    /**
     * 退换货申请单编号       db_column: RETURN_SN 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String returnSn;
    /**
     * 后台客服id       db_column: SYS_USER_ID 
     */	
	
	private java.lang.Long sysUserId;
    /**
     * 退换货类型(0换货;1退货退款)       db_column: REFUND_TYPE 
     */	
	@NotNull 
	private Integer refundType;
    /**
     * 退换货物状态(-2 待客服处理 -1 待服务中心处理 0 待收货;1 已发货;2 已收货3 退款成功 4 取消退款 )       db_column: GOODS_STATUS 
     */	
	@NotNull 
	private Integer goodsStatus;
    /**
     * 退款理由       db_column: REFUND_REASON 
     */	
	@Length(max=200)
	private java.lang.String refundReason;
    /**
     * 退款金额       db_column: REFUND_AMOUNT 
     */	
	
	private java.lang.Double refundAmount;
    /**
     * 退款备注       db_column: REFUND_REMARK 
     */	
	@Length(max=200)
	private java.lang.String refundRemark;
    /**
     * 客服处理状态(-1:驳回;0待处理;1通过)       db_column: CS_STATUS 
     */	
	@NotNull 
	private Integer csStatus;
    /**
     * 客服处理时间       db_column: CS_STATUS_TIME 
     */	
	
	private java.lang.Long csStatusTime;
    /**
     * 客服处理信息       db_column: CS_RETUNR_INFO 
     */	
	@Length(max=200)
	private java.lang.String csRetunrInfo;
    /**
     * 物流ID       db_column: SHIPPING_METHODS_ID 
     */	
	
	private java.lang.Long shippingMethodsId;
    /**
     * 物流名称       db_column: SHIPPING_METHODS_NAME 
     */	
	@Length(max=100)
	private java.lang.String shippingMethodsName;
    /**
     * 物流单号       db_column: DELIVERY_NUMBER 
     */	
	@Length(max=100)
	private java.lang.String deliveryNumber;
    /**
     * 收货人姓名       db_column: CONSIGNEE 
     */	
	@Length(max=100)
	private java.lang.String consignee;
    /**
     * 收货人详细地址       db_column: ADDRESS_DETAIL 
     */	
	@Length(max=200)
	private java.lang.String addressDetail;
    /**
     * 收货人邮政编码       db_column: ZIP_CODE 
     */	
	@Length(max=100)
	private java.lang.String zipCode;
    /**
     * 收货人联系电话       db_column: MOBILE_PHONE 
     */	
	@Length(max=20)
	private java.lang.String mobilePhone;
    /**
     * 申请时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 是否删除(0-否;1-是)       db_column: IS_DELETE 
     */	
	
	private Integer isDelete;
    /**
     * 是否有小票  (0-否;1-是)       db_column: IS_SMALL_TICKET 
     */	
	
	private Integer isSmallTicket;
    /**
     * 是否有检测报告  (0-否;1-是)       db_column: IS_TEST_REPORT 
     */	
	
	private Integer isTestReport;
    /**
     * 图片       db_column: IMAGES 
     */	
	@Length(max=1000)
	private java.lang.String images;
    /**
     * 取货点详细地址       db_column: PICKUP_ADDRESS 
     */	
	@Length(max=256)
	private java.lang.String pickupAddress;
    /**
     * 取件方式  0 上门取件 1 送货至自提点       db_column: PICKUP_METHOD 
     */	
	
	private Integer pickupMethod;
    /**
     * 取件时间       db_column: PICKUP_TIME 
     */	
	
	private java.lang.Long pickupTime;
    /**
     * 订单编号       db_column: ORDER_SN 
     */	
	@Length(max=50)
	private java.lang.String orderSn;
    /**
     * 实际退款金额（商家可修改）       db_column: ACTUAL_AMOUNT 
     */	
	
	private java.lang.Double actualAmount;
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
     * 取货时间类型 0全天 1(10-12) 2(12-2) 3(2-4) 4(4-6) 5 (6-8)       db_column: PICKUP_TIME_TYPE 
     */	
	
	private Integer pickupTimeType;
	//columns END

	public RefundRequest(){
	}

	public RefundRequest(
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
	public void setOrderGoodsId(java.lang.Long value) {
		this.orderGoodsId = value;
	}
	
	public java.lang.Long getOrderGoodsId() {
		return this.orderGoodsId;
	}
	public void setGoodsCount(java.lang.Integer value) {
		this.goodsCount = value;
	}
	
	public java.lang.Integer getGoodsCount() {
		return this.goodsCount;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setOrderId(java.lang.Long value) {
		this.orderId = value;
	}
	
	public java.lang.Long getOrderId() {
		return this.orderId;
	}
	public void setReturnSn(java.lang.String value) {
		this.returnSn = value;
	}
	
	public java.lang.String getReturnSn() {
		return this.returnSn;
	}
	public void setSysUserId(java.lang.Long value) {
		this.sysUserId = value;
	}
	
	public java.lang.Long getSysUserId() {
		return this.sysUserId;
	}
	public void setRefundType(Integer value) {
		this.refundType = value;
	}
	
	public Integer getRefundType() {
		return this.refundType;
	}
	public void setGoodsStatus(Integer value) {
		this.goodsStatus = value;
	}
	
	public Integer getGoodsStatus() {
		return this.goodsStatus;
	}
	public void setRefundReason(java.lang.String value) {
		this.refundReason = value;
	}
	
	public java.lang.String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundAmount(java.lang.Double value) {
		this.refundAmount = value;
	}
	
	public java.lang.Double getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundRemark(java.lang.String value) {
		this.refundRemark = value;
	}
	
	public java.lang.String getRefundRemark() {
		return this.refundRemark;
	}
	public void setCsStatus(Integer value) {
		this.csStatus = value;
	}
	
	public Integer getCsStatus() {
		return this.csStatus;
	}
	public void setCsStatusTime(java.lang.Long value) {
		this.csStatusTime = value;
	}
	
	public java.lang.Long getCsStatusTime() {
		return this.csStatusTime;
	}
	public void setCsRetunrInfo(java.lang.String value) {
		this.csRetunrInfo = value;
	}
	
	public java.lang.String getCsRetunrInfo() {
		return this.csRetunrInfo;
	}
	public void setShippingMethodsId(java.lang.Long value) {
		this.shippingMethodsId = value;
	}
	
	public java.lang.Long getShippingMethodsId() {
		return this.shippingMethodsId;
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
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setIsDelete(Integer value) {
		this.isDelete = value;
	}
	
	public Integer getIsDelete() {
		return this.isDelete;
	}
	public void setIsSmallTicket(Integer value) {
		this.isSmallTicket = value;
	}
	
	public Integer getIsSmallTicket() {
		return this.isSmallTicket;
	}
	public void setIsTestReport(Integer value) {
		this.isTestReport = value;
	}
	
	public Integer getIsTestReport() {
		return this.isTestReport;
	}
	public void setImages(java.lang.String value) {
		this.images = value;
	}
	
	public java.lang.String getImages() {
		return this.images;
	}
	public void setPickupAddress(java.lang.String value) {
		this.pickupAddress = value;
	}
	
	public java.lang.String getPickupAddress() {
		return this.pickupAddress;
	}
	public void setPickupMethod(Integer value) {
		this.pickupMethod = value;
	}
	
	public Integer getPickupMethod() {
		return this.pickupMethod;
	}
	public void setPickupTime(java.lang.Long value) {
		this.pickupTime = value;
	}
	
	public java.lang.Long getPickupTime() {
		return this.pickupTime;
	}
	public void setOrderSn(java.lang.String value) {
		this.orderSn = value;
	}
	
	public java.lang.String getOrderSn() {
		return this.orderSn;
	}
	public void setActualAmount(java.lang.Double value) {
		this.actualAmount = value;
	}
	
	public java.lang.Double getActualAmount() {
		return this.actualAmount;
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
	public void setPickupTimeType(Integer value) {
		this.pickupTimeType = value;
	}
	
	public Integer getPickupTimeType() {
		return this.pickupTimeType;
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
		if(obj instanceof RefundRequest == false) return false;
		if(this == obj) return true;
		RefundRequest other = (RefundRequest)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	/**
	 *
	 *
	 * 申请时间 页面展示
	 *
	 */
	private String addTimeStr;

	private String goodsName;

	private String goodsImg;
	private String [] goodsImgs;

	private String userName;

	private String pickupTimeStr;

	public String getAddTimeStr() {
		return Cnst.getFormatTime(this.getAddTime());
	}

	public void setAddTimeStr(String addTimeStr) {
		this.addTimeStr = addTimeStr;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPickupTimeStr() {
		return Cnst.getFormatTime(this.getPickupTime());
	}

	public void setPickupTimeStr(String pickupTimeStr) {
		this.pickupTimeStr = pickupTimeStr;
	}

	public String[] getGoodsImgs() {
		if(StringUtils.isNotEmpty(this.getImages())){
			goodsImgs=this.getImages().split(",");
		}
		return goodsImgs;
	}

	public void setGoodsImgs(String[] goodsImgs) {
		this.goodsImgs = goodsImgs;
	}
}

