package com.up72.hq.dto.resp;

import com.up72.hq.model.MemberAddress;

/**
 * Created by ktmt on 2016/6/30.
 */
public class MemberAddressResp extends MemberAddress {


    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
