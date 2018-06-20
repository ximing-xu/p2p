package com.ud.base.util;


/**
 * 操作用户 状态 码的工具类
 * 
 * @author Simon_Xu
 *
 */
public class BitStatesUtils {
	
	private BitStatesUtils(){}
	
	public final static Long USER_PRIMARY_STATE = 1L; //用户注册成功的标示,及为默认初始状态
	public final static Long USER_BIND_PHONE = 2L << 0; //用户绑定手机状态码,2L就是1L << 1
	public final static Long USER_BIND_EMAIL = 2L << 1;//用户绑定邮箱
	public final static Long USER_BASE_INFO = 2L << 2;//填写基本资料
	public final static Long USER_REAL_AUTH = 2L << 3;//用户实名认证
	public final static Long USER_VEDIO_AUTH = 2L << 4;//视频认证
	public final static Long USER_HAS_BIDRQUEST=2L<<5;//当前用户有一个借款还在借款流程当中
	public final static Long USER_REALNAME_AUTH=2L<<6;//当前用户有一个借款还在借款流程当中

	/**
	 * 判断是否有某种状态
	 * 做位与运算可以判断某个位上是否是1,
	 * @param states
	 * @param value
	 * @return
	 */
	public static boolean hasState(long states, long value) {
		return (states & value) != 0;
	}

	/**
	 * 做或运算,可以在某个位上把0/1 都转化为1
	 * @param states
	 * @param value
	 * @return
	 */
	public static long addState(long states, long value) {
		if (hasState(states, value)) {
			return states;
		}
		return (states | value);
	}

	
	/**
	 * 做异或运算可以移除 某个位上的1,
	 * @param states
	 * @param value
	 * @return
	 */
	public static long removeState(long states, long value) {
		if (!hasState(states, value)) {
			return states;//如果本来就没有这种状态,那么就直接返回状态码
		}
		//否则做异或运算
		return states ^ value;
	}
}
