/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConverterUtils.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: 转换器工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:09:40
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

import java.util.Properties;

/**
 * @Title: ConverterUtils
 * @Description: 转换器工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:09:40
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConverterUtils {

	public static Converter getConverter() throws Exception {
		Properties properties=new Properties();
		properties.load(ConverterUtils.class.getResourceAsStream("/factory.properties"));
		Converter converter=(Converter) Class.forName(properties.getProperty("converter.class")).newInstance();
		converter.setDataBase((DataBase) Class.forName(properties.getProperty("converter.database")).newInstance());
		return converter;
		
	}
}
