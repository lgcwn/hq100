package com.up72.busi.constant;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2015/5/26.
 */
public class BusiCnst {
	public static String ROOTPATH = "";
	public static String HOST = "";
	public static String CAS_LOGIN_PATH = "";

	public static String INIT = "init";
	/** 请求加密校验 key */
	public static final String ENCODER_KEY = "3b38e11ffd65698aedeb5ffc";

	public static int TRUE = 1;
	public static int FALSE = 0;

	/** 文件域 */
	public static class FileDomain{
		public static final String ADMIN = "admin";
		public static final String BUSI = "busi";
		public static final String CLOUD = "cloud";
		public static final String WX = "wx";
		public static final String YX = "yx";
		public static final String YC = "yc";
		public static final String DT = "dt";

		public static final String ADMIN_REPLACE = "__-__admin__-__";
		public static final String BUSI_REPLACE = "__-__busi__-__";
		public static final String CLOUD_REPLACE = "__-__cloud__-__";
		public static final String WX_REPLACE = "__-__wx__-__";
		public static final String YX_REPLACE = "__-__yx__-__";
		public static final String YC_REPLACE = "__-__yc__-__";
		public static final String DT_REPLACE = "__-__dt__-__";

	}

	/** 将日期格式化为2012-12-12的格式，不带时分秒 */
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
	/** 将日期格式化为2012-12-12 12:12:12的格式，带时分秒 */
	public static final SimpleDateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /** 将日期格式化为2012年12月12日 12:12的格式，带时分秒 */
    public static final SimpleDateFormat SDF_TIME_DATE = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
	/** 随机数 */
	public static final Random RANDOM = new Random();

	public static class OrderPayCnst{
		/** 支付宝支付 */
		public static final int PAY_TYPE_ALI = 1;
		/** 银联支付 */
		public static final int PAY_TYPE_UNION = 2;
		/** 微信支付 */
		public static final int PAY_TYPE_WEI_XIN = 3;
		/** 线下支付 */
		public static final int PAY_TYPE_OFFLINE = 4;
		/** 名称数组 */
		public static final String[] PAY_TYPE_NAME_ARR = new String[]{"支付宝支付","银联支付","微信支付","线下支付"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> PAY_TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(PAY_TYPE_ALI, PAY_TYPE_NAME_ARR[0]);
			put(PAY_TYPE_UNION, PAY_TYPE_NAME_ARR[1]);
			put(PAY_TYPE_WEI_XIN, PAY_TYPE_NAME_ARR[2]);
			put(PAY_TYPE_OFFLINE, PAY_TYPE_NAME_ARR[3]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> PAY_TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(PAY_TYPE_NAME_ARR[0], PAY_TYPE_ALI);
			put(PAY_TYPE_NAME_ARR[1], PAY_TYPE_UNION);
			put(PAY_TYPE_NAME_ARR[2], PAY_TYPE_WEI_XIN);
			put(PAY_TYPE_NAME_ARR[3], PAY_TYPE_OFFLINE);
		}};

		/** 支付成功 */
		public static final int PAY_STATUS_SUCCESS = 1;
		/** 支付失败 */
		public static final int PAY_STATUS_FAIL = 0;
	}

	public static class OrderCnst{
		public static final String PAY_METHOD_NAME_ONLINE = "线上支付";
		public static final String PAY_METHOD_NAME_OFFLINE = "线下支付";

		/** 未支付 */
		public static final int ORDER_STATUS_NOT_PAY = 0;
		/** 已支付 */
		public static final int ORDER_STATUS_PAID = 10;
		/** 已取消 */
		public static final int ORDER_STATUS_CANCEL = 50;

		/** 名称数组 */
		public static final String[] ORDER_STATUS_NAME_ARR = new String[]{"未支付","已支付","已取消"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> ORDER_STATUS_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(ORDER_STATUS_NOT_PAY, ORDER_STATUS_NAME_ARR[0]);
			put(ORDER_STATUS_PAID, ORDER_STATUS_NAME_ARR[1]);
			put(ORDER_STATUS_CANCEL, ORDER_STATUS_NAME_ARR[2]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> ORDER_STATUS_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(ORDER_STATUS_NAME_ARR[0], ORDER_STATUS_NOT_PAY);
			put(ORDER_STATUS_NAME_ARR[1], ORDER_STATUS_PAID);
			put(ORDER_STATUS_NAME_ARR[2], ORDER_STATUS_CANCEL);
		}};
	}

