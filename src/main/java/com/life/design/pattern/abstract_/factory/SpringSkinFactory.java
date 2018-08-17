/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SpringSkinFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: Spring风格的皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:14:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SpringSkinFactory
 * @Description: Spring风格的皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:14:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextBox createTextBox() {
		return new SpringTextBox();
	}

	@Override
	public Combobox createCombobox() {
		return new SpringCombobox();
	}
}
