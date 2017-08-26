package com.up72.hq.dto.resp;

import com.alibaba.fastjson.JSONArray;
import com.up72.hq.constant.Cnst;
import com.up72.hq.model.CrowdOrder;
import com.up72.hq.model.OrderGoods;
import com.up72.hq.utils.Base64;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
public class CrowdOrderResp extends CrowdOrder {

    private Integer count;
    private String buyAgainCode;

    //公益订单
    private CrowdResp crowdResp;

    //退款状态 0退款中;1退款失败;2退款成功
    private Integer refundStatus;
    //退款金额
    private Double refundAmount;

    private  String payTimeStr;//付款时间
    private  String addTimeStr;//下单时间
    private  String expireDateStr;//过期时间
    private  String autoReceivedTimeStr;//自动确认收货时间
    private  String deliveryTimeStr;//发货时间
    private  String receivingTimeStr;//完成时间
    private  String cancelTimeStr;//取消时间

    /**订单商品*/
    private List<OrderGoods> goodses;
    private MemberResp memberResp;

    private Integer actualPaymentsInt;
    private String actualPaymentsStr;
    private Integer payableAmountInt;
    private String  payableAmountStr;

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public List<OrderGoods> getGoodses() {
        return goodses;
    }

    public void setGoodses(List<OrderGoods> goodses) {
        this.goodses = goodses;
    }

    public CrowdResp getCrowdResp() {
        return crowdResp;
    }

    public void setCrowdResp(CrowdResp crowdResp) {
        this.crowdResp = crowdResp;
    }

    public String getBuyAgainCode() {

            if(getGoodses() != null){
                String  codes [] =new String[getGoodses().size()];
               for(int i=0;i<getGoodses().size();i++){
                   String code="{goodsId:'"+getGoodses().get(i).getGoodsId()+"',cartId:'',count:'"+getGoodses().get(i).getGoodsCount()+"'}";
                   codes[i]=code;
               }
                buyAgainCode= Base64.getBASE64(JSONArray.toJSONString(codes));
            }


        return buyAgainCode;
    }

    public void setBuyAgainCode(String buyAgainCode) {
        this.buyAgainCode = buyAgainCode;
    }

    public String getPayTimeStr() {
        return Cnst.getFormatTime(super.getPayTime());
    }

    public void setPayTimeStr(String payTimeStr) {
        this.payTimeStr = payTimeStr;
    }

    public String getAddTimeStr() {
        return Cnst.getFormatTime(super.getAddTime());
    }

    public void setAddTimeStr(String addTimeStr) {
        this.addTimeStr = addTimeStr;
    }

    public String getExpireDateStr() {
        return Cnst.getFormatTime(super.getExpireDate());
    }

    public void setExpireDateStr(String expireDateStr) {
        this.expireDateStr = expireDateStr;
    }

    public String getAutoReceivedTimeStr() {
        return Cnst.getFormatTime(super.getAutoReceivedTime());
    }

    public void setAutoReceivedTimeStr(String autoReceivedTimeStr) {
        this.autoReceivedTimeStr = autoReceivedTimeStr;
    }

    public String getDeliveryTimeStr() {
        return Cnst.getFormatTime(super.getDeliveryTime());
    }

    public void setDeliveryTimeStr(String deliveryTimeStr) {
        this.deliveryTimeStr = deliveryTimeStr;
    }

    public String getReceivingTimeStr() {
        return Cnst.getFormatTime(super.getReceivingTime());
    }

    public void setReceivingTimeStr(String receivingTimeStr) {
        this.receivingTimeStr = receivingTimeStr;
    }

    public String getCancelTimeStr() {
        return Cnst.getFormatTime(super.getCancelTime());
    }

    public void setCancelTimeStr(String cancelTimeStr) {
        this.cancelTimeStr = cancelTimeStr;
    }

    public MemberResp getMemberResp() {
        return memberResp;
    }

    public void setMemberResp(MemberResp memberResp) {
        this.memberResp = memberResp;
    }

    public Integer getActualPaymentsInt() {
        double actualPayments=getActualPayments();
        return (int)(actualPayments);
    }

    public void setActualPaymentsInt(Integer actualPaymentsInt) {
        this.actualPaymentsInt = actualPaymentsInt;
    }

    public String getActualPaymentsStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getActualPayments() != null){
            actualPaymentsStr=df.format(getActualPayments());
        }
        return actualPaymentsStr;
    }

    public void setActualPaymentsStr(String actualPaymentsStr) {
        this.actualPaymentsStr = actualPaymentsStr;
    }

    public Integer getPayableAmountInt() {
        return (int)(getPayableAmount().doubleValue());
    }

    public void setPayableAmountInt(Integer payableAmountInt) {
        this.payableAmountInt = payableAmountInt;
    }

    public String getPayableAmountStr() {
        DecimalFormat df   = new DecimalFormat("######0.00");
        if(getPayableAmount() != null){
            payableAmountStr=df.format(getPayableAmount());
        }
        return payableAmountStr;
    }

    public void setPayableAmountStr(String payableAmountStr) {
        this.payableAmountStr = payableAmountStr;
    }
}
