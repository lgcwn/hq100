package com.up72.busi.constant;

/** 消息常量 */
public class BusiMsgCnst {

	public static final String SYSTEM_ERROR = "系统出现异常，无法处理您的请求。";
	public static final String RECORD_NOT_EXISTS = "记录不存在";
	public static final String RECORD_IS_DEL = "记录已删除";
	public static final String VALIDATE_FAIL = "数据校验失败";

	public static class SMS{
		public static String STATUS_SUCCESS = "Success";

		public static String SMS_VALIDATE_CODE = "您好,您的验证码是:{0}，请不要告诉别人哦【赢客云】";

	}

	/** 企业常量 */
	public static class CompanyCnst {

	}

	/** 实施记录 */
	public static class ImplRecordCnst{
		public static final String COMPANY_NOT_BLANK = "企业不能为空";
		public static final String RECHOOSE_COMPANY = "企业不存在，请关闭页面，重新选择";
		public static final String PUBLISH_STATUS_NOT_BLANK = "发布状态不能为空";
		public static final String ORDER_NOT_BLANK = "订单不能为空";
	}

	/** 文章模板常量 */
	public static class SiteTemplateCnst {
		public static final String RECHOOSE_TEMPLATE = "模板不存在，请关闭页面，重新选择";
		public static final String COMPANY_NOT_BLANK = "企业不能为空";
		public static final String TYPE_NOT_BLANK = "类型不能为空";
		public static final String NAME_NOT_BLANK = "名称不能为空";
		public static final String URL_NOT_BLANK = "路径不能为空";
		public static final String CONTENT_NOT_BLANK = "内容不能为空";
		public static final String NAME_LENGTH_OVER = "名称不能超过{0}个字";
		public static final String URL_LENGTH_OVER = "路径不能超过{0}个字";
		public static final String CONTENT_LENGTH_OVER = "内容不能超过{0}个字";
		public static final String NO_FILE_FOR_BACKUP = "没有模板可以备份";

	}

	/** 订单常量 */
	public static class OrderCnst {
		public static final String EDIT_NOT_PAY_ONLY = "只能修改未支付的订单";
		public static final String EDIT_PAY_ONLY = "只能修改已支付的订单";
		public static final String PAY_REMARK_NOT_BLANK = "付款备注不能为空";
		public static final String PAY_REMARK_LENGTH_OVER = "付款备注不能超过{0}个字";
		public static final String CANCEL_REMARK_NOT_BLANK = "取消理由不能为空";
		public static final String CANCEL_REMARK_LENGTH_OVER = "取消理由不能超过{0}个字";
		public static final String IMPL_USER_NOT_BLANK = "实施人不能为空";
		public static final String KF_USER_NOT_BLANK = "客服不能为空";
	}


	/** 用户 */
	public static class UserCnst {
		public static final String ROLE_NOT_BLANK = "角色不能为空";
		public static final String USER_NOT_EXISTS = "用户不存在";
		public static final String USER_NAME_NOT_BLANK = "用户不能为空";
		public static final String USER_NAME_EXISTS = "用户已经被占用，请修改";
		public static final String REAL_NAME_NOT_BLANK = "姓名不能为空";
		public static final String PASSWORD_NOT_BLANK = "密码不能为空";
		public static final String EMAIL_ILLEGAL = "邮箱格式不正确";
		public static final String EMAIL_EXISTS = "邮箱已经被占用，请修改";
		public static final String EMAIL_NOT_BLANK = "邮箱不能为空";
		public static final String PHONE_ILLEGAL = "手机格式不正确";
		public static final String PHONE_EXISTS = "手机已经被占用，请修改";
		public static final String PHONE_NOT_BLANK = "手机不能为空";
		public static final String DISABLE_REASON_LENGTH_OVER = "锁定原因不能超过{0}个字";
	}

	/** 标签 */
	public static class LabelCnst {
		public static final String LABEL_NOT_BLANK = "标签不能为空";
		public static final String SITE_MENU_NOT_BLANK = "站点菜单不能为空";
	}

	/** 消息 */
	public static class MessageCnst {
		public static final String SCHEDULE_TIME_NOT_BLANK = "定时时间不能为空";
		public static final String SCHEDULE_TIME_TOO_SMALL = "请将定时时间调大一点";
		public static final String CAN_NOT_CANCEL = "消息已经发送，不能取消定时";
		public static final String TITLE_NOT_BLANK = "消息标题不能为空";
		public static final String MSG_TYPE_NOT_BLANK = "消息类型不能为空";
		public static final String CONTENT_NOT_BLANK = "消息内容不能为空";
	}

	/** 工单 */
	public static class WorkOrderCnst {
		public static final String TYPE_NOT_BLANK = "工单类型不能为空";
		public static final String CONTENT_NOT_BLANK = "问题内容不能为空";
		public static final String ANSWER_NOT_BLANK = "回复内容不能为空";
	}

}
