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
 * 角色选拔
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
public class RoleSelect  implements java.io.Serializable{
	
	//alias
	public static final String TABLE_ALIAS = "角色选拔";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "名称";
	public static final String ALIAS_TILE = "副标题";
	public static final String ALIAS_SIGN_MONEY = "报名费";
	public static final String ALIAS_SIGN_START_TIME = "报名开始时间";
	public static final String ALIAS_SIGN_END_TIME = "报名结束时间";
	public static final String ALIAS_VOTE_START_TIME = "投票开始时间";
	public static final String ALIAS_VOTE_END_TIME = "投票结束时间";
	public static final String ALIAS_ADD_TIME = "添加时间";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_BANNER = "BANNER图";
	public static final String ALIAS_COVER_IMG = "封面图";
	public static final String ALIAS_CP_INTRO = "筹拍计划";
	public static final String ALIAS_JQ_INTRO = "剧情介绍";
	public static final String ALIAS_PX_INTRO = "评选规则";
	
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: ID 
     */	
	
	private java.lang.Long id;
    /**
     * 名称       db_column: NAME 
     */	
	@NotBlank @Length(max=10)
	private java.lang.String name;
    /**
     * 副标题       db_column: TILE 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String tile;
    /**
     * 报名费       db_column: SIGN_MONEY 
     */	
	@NotNull 
	private java.lang.Integer signMoney;
    /**
     * 投票所需积分       db_column: VOTE_POINTS
     */
	@NotNull
	private java.lang.Integer votePoints;
    /**
     * 报名开始时间       db_column: SIGN_START_TIME 
     */	
	@NotNull 
	private java.lang.Long signStartTime;
    /**
     * 报名结束时间       db_column: SIGN_END_TIME 
     */	
	@NotNull 
	private java.lang.Long signEndTime;
    /**
     * 投票开始时间       db_column: VOTE_START_TIME 
     */	
	@NotNull 
	private java.lang.Long voteStartTime;
    /**
     * 投票结束时间       db_column: VOTE_END_TIME 
     */	
	@NotNull 
	private java.lang.Long voteEndTime;
    /**
     * 添加时间       db_column: ADD_TIME 
     */	
	@NotNull 
	private java.lang.Long addTime;
    /**
     * 备注       db_column: REMARK 
     */	
	@NotBlank @Length(max=1000)
	private java.lang.String remark;
    /**
     * BANNER图       db_column: BANNER 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String banner;
    /**
     * 封面图       db_column: COVER_IMG
     */
	@NotBlank @Length(max=100)
	private java.lang.String coverImg;
    /**
     * 筹拍计划       db_column: CP_INTRO 
     */	
	@Length(max=2147483647)
	private java.lang.String cpIntro;
    /**
     * 剧情介绍       db_column: JQ_INTRO 
     */	
	@Length(max=2147483647)
	private java.lang.String jqIntro;
    /**
     * 评选规则       db_column: PX_INTRO 
     */	
	@Length(max=2147483647)
	private java.lang.String pxIntro;

	/**
	 * 状态（1-未开始，2-报名进行中，3-投票进行中，4-已结束,5-已下架）       db_column: STATUS
	 */
	@NotNull
	private Integer status;

	/**
	 * id 密文
	 */
	private String idCipher;
	//columns END

	public RoleSelect(){
	}

	public RoleSelect(
		java.lang.Long id
	){
		this.id = id;
	}

	public String getIdCipher() {
		idCipher= CodeEncryption.encryption(getId());
		return idCipher;
	}

	public void setIdCipher(String idCipher) {
		this.idCipher = idCipher;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}
	public void setTile(java.lang.String value) {
		this.tile = value;
	}
	
	public java.lang.String getTile() {
		return this.tile;
	}
	public void setSignMoney(java.lang.Integer value) {
		this.signMoney = value;
	}
	
	public java.lang.Integer getSignMoney() {
		return this.signMoney;
	}
	public void setSignStartTime(java.lang.Long value) {
		this.signStartTime = value;
	}
	
	public java.lang.Long getSignStartTime() {
		return this.signStartTime;
	}
	public void setSignEndTime(java.lang.Long value) {
		this.signEndTime = value;
	}
	
	public java.lang.Long getSignEndTime() {
		return this.signEndTime;
	}
	public void setVoteStartTime(java.lang.Long value) {
		this.voteStartTime = value;
	}
	
	public java.lang.Long getVoteStartTime() {
		return this.voteStartTime;
	}
	public void setVoteEndTime(java.lang.Long value) {
		this.voteEndTime = value;
	}
	
	public java.lang.Long getVoteEndTime() {
		return this.voteEndTime;
	}
	public void setAddTime(java.lang.Long value) {
		this.addTime = value;
	}
	
	public java.lang.Long getAddTime() {
		return this.addTime;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setBanner(java.lang.String value) {
		this.banner = value;
	}
	
	public java.lang.String getBanner() {
		return this.banner;
	}
	public void setCpIntro(java.lang.String value) {
		this.cpIntro = value;
	}
	
	public java.lang.String getCpIntro() {
		return this.cpIntro;
	}
	public void setJqIntro(java.lang.String value) {
		this.jqIntro = value;
	}
	
	public java.lang.String getJqIntro() {
		return this.jqIntro;
	}
	public void setPxIntro(java.lang.String value) {
		this.pxIntro = value;
	}
	
	public java.lang.String getPxIntro() {
		return this.pxIntro;
	}

	public String getCoverImg() {
		return coverImg;
	}

	public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
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
		if(obj instanceof RoleSelect == false) return false;
		if(this == obj) return true;
		RoleSelect other = (RoleSelect)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getVotePoints() {
		return votePoints;
	}

	public void setVotePoints(Integer votePoints) {
		this.votePoints = votePoints;
	}
}

