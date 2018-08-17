/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ImageReaderTest.java
 * @Package com.life.desgn.pattern
 * @Description: 图片读取器测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:59:28
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.IOException;

import org.junit.Test;

import com.life.design.pattern.factory.method.imgreader.ImageReader;
import com.life.design.pattern.factory.method.imgreader.ImageReaderFactory;
import com.life.design.pattern.factory.method.imgreader.ImageReaderUtils;

/**
 * @Title: ImageReaderTest
 * @Description: 图片读取器测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:59:28
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ImageReaderTest {

	@Test
	public void createReaderTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		ImageReaderFactory factory=ImageReaderUtils.createReaderFactory();
		ImageReader reader=factory.createReader();
		System.out.println(reader);
	}
}
