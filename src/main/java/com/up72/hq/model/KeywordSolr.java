package com.up72.hq.model;

import java.io.Serializable;

public class KeywordSolr
        implements Serializable
{
    private Long id;
    private String keyword;
    private String pinyin;
    private String abbre;
    private Long searchTimes;
    private Integer type = Integer.valueOf(1);

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getAbbre() {
        return this.abbre;
    }

    public void setAbbre(String abbre) {
        this.abbre = abbre;
    }

    public Long getSearchTimes() {
        return this.searchTimes;
    }

    public void setSearchTimes(Long searchTimes) {
        this.searchTimes = searchTimes;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}