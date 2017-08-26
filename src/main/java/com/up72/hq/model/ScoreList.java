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
 * 积分明细
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class ScoreList implements java.io.Serializable {

    //alias
    public static final String TABLE_ALIAS = "积分管理";
    public static final String ALIAS_ID = "id";
    public static final String ALIAS_HQ_MEMBER_ID = "基础用户id";
    public static final String ALIAS_SCORE = "积分或T币";
    public static final String ALIAS_TYPE = "类型(1-获得；2-使用)";
    public static final String ALIAS_POINT_RULE_ID = "积分规则ID";
    public static final String ALIAS_REMARK = "使用记录详细";
    public static final String ALIAS_ADD_TIME = "addTime";
    public static final String ALIAS_SOURCE_TYPE = "来源类型(0订单;1充值 3 评论)";
    public static final String ALIAS_CONTENT_ID = "根据来源存储id";
    public static final String ALIAS_OVER_TIME = "过期时间";
    public static final String ALIAS_IS_OVER = "是否过期0否1是";
    public static final String ALIAS_SCORE_TYPE = "积分类型";


    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * id       db_column: ID
     */

    private java.lang.Long id;
    /**
     * 基础用户id       db_column: MEMBER_ID
     */
    @NotNull
    private java.lang.Long memberId;
    /**
     * 积分或T币       db_column: SCORE
     */
    @NotNull
    private java.lang.Integer score;
    /**
     * 类型(1-获得；2-使用)       db_column: TYPE
     */
    @NotNull
    private java.lang.Integer type;
    /**
     * 积分规则ID       db_column: POINT_RULE_ID
     */

    private java.lang.Long pointRuleId;
    /**
     * 使用记录详细       db_column: REMARK
     */
    @NotBlank
    @Length(max = 255)
    private java.lang.String remark;
    /**
     * addTime       db_column: ADD_TIME
     */
    @NotNull
    private java.lang.Long addTime;
    /**
     * 来源类型(0订单;1充值 3 评论)       db_column: SOURCE_TYPE
     */
    @NotNull
    private Integer sourceType;
    /**
     * 根据来源存储id       db_column: CONTENT_ID
     */

    private java.lang.Long contentId;
    /**
     * 过期时间       db_column: OVER_TIME
     */

    private java.lang.Long overTime;
    /**
     * 是否过期0否1是       db_column: IS_OVER
     */
    @Max(127)
    private Integer isOver;

    /**
     * Tb还是积分 1--T币 2--积分  db_column: TB_OR_JF
     */
    private Integer tbOrJf;
    //columns END

    public ScoreList() {
    }

    public ScoreList(
            java.lang.Long id
    ) {
        this.id = id;
    }

    public void setId(java.lang.Long value) {
        this.id = value;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setScore(java.lang.Integer value) {
        this.score = value;
    }

    public java.lang.Integer getScore() {
        return this.score;
    }

    public void setType(java.lang.Integer value) {
        this.type = value;
    }

    public java.lang.Integer getType() {
        return this.type;
    }

    public void setPointRuleId(java.lang.Long value) {
        this.pointRuleId = value;
    }

    public java.lang.Long getPointRuleId() {
        return this.pointRuleId;
    }

    public void setRemark(java.lang.String value) {
        this.remark = value;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }

    public void setAddTime(java.lang.Long value) {
        this.addTime = value;
    }

    public java.lang.Long getAddTime() {
        return this.addTime;
    }

    public void setSourceType(Integer value) {
        this.sourceType = value;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    public void setContentId(java.lang.Long value) {
        this.contentId = value;
    }

    public java.lang.Long getContentId() {
        return this.contentId;
    }

    public void setOverTime(java.lang.Long value) {
        this.overTime = value;
    }

    public java.lang.Long getOverTime() {
        return this.overTime;
    }

    public void setIsOver(Integer value) {
        this.isOver = value;
    }

    public Integer getIsOver() {
        return this.isOver;
    }

    public Integer getTbOrJf() {
        return tbOrJf;
    }

    public void setTbOrJf(Integer tbOrJf) {
        this.tbOrJf = tbOrJf;
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
        if (obj instanceof ScoreList == false) return false;
        if (this == obj) return true;
        ScoreList other = (ScoreList) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

