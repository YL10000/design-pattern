/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: XmlConverter.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: XML转换器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:05:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: XmlConverter
 * @Description: XML转换器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:05:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class XmlConverter extends Converter {

	@Override
	public void convert() {
		String text=getDataBase().readData();
		System.out.println("将"+text+"转换为xml");
	}
}
