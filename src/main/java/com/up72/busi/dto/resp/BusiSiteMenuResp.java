/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2015
 */

package com.up72.busi.dto.resp;

import com.up72.busi.model.BusiSiteMenu;


/**
 * 站点菜单输出
 * 
 * @author up72
 * @version 1.0
 * @since 1.0
 */
public class BusiSiteMenuResp extends BusiSiteMenu {
    /** 旗下的子菜单的数量 */
    private Integer subMenuCnt;

    public Integer getSubMenuCnt() {
        return subMenuCnt;
    }

    public void setSubMenuCnt(Integer subMenuCnt) {
        this.subMenuCnt = subMenuCnt;
    }
}