	public static class UserCnst{
		public static String REGISTER_PRIX = "register_mobile:";
		public static String FORGOT_MOBILE_PRIX = "forgot_mobile:";
		public static String SYSTEM_PROPERTIES = "system.properties";
		public static String SERVER_HOST = "server.host";

		/** 用户类型：初始用户 */
		public static final int TYPE_INIT_USER = 1;
		/** 用户类型：企业用户 */
		public static final int TYPE_BUSI_USER = 2;

		public static final int GENDER_FEMALE = 0;
		public static final int GENDER_MALE = 1;
		public static final int GENDER_SECRET = 2;

		/** 名称数组 */
		public static final String[] GENDER_NAME_ARR = new String[]{"女","男","保密"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> GENDER_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(GENDER_FEMALE, GENDER_NAME_ARR[0]);
			put(GENDER_MALE, GENDER_NAME_ARR[1]);
			put(GENDER_SECRET, GENDER_NAME_ARR[2]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> GENDER_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(GENDER_NAME_ARR[0], GENDER_FEMALE);
			put(GENDER_NAME_ARR[1], GENDER_MALE);
			put(GENDER_NAME_ARR[2], GENDER_SECRET);
		}};
	}

	/** 实施记录 */
	public static class ImplRecordCnst{
		public static final int ACTION_TYPE_IMPL = 0;
		public static final int ACTION_TYPE_PUBLISH = 1;
		/** 名称数组 */
		public static final String[] ACTION_TYPE_NAME_ARR = new String[]{"实施","发布"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> ACTION_TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(ACTION_TYPE_IMPL, ACTION_TYPE_NAME_ARR[0]);
			put(ACTION_TYPE_PUBLISH, ACTION_TYPE_NAME_ARR[1]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> ACTION_TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(ACTION_TYPE_NAME_ARR[0], ACTION_TYPE_IMPL);
			put(ACTION_TYPE_NAME_ARR[1], ACTION_TYPE_PUBLISH);
		}};
	}

	public static class SiteMenuCnst{
		/** 单页非控件 */
		public static final int TYPE_NOT_CONSOLE = 0;
		/** 单页控件 */
		public static final int TYPE_CONSOLE = 1;
		/** 文章系统 */
		public static final int TYPE_ARTICLE = 2;

		public static final String TYPE_PAGE_RADIO = "pageRadioButton";
		public static final String TYPE_ARTICLE_RADIO = "articleRadioButton";
	}

	/** 文件系统模板 */
	public static class SiteTemplateCnst {
		public static final int TYPE_PC = 0;
		public static final int TYPE_WAP = 1;
		/** 名称数组 */
		public static final String[] TYPE_NAME_ARR = new String[]{"网站模板","移动模板"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(TYPE_PC, TYPE_NAME_ARR[0]);
			put(TYPE_WAP, TYPE_NAME_ARR[1]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(TYPE_NAME_ARR[0], TYPE_PC);
			put(TYPE_NAME_ARR[1], TYPE_WAP);
		}};
	}

	/** 模板文件 */
	public static class SiteTemplateFileCnst {
		public static final int STATUS_ENABLE = 1;
		public static final int STATUS_DISABLE = 0;
		/** 名称数组 */
		public static final String[] STATUS_NAME_ARR = new String[]{"启用","禁用"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> STATUS_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(STATUS_ENABLE, STATUS_NAME_ARR[0]);
			put(STATUS_DISABLE, STATUS_NAME_ARR[1]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> STATUS_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(STATUS_NAME_ARR[0], STATUS_ENABLE);
			put(STATUS_NAME_ARR[1], STATUS_DISABLE);
		}};

