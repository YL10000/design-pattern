/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: JpgImageReaderFactory.java
 * @Package com.life.desgn.pattern.factory.method.imgreader
 * @Description: jpg格式图片读取器工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:53:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method.imgreader;

/**
 * @Title: JpgImageReaderFactory
 * @Description: jpg格式图片读取器工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:53:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class JpgImageReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader createReader() {
		return new JpgImageReader();
	}
	
}
