package com.up72.search;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/25.
 */
public class Search implements Serializable {
    @Field
    private  Long  id;
    @Field
    private  String name;
    @Field
    private  String title;
    @Field
    private  Integer type;
    @Field
    private  String linkUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}
