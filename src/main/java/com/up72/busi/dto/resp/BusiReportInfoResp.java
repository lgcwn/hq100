/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import java.io.Serializable;


/**
 * 统计报告输出
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiReportInfoResp implements Serializable {

    private Integer notIssueCnt;
    private Integer notAuditingCnt;
    private Integer wapNotIssueCnt;
    private Integer wapNotAuditingCnt;
    private Integer isAuditing;
    private Integer issueSet;
    private Integer categoryCnt;
    private Integer labelCnt;

    public Integer getNotIssueCnt() {
        return notIssueCnt;
    }

    public void setNotIssueCnt(Integer notIssueCnt) {
        this.notIssueCnt = notIssueCnt;
    }

    public Integer getNotAuditingCnt() {
        return notAuditingCnt;
    }

    public void setNotAuditingCnt(Integer notAuditingCnt) {
        this.notAuditingCnt = notAuditingCnt;
    }

    public Integer getWapNotIssueCnt() {
        return wapNotIssueCnt;
    }

    public void setWapNotIssueCnt(Integer wapNotIssueCnt) {
        this.wapNotIssueCnt = wapNotIssueCnt;
    }

    public Integer getWapNotAuditingCnt() {
        return wapNotAuditingCnt;
    }

    public void setWapNotAuditingCnt(Integer wapNotAuditingCnt) {
        this.wapNotAuditingCnt = wapNotAuditingCnt;
    }

    public Integer getIsAuditing() {
        return isAuditing;
    }

    public void setIsAuditing(Integer isAuditing) {
        this.isAuditing = isAuditing;
    }

    public Integer getIssueSet() {
        return issueSet;
    }

    public void setIssueSet(Integer issueSet) {
        this.issueSet = issueSet;
    }

    public Integer getCategoryCnt() {
        return categoryCnt;
    }

    public void setCategoryCnt(Integer categoryCnt) {
        this.categoryCnt = categoryCnt;
    }

    public Integer getLabelCnt() {
        return labelCnt;
    }

    public void setLabelCnt(Integer labelCnt) {
        this.labelCnt = labelCnt;
    }
}