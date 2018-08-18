/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WritingBrushUtils.java
 * @Package com.life.design.pattern.bridge
 * @Description: 毛笔工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:33:16
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

import java.util.Properties;

/**
 * @Title: WritingBrushUtils
 * @Description: 毛笔工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:33:16
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WritingBrushUtils {

	public static WritingBrush getWritingBrushUtils() throws Exception {
		Properties properties=new Properties();
		properties.load(WritingBrushUtils.class.getResourceAsStream("/factory.properties"));
		WritingBrush brush=(WritingBrush) Class.forName(properties.getProperty("brush.class")).newInstance();
		brush.setColor((Color) Class.forName(properties.getProperty("brush.color")).newInstance());
		brush.setLineStyle((LineStyle) Class.forName(properties.getProperty("brush.style")).newInstance());
		return brush;
	}
}
