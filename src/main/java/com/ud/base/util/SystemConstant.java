package com.ud.base.util;

import java.math.BigDecimal;

/**
 * 系统常量的定义
 * 
 * @author Simon_Xu
 *
 */

public class SystemConstant {
	private SystemConstant() {
	}

	public static final int DISPLAY_SCALE = 2;// 显示精度
	public static final int CAL_SCALE = 8;// 计算精度
	public static final int STORE_SCALE = 4;// 保存精度

	public static final BigDecimal ZERO = new BigDecimal("0.0000");// 系统与钱有关的的0的精确度
}
