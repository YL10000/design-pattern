/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SpringCombobox.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: spring风格的combobox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:07:27
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SpringCombobox
 * @Description: spring风格的combobox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:07:27
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SpringCombobox implements Combobox {

	@Override
	public void info() {
		System.out.println("spring combobox");
	}
}
