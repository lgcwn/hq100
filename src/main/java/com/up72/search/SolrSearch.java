package com.up72.search;

import com.up72.hq.constant.Cnst;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/25.
 */
public class SolrSearch  {
    @Field
    private  String  id;
    @Field
    private  Long  sId;
    @Field
    private  String name;
    @Field
    private  Integer type;
    @Field
    private  String linkUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SolrSearch() {
    }

    public SolrSearch(String id,Long sId, String name, Integer type, String linkUrl) {
        this.id =id;
        this.sId = sId;
        this.name = name;
        this.type = type;
        this.linkUrl = linkUrl;
    }
}
