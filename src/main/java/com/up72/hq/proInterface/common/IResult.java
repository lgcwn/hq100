package com.up72.hq.proInterface.common;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * 更新结果类：service 或者 action 返回值
 * @author sunchuanbao
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class IResult<T extends Object> implements Serializable {
	private static final long serialVersionUID = -3018631178292225535L;

	protected static Logger logger = LoggerFactory.getLogger(IResult.class);

	private String status;//操作 是否成功
	private String message;//返回消息
	private T data;//返回附加信息 可以是String、List、JSON、Map 类型

	/** 状态码与对应消息的枚举 */
	public enum StatusEnum {
		SUCCESS {
			public String getStatus(){return "10000";}
			public String getMsg(){return "请求成功";}
		},
		PARAM_NULL {
			public String getStatus(){return "10001";}
			public String getMsg(){return "参数为空";}
		},
		INVALID_REQUEST {
			public String getStatus(){return "10002";}
			public String getMsg(){return "请求不合法";}
		},
		INVALID_PARAM {
			public String getStatus(){return "10003";}
			public String getMsg(){return "参数格式错误";}
		},
		ERROR {
			public String getStatus(){return "20000";}
			public String getMsg(){return "系统错误";}
		};
		public abstract String getStatus();
		public abstract String getMsg();
	}

	public IResult() {}

	public IResult(StatusEnum statusEnum) {
		super();
		this.status = statusEnum.getStatus();
		this.message = statusEnum.getMsg();
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		if(this.data == null) {
			this.data = (T) ""; // 当data为null时，返回""，否则IOS接口会报错
		}
		return data;
	}

	public IResult setData(T data) {
		this.data = data;
		return this;
	}

	/**
	 * 设置返回成功
	 * @param data 数据
	 * @return IResult IResult对象本身
	 * @author HuKaiXuan 2014-8-4 下午6:58:43
	 */
	public IResult setSuccess(T data) {
		this.status = StatusEnum.SUCCESS.getStatus();
		this.message = StatusEnum.SUCCESS.getMsg();
		this.data = data;
		return this;
	}

	/**
	 * 设置返回失败，错误码是20000
	 * @param message 失败消息，可以为空
	 * @return IResult IResult对象本身
	 * @author HuKaiXuan 2014-8-4 下午6:59:00
	 */
	public IResult setError(String message){
		this.status = StatusEnum.ERROR.getStatus();
		if(StringUtils.isEmpty(message)) {
			this.message = StatusEnum.ERROR.getMsg();
		} else {
			this.message = message;
		}
		return this;
	}

	/**
	 * 设置通用的结果，可传data与自定义的message：
	 * 	调用方式1：不传data，与不传message，如：setCommon(StatusEnum.INVALID_PARAM);
	 * 	调用方式2：传data，不传message，如：setCommon(StatusEnum.INVALID_PARAM,new AuthUser());
	 *  调用方式3：传data，也传message，如：setCommon(StatusEnum.INVALID_PARAM,new AuthUser(),"参数userId不合法");
	 *  调用方式4：data为空，只传message，如：setCommon(StatusEnum.INVALID_PARAM,null,"参数userId不合法");
	 * @param statusEnum IResult.StatusEnum
	 * @param dataAndMsg 第一个参数为data，第二个参数为message
	 * @return
	 */
	public IResult setCommon(StatusEnum statusEnum,Object... dataAndMsg) {
		this.status = statusEnum.getStatus();
		this.message = statusEnum.getMsg();
		if(dataAndMsg.length > 0) {
			this.data = (T)dataAndMsg[0];
		}
		if(dataAndMsg.length > 1) {
			String tempMsg = (String)dataAndMsg[1];
			if(StringUtils.isNotBlank(tempMsg)) {
				this.message = tempMsg;
			}
		}
		return this;
	}


	/**
	 * 获取Map
	 * @param obj 某个Pojo类对象，如果：new AuthUser()
	 * @param fields 对象中要存入Map中的字段列表，如:new String[]{"id","userName"};
	 * @return Map<Object,Object>
	 * @author HuKaiXuan 2014-8-12 下午5:58:57
	 */
	public static Map<String,Object> getMap(Object obj,String[] fields) {
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		if(obj == null || fields == null || fields.length == 0) return map;
		for (String field : fields) {
			if(StringUtils.isBlank(field)) continue;
			String methodName = "get" + field.substring(0, 1).toUpperCase() + field.substring(1);
			try {
				Method getMethod = obj.getClass().getDeclaredMethod(methodName, null);
				Object value = getMethod.invoke(obj, null);
				map.put(field, value == null ? "" : value.toString());
			} catch (Exception e) {
				System.out.println("反射获取方法异常，已忽略" + fields + "字段。异常信息为：" + e.getMessage());
				continue;
			}
		}
		return map;
	}

	/**
	 * 获取Map
	 * @param list 某个Pojo类对象的集合，如果：List<AuthUser>
	 * @param fields 对象中要存入Map中的字段列表，如:new String[]{"id","userName"};
	 * @return Map<Object,Object>
	 * @author HuKaiXuan 2015-3-14 下午4:37:5
	 */
	public static List<Map<String, Object>> getMapList(List<?> list, String[] fields) {
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		if(list == null || list.size() == 0 || fields == null || fields.length == 0) return mapList;
		for(Object obj : list)
			mapList.add(getMap(obj,fields));
		return mapList;
	}

	public static void main(String[] args) {
	}
}