/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FactoryTest.java
 * @Package com.life.desgn.pattern
 * @Description: 工厂方法模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:57:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.IOException;

import org.junit.Test;

import com.life.design.pattern.factory.method.AbstractFruitFactory;
import com.life.design.pattern.factory.method.AppleFactory;
import com.life.design.pattern.factory.method.FactoryUtils;
import com.life.design.pattern.simple.factory.Fruit;

/**
 * @Title: FactoryTest
 * @Description: 工厂方法模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:57:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FactoryTest {
	
	@Test
	public void factoryMethodTest() {
		AbstractFruitFactory fruitFactory=new AppleFactory();
		Fruit apple=fruitFactory.createFruit();
		System.out.println(apple);
	}
	
	@Test
	public void factoryMethodReflectTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		AbstractFruitFactory fruitFactory=FactoryUtils.createFactory();
		Fruit fruit=fruitFactory.createFruit();
		System.out.println(fruit);
	}
}
