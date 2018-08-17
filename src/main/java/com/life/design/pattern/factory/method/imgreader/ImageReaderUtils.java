/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ImageReaderUtils.java
 * @Package com.life.desgn.pattern.factory.method.imgreader
 * @Description: 图片读取工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:55:53
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method.imgreader;

import java.io.IOException;
import java.util.Properties;

/**
 * @Title: ImageReaderUtils
 * @Description: 图片读取工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:55:53
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ImageReaderUtils {

	
	private ImageReaderUtils() {};
	
	public static ImageReaderFactory createReaderFactory() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Properties properties=new Properties();
		properties.load(ImageReaderUtils.class.getResourceAsStream("/factory.properties"));
		return (ImageReaderFactory) Class.forName(properties.getProperty("imageType")).newInstance();
	}
}
