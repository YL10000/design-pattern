/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SummerTextBox.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: summer风格的textbox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:10:07
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SummerTextBox
 * @Description: summer风格的textbox
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:10:07
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SummerTextBox implements TextBox {

	@Override
	public void info() {
		System.out.println("summer textbox");
	}
}