		/** 文件类型 */
		public static final int FILE_TYPE_INDEX = 0;
		public static final int FILE_TYPE_CAT_INDEX = 1;
		public static final int FILE_TYPE_LIST = 2;
		public static final int FILE_TYPE_DEAIL = 3;

		/** 名称数组 */
		public static final String[] FILE_TYPE_NAME_ARR = new String[]{"首页模板","类别首页模板","文章列表页模板","文章详细页模板"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> FILE_TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(FILE_TYPE_INDEX, FILE_TYPE_NAME_ARR[0]);
			put(FILE_TYPE_CAT_INDEX, FILE_TYPE_NAME_ARR[1]);
			put(FILE_TYPE_LIST, FILE_TYPE_NAME_ARR[2]);
			put(FILE_TYPE_DEAIL, FILE_TYPE_NAME_ARR[3]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> FILE_TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(FILE_TYPE_NAME_ARR[0], FILE_TYPE_INDEX);
			put(FILE_TYPE_NAME_ARR[1], FILE_TYPE_CAT_INDEX);
			put(FILE_TYPE_NAME_ARR[2], FILE_TYPE_LIST);
			put(FILE_TYPE_NAME_ARR[3], FILE_TYPE_DEAIL);
		}};

	}

	/** 角色菜单关联 */
	public static class RoleMenuCnst{
		public static final int MENU_TYPE_MENU = 0;
		public static final int MENU_TYPE_SITE_MENU = 1;
	}

	public static class RoleCnst{
		public static final int ROLE_TYPE_BASIC = 0;
		public static final int ROLE_TYPE_COMPA = 1;
	}

	public static class ProductTypeCnst{
		public static final String EXISTS_NAME= "名称已存在";

	}

	/** 消息常量类 */
	public static class MessageCnst{
		public static final int MSG_TYPE_SYSTEM = 0;
		public static final int MSG_TYPE_FINANTIAL = 1;
		public static final int MSG_TYPE_WARNING = 2;
		/** 名称数组 */
		public static final String[] MSG_TYPE_NAME_ARR = new String[]{"系统类","财务类","警告类"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> MSG_TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(MSG_TYPE_SYSTEM, MSG_TYPE_NAME_ARR[0]);
			put(MSG_TYPE_FINANTIAL, MSG_TYPE_NAME_ARR[1]);
			put(MSG_TYPE_WARNING, MSG_TYPE_NAME_ARR[2]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> MSG_TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(MSG_TYPE_NAME_ARR[0], MSG_TYPE_SYSTEM);
			put(MSG_TYPE_NAME_ARR[1], MSG_TYPE_FINANTIAL);
			put(MSG_TYPE_NAME_ARR[2], MSG_TYPE_WARNING);
		}};


		public static final int USER_TYPE_COMPANY = 0;
		public static final int USER_TYPE_CUSTOMER = 1;
		/** 名称数组 */
		public static final String[] USER_TYPE_NAME_ARR = new String[]{"企业用户","C端用户"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> USER_TYPE_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(USER_TYPE_COMPANY, USER_TYPE_NAME_ARR[0]);
			put(USER_TYPE_CUSTOMER, USER_TYPE_NAME_ARR[1]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> USER_TYPE_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(USER_TYPE_NAME_ARR[0], USER_TYPE_COMPANY);
			put(USER_TYPE_NAME_ARR[1], USER_TYPE_CUSTOMER);
		}};

	}

	/** 工单常量类 */
	public static class WorkOrderCnst{
		public static final int STATUS_NOT_HANDLE = 0;
		public static final int STATUS_HANDLING = 1;
		public static final int STATUS_FINISH = 2;

		/** 名称数组 */
		public static final String[] STATUS_NAME_ARR = new String[]{"未处理","处理中","已完成"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> STATUS_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(STATUS_NOT_HANDLE, STATUS_NAME_ARR[0]);
			put(STATUS_HANDLING, STATUS_NAME_ARR[1]);
			put(STATUS_FINISH, STATUS_NAME_ARR[2]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> STATUS_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(STATUS_NAME_ARR[0], STATUS_NOT_HANDLE);
			put(STATUS_NAME_ARR[1], STATUS_HANDLING);
			put(STATUS_NAME_ARR[2], STATUS_FINISH);
		}};

