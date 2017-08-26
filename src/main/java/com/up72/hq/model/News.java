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
 * 资讯
 *
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class News implements java.io.Serializable {

    //alias
    public static final String TABLE_ALIAS = "资讯";
    public static final String ALIAS_ID = "主键";
    public static final String ALIAS_CAT_ID = "分类";
    public static final String ALIAS_TITLE = "标题";
    public static final String ALIAS_INTRO = "详细";
    public static final String ALIAS_QUIZ_ID = "竞猜ID";
    public static final String ALIAS_QUIZ_NAME = "竞猜名称";
    public static final String ALIAS_LOOK_CNT = "浏览量";
    public static final String ALIAS_VIDEO_ID = "视频ID";
    public static final String ALIAS_VIDEO_NAME = "视频名称";
    public static final String ALIAS_CHOOSE = "评选ID";
    public static final String ALIAS_CHOOSE_NAME = "评选名称";
    public static final String ALIAS_CROWD_ID = "众筹ID";
    public static final String ALIAS_CROWD_NAME2 = "众筹名称";
    public static final String ALIAS_ADD_TIME = "添加时间";
    public static final String ALIAS_PUBLISH_TIME = "发布时间";
    public static final String ALIAS_STATUS = "状态(0-待发布;1-已发布)";
    public static final String ALIAS_IS_RECOMMEND = "是否推荐";
    public static final String ALIAS_IS_IMG = "是否有图";
    public static final String ALIAS_FIRST_IMG = "富文本中第一张图";


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
     * 标题       db_column: TITLE
     */
    @NotBlank
    @Length(max = 30)
    private java.lang.String title;
    /**
     * 详细       db_column: INTRO
     */
    @NotBlank
    @Length(max = 2147483647)
    private java.lang.String intro;
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
     * 视频ID       db_column: VIDEO_ID
     */

    private java.lang.Long videoId;
    /**
     * 视频名称       db_column: VIDEO_NAME
     */
    @Length(max = 50)
    private java.lang.String videoName;
   /**
     * 视频链接       db_column: VIDEO_LINK
     *//*
    @Length(max = 500)
    private java.lang.String videoLink;*/
    /**
     * 评选ID       db_column: CHOOSE_ID
     */

    private java.lang.Long chooseId;
    /**
     * 评选名称       db_column: CHOOSE_NAME
     */
    @Length(max = 50)
    private java.lang.String chooseName;
    /**
     * 评选链接       db_column: CHOOSE_LINK
     */
    @Length(max = 500)
    private java.lang.String chooseLink;
    /**
     * 众筹ID       db_column: CROWD_ID
     */

    private java.lang.Long crowdId;
    /**
     * 众筹名称       db_column: CROWD_NAME2
     */
    @Length(max = 50)
    private java.lang.String crowdName2;
    /**
     * 添加时间       db_column: ADD_TIME
     */
    @NotNull
    private java.lang.Long addTime;
    /**
     * 发布时间       db_column: PUBLISH_TIME
     */

    private java.lang.Long publishTime;
    /**
     * 状态(0-待发布;1-已发布)       db_column: STATUS
     */
    @NotNull
    private Integer status;
    /**
     * 是否推荐       db_column: IS_RECOMMEND
     */
    @NotNull
    private Integer isRecommend;
    /**
     * 是否有图       db_column: IS_IMG
     */
    @NotNull
    private Integer isImg;
    /**
     * 富文本中第一张图       db_column: FIRST_IMG
     */
    @Length(max = 500)
    private java.lang.String firstImg;

    /**
     * 推荐到首页(0-未推荐;1-已推荐)       db_column: TO_HOME
     */
    @NotNull
    private Integer toHome;

    /**
     * 资讯或旅游(0-资讯;1-旅游)       db_column: NEW_OR_TRAVEL
     */
    @NotNull
    private Integer newOrTravel;
    /**
     * 自动发布或手动发布(0-自动;1-手动)       db_column: AUTO_OR_MANUALLY
     */
    @NotNull
    private Integer autoOrManually;
    /**
     * 添加用户      db_column: ADD_USER
     */
    private Long addUser;

    /**
     * 新闻简介  db_column: NEW_PROFILES
     */
    @Length(max = 101)
    private String newProfiles;

    //columns END


    public News() {
    }

    public News(
            java.lang.Long id
    ) {
        this.id = id;
    }

    public Integer getNewOrTravel() {
        return newOrTravel;
    }

    public void setNewOrTravel(Integer newOrTravel) {
        this.newOrTravel = newOrTravel;
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

    public void setTitle(java.lang.String value) {
        this.title = value;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void setIntro(java.lang.String value) {
        this.intro = value;
    }

    public java.lang.String getIntro() {
        return this.intro;
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

    public void setVideoId(java.lang.Long value) {
        this.videoId = value;
    }

    public java.lang.Long getVideoId() {
        return this.videoId;
    }

    public void setVideoName(java.lang.String value) {
        this.videoName = value;
    }

    public java.lang.String getVideoName() {
        return this.videoName;
    }

    public void setChooseId(java.lang.Long value) {
        this.chooseId = value;
    }

    public java.lang.Long getChooseId() {
        return this.chooseId;
    }

    public void setChooseName(java.lang.String value) {
        this.chooseName = value;
    }

    public java.lang.String getChooseName() {
        return this.chooseName;
    }

    public void setCrowdId(java.lang.Long value) {
        this.crowdId = value;
    }

    public java.lang.Long getCrowdId() {
        return this.crowdId;
    }

    public void setCrowdName2(java.lang.String value) {
        this.crowdName2 = value;
    }

    public java.lang.String getCrowdName2() {
        return this.crowdName2;
    }

    public void setAddTime(java.lang.Long value) {
        this.addTime = value;
    }

    public java.lang.Long getAddTime() {
        return this.addTime;
    }

    public void setPublishTime(java.lang.Long value) {
        this.publishTime = value;
    }

    public java.lang.Long getPublishTime() {
        return this.publishTime;
    }

    public void setStatus(Integer value) {
        this.status = value;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setIsRecommend(Integer value) {
        this.isRecommend = value;
    }

    public Integer getIsRecommend() {
        return this.isRecommend;
    }

    public void setIsImg(Integer value) {
        this.isImg = value;
    }

    public Integer getIsImg() {
        return this.isImg;
    }

    public void setFirstImg(java.lang.String value) {
        this.firstImg = value;
    }

    public java.lang.String getFirstImg() {
        return this.firstImg;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Integer getToHome() {
        return toHome;
    }

    public void setToHome(Integer toHome) {
        this.toHome = toHome;
    }

    public String getNewProfiles() {
        return newProfiles;
    }

    public void setNewProfiles(String newProfiles) {
        this.newProfiles = newProfiles;
    }

    public String getChooseLink() {
        return chooseLink;
    }

    public void setChooseLink(String chooseLink) {
        this.chooseLink = chooseLink;
    }

    public Integer getAutoOrManually() {
        return autoOrManually;
    }

    public void setAutoOrManually(Integer autoOrManually) {
        this.autoOrManually = autoOrManually;
    }

    public Long getAddUser() {
        return addUser;
    }

    public void setAddUser(Long addUser) {
        this.addUser = addUser;
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof News == false) return false;
        if (this == obj) return true;
        News other = (News) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

