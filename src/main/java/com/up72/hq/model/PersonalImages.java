package com.up72.hq.model;

import com.up72.hq.utils.CodeEncryption;

import java.io.Serializable;

/**
 * Created by lt on 2016/7/7.
 */
public class PersonalImages implements Serializable {

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 用户Id
     */
    private Long memberId;

    /**
     * 图片路径
     */
    private String imagePath;


    private Long imageOrder;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(Long imageOrder) {
        this.imageOrder = imageOrder;
    }

//    密文
    private String memberIdCipher;

    public String getMemberIdCipher() {
        memberIdCipher= CodeEncryption.encryption(getMemberId());
        return memberIdCipher;
    }

    public void setMemberIdCipher(String memberIdCipher) {
        this.memberIdCipher = memberIdCipher;
    }
}
