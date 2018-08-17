/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SkinFactoryUtils.java
 * @Package com.life.desgn.pattern.abstract_.factory
 * @Description: 皮肤工厂工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午9:38:42
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory;

import java.io.IOException;
import java.util.Properties;

/**
 * @Title: SkinFactoryUtils
 * @Description: 皮肤工厂工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午9:38:42
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SkinFactoryUtils {

	public static SkinFactory createSkinFactory() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Properties properties=new Properties();
		properties.load(SkinFactory.class.getResourceAsStream("/factory.properties"));
		return (SkinFactory) Class.forName(properties.getProperty("skinType")).newInstance();
	}
}
