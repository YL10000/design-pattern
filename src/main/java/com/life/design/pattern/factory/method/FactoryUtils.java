package com.life.design.pattern.factory.method;

import java.io.IOException;
import java.util.Properties;

public class FactoryUtils {

	private FactoryUtils() {};
	
	public static AbstractFruitFactory createFactory() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException{
		Properties properties=new Properties();
		properties.load(FactoryUtils.class.getResourceAsStream("/factory.properties"));
		return (AbstractFruitFactory) Class.forName(properties.getProperty("factoryType")).newInstance();
	}
}