		public static final int ANSWER_STATUS_WAITING_KF = 0;
		public static final int ANSWER_STATUS_WAITING_CUSTOMER = 1;

		/** 名称数组 */
		public static final String[] ANSWER_STATUS_NAME_ARR = new String[]{"待客服反馈","待用户反馈"};
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> ANSWER_STATUS_MAP_ID_NAME = new LinkedHashMap<Integer, String>() {{
			put(ANSWER_STATUS_WAITING_KF, ANSWER_STATUS_NAME_ARR[0]);
			put(ANSWER_STATUS_WAITING_CUSTOMER, ANSWER_STATUS_NAME_ARR[1]);
		}};
		/** Map，键为名称，值为ID */
		public static final Map<String, Integer> ANSWER_STATUS_MAP_NAME_ID = new LinkedHashMap<String, Integer>() {{
			put(ANSWER_STATUS_NAME_ARR[0], ANSWER_STATUS_WAITING_KF);
			put(ANSWER_STATUS_NAME_ARR[1], ANSWER_STATUS_WAITING_CUSTOMER);
		}};
	}

	public static class IssueSetCnst{
		/** 人工发布 */
		public static final int ISSUE_SET_PEOPLE = 0;
		/** 自动发布 */
		public static final int ISSUE_SET_AUTO = 1;
	}

	public static class ResourceCnst{
		public static class NavMenuCnst{
			public static String ALL = "全部文章";
			public static String NOT_ISSUE = "未发布";
			public static String ISSUE = "已发布";
			public static String NOT_AUDITING = "未审核";
			public static String AUDITING = "已审核";
			public static String RECYCLE = "回收站";
		}
	}

	public static class SiteCnst {
		public static String CS_Site = "Site";
		public static String CL_SiteCtrlData = "BusiSiteCtrlData";
		public static String CL_SiteCtrl = "BusiSiteCtrl";
	}

	public static class MenuCnst{
		// 链接类型
		public static final int LINK_TYPE_OUTER = 1;
		public static final int LINK_TYPE_SINGLE = 2;
		public static final int LINK_TYPE_ARTICLE = 3;
		/** 名称数组 */
		public static final String[] LINK_TYPE_NAME_ARR = new String[]{"外部链接","单页管理链接","文章系统链接"};
		public static final Map<Integer,String> LINK_TYPE_MAP = new LinkedHashMap<Integer,String>() {{
			put(LINK_TYPE_OUTER,LINK_TYPE_NAME_ARR[0]);
			put(LINK_TYPE_SINGLE,LINK_TYPE_NAME_ARR[1]);
			put(LINK_TYPE_ARTICLE,LINK_TYPE_NAME_ARR[2]);
		}};

		// 打开方式
		public static final int OPEN_TYPE_LEFT = 1;
		public static final int OPEN_TYPE_RIGHT = 2;
		public static final int OPEN_TYPE_OPEN = 3;
		/** 名称数组 */
		public static final String[] OPEN_TYPE_NAME_ARR = new String[]{"在左侧窗口打开","在右侧窗口打开","弹出新窗口"};
		public static final Map<Integer,String> OPEN_TYPE_MAP = new LinkedHashMap<Integer,String>() {{
			put(OPEN_TYPE_LEFT,OPEN_TYPE_NAME_ARR[0]);
			put(OPEN_TYPE_RIGHT,OPEN_TYPE_NAME_ARR[1]);
			put(OPEN_TYPE_OPEN,OPEN_TYPE_NAME_ARR[2]);
		}};
	}

	/** 企业类型 */
	public static class CompanyType {
		public static final int TYPE_STRATEGY = 1;
		public static final int TYPE_COOPERATE = 2;
		/** Map，键为ID，值为名称 */
		public static final Map<Integer, String> TYPE_MAP = new LinkedHashMap<Integer, String>() {{
			put(TYPE_STRATEGY, "战略型");
			put(TYPE_COOPERATE, "合作型");
		}};
	}
}
