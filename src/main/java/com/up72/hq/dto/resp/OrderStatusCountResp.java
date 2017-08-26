package com.up72.hq.dto.resp;

/**
 * Created by liuguicheng on 16/5/24.
 */
public class OrderStatusCountResp implements  java.io.Serializable {

    private Integer toBePaidCount;//待支付

    private Integer toBeShippedCount;//待发货

    private Integer receiptOfGoodsCount;//待收货

    private Integer finishCount;//完成

    private Integer cancelCount;//取消

    private Integer rejectionCount;//拒收

    private Integer toBeSelfMentionedCount;//待自提

    private Integer newOrderCount;//新订单


    private Integer toBeEvaluated;//待评价


    public Integer getToBeEvaluated() {
        return toBeEvaluated;
    }

    public void setToBeEvaluated(Integer toBeEvaluated) {
        this.toBeEvaluated = toBeEvaluated;
    }

    public Integer getNewOrderCount() {
        if(newOrderCount == null )
            newOrderCount=0;
        return newOrderCount;
    }

    public void setNewOrderCount(Integer newOrderCount) {
        this.newOrderCount = newOrderCount;
    }

    public Integer getToBePaidCount() {
        if(toBePaidCount == null )
            toBePaidCount=0;
        return toBePaidCount;
    }

    public void setToBePaidCount(Integer toBePaidCount) {
        this.toBePaidCount = toBePaidCount;
    }

    public Integer getToBeShippedCount() {
        if(toBeShippedCount == null )
            toBeShippedCount=0;
        return toBeShippedCount;
    }

    public void setToBeShippedCount(Integer toBeShippedCount) {
        this.toBeShippedCount = toBeShippedCount;
    }

    public Integer getReceiptOfGoodsCount() {
        if(receiptOfGoodsCount == null )
            receiptOfGoodsCount=0;
        return receiptOfGoodsCount;
    }

    public void setReceiptOfGoodsCount(Integer receiptOfGoodsCount) {
        this.receiptOfGoodsCount = receiptOfGoodsCount;
    }

    public Integer getFinishCount() {
        if(finishCount == null )
            finishCount=0;
        return finishCount;
    }

    public void setFinishCount(Integer finishCount) {
        this.finishCount = finishCount;
    }

    public Integer getCancelCount() {
        if(cancelCount == null )
            cancelCount=0;
        return cancelCount;
    }

    public void setCancelCount(Integer cancelCount) {
        this.cancelCount = cancelCount;
    }

    public Integer getRejectionCount() {
        if(rejectionCount == null )
            rejectionCount=0;
        return rejectionCount;
    }

    public void setRejectionCount(Integer rejectionCount) {
        this.rejectionCount = rejectionCount;
    }

    public Integer getToBeSelfMentionedCount() {
        if(toBeSelfMentionedCount == null )
        toBeSelfMentionedCount=0;
        return toBeSelfMentionedCount;
    }

    public void setToBeSelfMentionedCount(Integer toBeSelfMentionedCount) {
        this.toBeSelfMentionedCount = toBeSelfMentionedCount;
    }
}
