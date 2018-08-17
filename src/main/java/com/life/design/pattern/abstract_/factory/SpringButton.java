/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SpringButton.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: spring风格的button
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:04:50
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SpringButton
 * @Description: spring风格的button
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:04:50
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SpringButton implements Button {

	@Override
	public void info() {
		System.out.println("spring button");
	}
}
