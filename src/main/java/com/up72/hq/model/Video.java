/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.model;

import javax.validation.constraints.*;

import com.up72.framework.util.holder.ApplicationContextHolder;
import com.up72.hq.conf.SystemConfig;
import com.up72.hq.service.ICatService;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * (视频
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class Video implements java.io.Serializable {

    //alias
    public static final String TABLE_ALIAS = "视频管理";
    public static final String ALIAS_ID = "主键";
    public static final String ALIAS_CAT_ID = "分类";
    public static final String ALIAS_NAME = "视频名称";
    public static final String ALIAS_TIME = "时长";
    public static final String ALIAS_URL = "视频文件地址";
    public static final String ALIAS_INTRODUCTION = "视频介绍";
    public static final String ALIAS_QUIZ_ID = "竞猜ID";
    public static final String ALIAS_QUIZ_NAME = "竞猜名称";
    public static final String ALIAS_LOOK_CNT = "浏览量";
    public static final String ALIAS_PUBLISH = "发布时间";
    public static final String ALIAS_STATUS = "状态(0-待发布;1-已发布)";
    public static final String ALIAS_IMG = "展示图片";
    public static final String ALIAS_CAT_SELECT = "分类选项";


    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * 主键       db_column: ID
     */

    private java.lang.Long id;
    /**
     * 分类       db_column: CAT_ID
     */
    @NotNull
    private java.lang.Long catId;
    /**
     * 分类选项       db_column: CAT_SELECT
     */

    private java.lang.Long catSelect;
    /**
     * 视频名称       db_column: NAME
     */
    @NotBlank
    @Length(max = 30)
    private java.lang.String name;
    /**
     * 时长       db_column: TIME
     */
    @NotNull
    private java.lang.Integer time;
    /**
     * 视频文件地址       db_column: URL
     */
    @Length(max = 100)
    private java.lang.String url;
    /**
     * 视频展示图片       db_column: IMG
     */
    @Length(max = 100)
    private java.lang.String img;
    /**
     * 视频介绍       db_column: INTRODUCTION
     */
    @NotBlank
    @Length(max = 1000)
    private java.lang.String introduction;
    /**
     * 竞猜ID       db_column: QUIZ_ID
     */

    private java.lang.Long quizId;
    /**
     * 竞猜名称       db_column: QUIZ_NAME
     */
    @Length(max = 50)
    private java.lang.String quizName;
    /**
     * 浏览量       db_column: LOOK_CNT
     */
    @NotNull
    private java.lang.Integer lookCnt;
    /**
     * 发布时间      db_column: PUBLISH_TIME
     */
    @NotNull
    private java.lang.Long publishTime;
    /**
     * 状态(0-待发布;1-已发布)       db_column: STATUS
     */
    @NotNull
    private Integer status;
    //columns END

    private Cat cat;

    public Video() {
    }

    public Video(
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

    public void setCatId(java.lang.Long value) {
        this.catId = value;
    }

    public java.lang.Long getCatId() {
        return this.catId;
    }

    public void setName(java.lang.String value) {
        this.name = value;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setTime(java.lang.Integer value) {
        this.time = value;
    }

    public java.lang.Integer getTime() {
        return this.time;
    }

    public void setUrl(java.lang.String value) {
        this.url = value;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setIntroduction(java.lang.String value) {
        this.introduction = value;
    }

    public java.lang.String getIntroduction() {
        return this.introduction;
    }

    public void setQuizId(java.lang.Long value) {
        this.quizId = value;
    }

    public java.lang.Long getQuizId() {
        return this.quizId;
    }

    public void setQuizName(java.lang.String value) {
        this.quizName = value;
    }

    public java.lang.String getQuizName() {
        return this.quizName;
    }

    public void setLookCnt(java.lang.Integer value) {
        this.lookCnt = value;
    }

    public java.lang.Integer getLookCnt() {
        return this.lookCnt;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public java.lang.Long getPublishTime() {
        return publishTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getCatSelect() {
        return catSelect;
    }

    public void setCatSelect(Long catSelect) {
        this.catSelect = catSelect;
    }

    public void setPublishTime(java.lang.Long publishTime) {
        this.publishTime = publishTime;
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Video == false) return false;
        if (this == obj) return true;
        Video other = (Video) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }

    public Cat getCat() {
        ICatService catService = (ICatService) ApplicationContextHolder.getBean("catService");
        cat = catService.getById(getCatId());
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }


    private java.lang.String fileImg;

    public String getFileImg() {
        return SystemConfig.instants().getValue("file")+this.getImg();
    }
}

