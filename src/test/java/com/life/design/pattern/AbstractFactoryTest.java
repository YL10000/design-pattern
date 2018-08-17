/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractFactoryTest.java
 * @Package com.life.desgn.pattern
 * @Description: 抽象工厂模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午9:36:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.IOException;

import org.junit.Test;

import com.life.design.pattern.abstract_.factory.SkinFactory;
import com.life.design.pattern.abstract_.factory.SkinFactoryUtils;
import com.life.design.pattern.abstract_.factory.SpringSkinFactory;

/**
 * @Title: AbstractFactoryTest
 * @Description: 抽象工厂模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午9:36:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AbstractFactoryTest {

	@Test
	public void skinFactroyTest() {
		SkinFactory skinFactory=new SpringSkinFactory();
		skinFactory.createButton().info();
		skinFactory.createTextBox().info();
		skinFactory.createCombobox().info();
	}
	
	@Test
	public void skinFactoryReflectTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		SkinFactory factory=SkinFactoryUtils.createSkinFactory();
		factory.createButton().info();
		factory.createTextBox().info();
		factory.createCombobox().info();
	}
}
