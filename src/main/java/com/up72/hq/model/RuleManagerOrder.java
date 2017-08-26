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
 * 角色报名订单
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RuleManagerOrder  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "角色报名订单";
	public static final String ALIAS_ID = "主键";
	public static final String ALIAS_ROLE_SELECT_ID = "角色选拔ID";
	public static final String ALIAS_ROLE_MANAGER_ID = "角色管理ID";
	public static final String ALIAS_SN = "订单编号";
	public static final String ALIAS_TRADE_NO = "交易号(对应第三方支付渠道索要的支付订单号，与第三方支付渠道唯一标示)";
	public static final String ALIAS_ORDER_STATUS = "订单流程状态(0-待付款，1-待审核，2-已驳回，3-已通过)";
	public static final String ALIAS_PAY_TIME = "付款时间";
	public static final String ALIAS_PAYABLE_GOODS_AMOUNT = "商品总金额(包含所有商品的价格总和)";
	public static final String ALIAS_PAYABLE_AMOUNT = "应付订单金额(打折或积分抵扣前所要付的总金额)";
	public static final String ALIAS_ACTUAL_PAYMENTS = "实付订单金额(打折或积分抵扣或使用优惠券等之后+运费的付款)";
	public static final String ALIAS_IS_USE_SCORE = "是否使用积分(0否;1是)";
	public static final String ALIAS_SCORE_COUNT = "积分数量";
	public static final String ALIAS_ADD_TIME = "下单时间";
	public static final String ALIAS_EXPIRE_DATE = "订单过期时间";
	public static final String ALIAS_IS_EXPIRE = "是否过期(0否;1是)";
	public static final String ALIAS_PAYMENT_DATE = "支付完成时间";
	public static final String ALIAS_MODIFY_DATE = "修改时间";
	public static final String ALIAS_INTRO = "作品介绍";
	public static final String ALIAS_PAY_CHANNEL = "支付渠道（1支付宝，2微信,3银联，4余额）";
	public static final String ALIAS_IS_DELETE = "是否删除 (0否;1是)";
	public static final String ALIAS_MEMBER_ID = "下单用户id";
	public static final String ALIAS_IS_PHONE_ORDER = "是否手机下单";
	public static final String ALIAS_REJECT_REASON = "驳回原因";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 角色选拔ID       db_column: ROLE_SELECT_ID 
     */	
	@NotNull 
	private java.lang.Long roleSelectId;
    /**
     * 角色管理ID       db_column: ROLE_MANAGER_ID 
     */
	@NotNull
	private java.lang.Long roleManagerId;
    /**
     * 订单编号       db_column: SN 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String sn;
    /**
     * 交易号(对应第三方支付渠道索要的支付订单号，与第三方支付渠道唯一标示)       db_column: TRADE_NO 
     */	
	@Length(max=100)
	private java.lang.String tradeNo;
    /**
     * 订单流程状态(0-待付款，1-待审核，2-已驳回，3-已通过)       db_column: ORDER_STATUS 
     */	
	@NotNull 
	private Integer orderStatus;
    /**
     * 付款时间       db_column: PAY_TIME 
     */	
	
	private java.lang.Long payTime;
    /**
     * 总金额(包含所有商品的价格总和)       db_column: PAYABLE_GOODS_AMOUNT
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
     * 积分数量       db_column: SCORE_COUNT 
     */	
	
	private java.lang.Integer scoreCount;
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
     * 是否手机下单       db_column: IS_PHONE_ORDER 
     */	
	@NotNull 
	private Integer isPhoneOrder;
    /**
     * 驳回原因       db_column: REJECT_REASON 
     */	
	@Length(max=256)
	private java.lang.String rejectReason;
	//columns END

	/**
	 * 作品介绍       db_column: INTRO
	 */
	@Length(max=1000)
	private java.lang.String intro;
	/**
	 * 视频地址       db_column: VIDEO_URL
	 */
	@Length(max=1000)
	private java.lang.String videoUrl;

	private java.lang.Long votesCnt;

	/**
	 * 审核时间       db_column: AUDIT_TIME
	 */
	private java.lang.Long auditTime;


	public RuleManagerOrder(){
	}

	public RuleManagerOrder(
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
	public void setRoleSelectId(java.lang.Long value) {
		this.roleSelectId = value;
	}
	
	public java.lang.Long getRoleSelectId() {
		return this.roleSelectId;
	}
	public void setRoleManagerId(java.lang.Long value) {
		this.roleManagerId = value;
	}
	
	public java.lang.Long getRoleManagerId() {
		return this.roleManagerId;
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
	public void setScoreCount(java.lang.Integer value) {
		this.scoreCount = value;
	}
	
	public java.lang.Integer getScoreCount() {
		return this.scoreCount;
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
	public void setIntro(java.lang.String value) {
		this.intro = value;
	}
	
	public java.lang.String getIntro() {
		return this.intro;
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
	public void setIsPhoneOrder(Integer value) {
		this.isPhoneOrder = value;
	}
	
	public Integer getIsPhoneOrder() {
		return this.isPhoneOrder;
	}
	public void setRejectReason(java.lang.String value) {
		this.rejectReason = value;
	}
	
	public java.lang.String getRejectReason() {
		return this.rejectReason;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public Long getVotesCnt() {
		return votesCnt;
	}

	public void setVotesCnt(Long votesCnt) {
		this.votesCnt = votesCnt;
	}

	public Long getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Long auditTime) {
		this.auditTime = auditTime;
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
		if(obj instanceof RuleManagerOrder == false) return false;
		if(this == obj) return true;
		RuleManagerOrder other = (RuleManagerOrder)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	/**
	 * id 密文
	 */
	private String idCipher;
	private String memberIdCipher;

	public String getMemberIdCipher() {
		memberIdCipher= CodeEncryption.encryption(getMemberId());
		return memberIdCipher;
	}

	public void setMemberIdCipher(String memberIdCipher) {
		this.memberIdCipher = memberIdCipher;
	}

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}
}

