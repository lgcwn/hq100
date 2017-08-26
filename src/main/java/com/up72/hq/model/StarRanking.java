/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.service.ICatService;
import com.up72.hq.utils.CodeEncryption;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * (明星排行)
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class StarRanking implements java.io.Serializable {

    //alias
    public static final String TABLE_ALIAS = "明星排行榜";
    public static final String ALIAS_ID = "主键";
    public static final String ALIAS_CAT_ID = "分类";
    public static final String ALIAS_NAME = "姓名";
    public static final String ALIAS_IMGS = "照片";
    public static final String ALIAS_REMARK = "个人简介";
    public static final String ALIAS_STATUS = "状态(1-待审核，2-已同意，3-已拒绝)";
    public static final String ALIAS_REAL_VOTES = "真实票数";
    public static final String ALIAS_VIRTUAL_VOTES = "虚拟票数";
    public static final String ALIAS_MEMBER_ID = "会员ID";
    public static final String ALIAS_ADD_TIME = "添加时间";
    public static final String ALIAS_AUDIT_TIME = "审核时间";


    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * 主键       db_column: id
     */

    private java.lang.Long id;
    /**
     * 分类       db_column: CAT_ID
     */
    @NotNull
    private Long catId;
    /**
     * 姓名       db_column: NAME
     */
    @NotBlank
    @Length(max = 30)
    private java.lang.String name;
    /**
     * 照片       db_column: IMGS
     */
    @NotBlank
    @Length(max = 500)
    private java.lang.String imgs;
    /**
     * 个人简介       db_column: CONTENT
     */
    @NotBlank @Length(max=2147483647)
    private java.lang.String content;

    @NotBlank @Length(max=2147483647)
    private java.lang.String remark;
    /**
     * 状态(1-待审核，2-已拒绝，3-已同意,4-已禁用)       db_column: STATUS
     */
    @NotNull
    private Integer status;
    /**
     * (真实票数)       db_column: REAL_VOTES
     */

    private java.lang.Integer realVotes;
    /**
     * (虚拟票数)       db_column: VIRTUAL_VOTES
     */

    private java.lang.Integer virtualVotes;
    /**
     * 会员ID       db_column: MEMBER_ID
     */
    private java.lang.Long memberId;
    /**
     * 添加时间       db_column: ADD_TIME
     */
    @NotNull
    private java.lang.Long addTime;
    /**
     * 审核时间       db_column: AUDIT_TIME
     */
    private java.lang.Long auditTime;
    /**
     *拒绝理由       db_column: REJECT_REASON
     */
    @Length(max = 500)
    private java.lang.String rejectReason;
    //columns END

    private Cat cat;

    public StarRanking() {
    }

    public StarRanking(
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

    public void setCatId(Long value) {
        this.catId = value;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setName(java.lang.String value) {
        this.name = value;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setImgs(java.lang.String value) {
        this.imgs = value;
    }

    public java.lang.String getImgs() {
        return this.imgs;
    }

    public void setRemark(java.lang.String value) {
        this.remark = value;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }

    public void setStatus(Integer value) {
        this.status = value;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setRealVotes(java.lang.Integer value) {
        this.realVotes = value;
    }

    public java.lang.Integer getRealVotes() {
        return this.realVotes;
    }

    public void setVirtualVotes(java.lang.Integer value) {
        this.virtualVotes = value;
    }

    public java.lang.Integer getVirtualVotes() {
        return this.virtualVotes;
    }

    public void setMemberId(java.lang.Long value) {
        this.memberId = value;
    }

    public java.lang.Long getMemberId() {
        return this.memberId;
    }

    public void setAddTime(java.lang.Long value) {
        this.addTime = value;
    }

    public java.lang.Long getAddTime() {
        return this.addTime;
    }

    public void setAuditTime(java.lang.Long value) {
        this.auditTime = value;
    }

    public java.lang.Long getAuditTime() {
        return this.auditTime;
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
        if (obj instanceof StarRanking == false) return false;
        if (this == obj) return true;
        StarRanking other = (StarRanking) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }

    public Cat getCat() {
        ICatService catService = (ICatService) ApplicationContextHolder.getBean("catService");
        cat = catService.getById(Long.valueOf(catId));
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    /**
     * id 密文
     */
    private String idCipher;

    public String getIdCipher() {
        idCipher= CodeEncryption.encryption(getId());
        return idCipher;
    }

    public void setIdCipher(String idCipher) {
        this.idCipher = idCipher;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

