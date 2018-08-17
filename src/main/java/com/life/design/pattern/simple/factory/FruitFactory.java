/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FruitFactory.java
 * @Package com.life.desgn.pattern.simple.factory
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月9日 上午10:15:10
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.simple.factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Title: FruitFactory
 * @Description: 水果工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月9日 上午10:15:10
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FruitFactory {

	private FruitFactory() {};
	
	/**
	 * 
	 * @Title: getInstance
	 * @Description: 通过客户端传递条件创建指定的水果类
	 * @Return: Fruit
	 */
	public static Fruit getInstance(Integer type) {
		if (type==1) {
			return new Apple();
		}else {
			return new Oranage();
		}
	}
	
	/**
	 * 
	 * @Title: getInstance
	 * @Description:通过反射机制，读取配置文件实现简单工厂模式
	 * @Return: Fruit
	 * @Throws
	 */
	public static Fruit getInstance() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties properties=new Properties();
		/**
		 * 如果配置文件在src/main/resources目录下，只能通过以下方式读取
		 * 如果配置文件不在src/main/resources目录下，可以通过prop.load(new InputStream("factory.properties"));
		 */
		properties.load(FruitFactory.class.getResourceAsStream("/factory.properties"));
		Fruit fruit=(Fruit) Class.forName(properties.getProperty("fruitClass")).newInstance();
		return fruit;
	}
}
