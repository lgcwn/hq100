/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiReport;


/**
 * 统计报告输出
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiReportResp  extends  BusiReport{

    private Integer wapTotalCnt;
    private Integer wapIssueCnt;
    private Integer wapSensitiveCount;
    private Integer wapAuditingCnt;
    private Integer wapNotAuditingCnt;
    private Integer wapDelCnt;

    public Integer getWapTotalCnt() {
        return wapTotalCnt;
    }

    public void setWapTotalCnt(Integer wapTotalCnt) {
        this.wapTotalCnt = wapTotalCnt;
    }

    public Integer getWapIssueCnt() {
        return wapIssueCnt;
    }

    public void setWapIssueCnt(Integer wapIssueCnt) {
        this.wapIssueCnt = wapIssueCnt;
    }

    public Integer getWapSensitiveCount() {
        return wapSensitiveCount;
    }

    public void setWapSensitiveCount(Integer wapSensitiveCount) {
        this.wapSensitiveCount = wapSensitiveCount;
    }

    public Integer getWapAuditingCnt() {
        return wapAuditingCnt;
    }

    public void setWapAuditingCnt(Integer wapAuditingCnt) {
        this.wapAuditingCnt = wapAuditingCnt;
    }

    public Integer getWapNotAuditingCnt() {
        return wapNotAuditingCnt;
    }

    public void setWapNotAuditingCnt(Integer wapNotAuditingCnt) {
        this.wapNotAuditingCnt = wapNotAuditingCnt;
    }

    public Integer getWapDelCnt() {
        return wapDelCnt;
    }

    public void setWapDelCnt(Integer wapDelCnt) {
        this.wapDelCnt = wapDelCnt;
    }
}