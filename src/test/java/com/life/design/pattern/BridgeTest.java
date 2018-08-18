/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BridgeTest.java
 * @Package com.life.design.pattern
 * @Description: 桥接模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:29:57
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.bridge.BlueColor;
import com.life.design.pattern.bridge.DottedLine;
import com.life.design.pattern.bridge.SmallWritingBrush;
import com.life.design.pattern.bridge.WritingBrush;
import com.life.design.pattern.bridge.WritingBrushUtils;
import com.life.design.pattern.bridge.data.convert.Converter;
import com.life.design.pattern.bridge.data.convert.ConverterUtils;

/**
 * @Title: BridgeTest
 * @Description: 桥接模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:29:57
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BridgeTest {

	@Test
	public void writingBrushTest() {
		WritingBrush brush=new SmallWritingBrush();
		brush.setColor(new BlueColor());
		brush.setLineStyle(new DottedLine());
		brush.paint();
	}
	
	@Test
	public void writingBrushReflectTest() throws Exception {
		WritingBrush brush=WritingBrushUtils.getWritingBrushUtils();
		brush.paint();
	}
	
	@Test
	public void converterTest() throws Exception {
		Converter converter=ConverterUtils.getConverter();
		converter.convert();
	}
}
