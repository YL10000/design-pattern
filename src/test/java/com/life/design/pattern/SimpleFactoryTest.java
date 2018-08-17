/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SimpleFactoryTest.java
 * @Package com.life.desgn.pattern
 * @Description: 简单工厂测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月9日 上午10:18:08
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.life.design.pattern.simple.factory.Fruit;
import com.life.design.pattern.simple.factory.FruitFactory;

/**
 * @Title: SimpleFactoryTest
 * @Description: 简单工厂测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月9日 上午10:18:08
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */

public class SimpleFactoryTest {

	@Test
	public void fruitFactoryTest() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		Fruit fruit=FruitFactory.getInstance();
		System.out.println(fruit);
		fruit.shapeInfo();
	}
}
