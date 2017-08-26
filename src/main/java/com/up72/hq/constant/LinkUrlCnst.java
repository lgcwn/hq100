package com.up72.hq.constant;

import com.up72.hq.conf.SystemConfig;

/**
 * 第三方登录账号信息
 */
public class LinkUrlCnst {
    /**
     * 评选
     */
    public static class Choose{
        //角色选拔
        public static final String ROLE_SELECT_DETAIL_URL=SystemConfig.instants().getValue("do_main")+"/jsp/wap/choose/do.jsp?method=roleSelectPage&roleSelectId=";
        //评选之最
        public static final String MOST_DETAIL_URL=SystemConfig.instants().getValue("do_main")+"/jsp/wap/choose/do.jsp?method=chooseList&type=1&id=";
        //时事评选
        public static final String EVENTS_DETAIL_URL=SystemConfig.instants().getValue("do_main")+"/jsp/wap/choose/do.jsp?method=chooseList&type=2&id=";
    }
    /**
     * 资讯
     */
    public static class News{
        public static final String DETAIL_URL=SystemConfig.instants().getValue("do_main")+"/jsp/wap/news/do.jsp?method=pageDetails&newsId=";
    }
    /**
     * 资讯
     */
    public static class Video{
        public static final String DETAIL_URL=SystemConfig.instants().getValue("do_main")+"/jsp/wap/video/do.jsp?method=pageDetails&id=";
    }
}
