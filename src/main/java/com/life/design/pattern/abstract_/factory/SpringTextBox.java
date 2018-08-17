/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SpringTextBox.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: spring 风格的textbox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:06:28
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SpringTextBox
 * @Description: spring 风格的textbox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:06:28
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SpringTextBox implements TextBox {

	@Override
	public void info() {
		System.out.println("spring textbox");
	}
}
