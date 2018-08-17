/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SummerSkinFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: Summer风格的皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:16:09
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SummerSkinFactory
 * @Description: Summer风格的皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:16:09
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextBox createTextBox() {
		return new SummerTextBox();
	}

	@Override
	public Combobox createCombobox() {
		return new SummerCombobox();
	}
}
