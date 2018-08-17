/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SkinFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: 抽象皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:12:14
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

/**
 * @Title: SkinFactory
 * @Description: 抽象皮肤工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午9:12:14
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public interface SkinFactory {

	Button createButton();
	
	TextBox createTextBox();
	
	Combobox createCombobox();
}
