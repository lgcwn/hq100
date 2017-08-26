/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.hq.dto.resp;

import com.up72.hq.model.Cat;

import java.util.List;


/**
 *
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class CatTwoLevelResp extends Cat {

    /** */
    private List<Cat> subCatList;

    public List<Cat> getSubCatList() {
        return subCatList;
    }

    public void setSubCatList(List<Cat> subCatList) {
        this.subCatList = subCatList;
    }
}