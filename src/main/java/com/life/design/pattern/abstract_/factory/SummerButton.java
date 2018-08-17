/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SummerButton.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: summer风格的button
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:09:10
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SummerButton
 * @Description: summer风格的button
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:09:10
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SummerButton implements Button {

	@Override
	public void info() {
		System.out.println("suumer button");
	}
}
