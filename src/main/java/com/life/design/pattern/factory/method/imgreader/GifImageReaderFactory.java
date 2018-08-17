/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GifImageReaderFactory.java
 * @Package com.life.desgn.pattern.factory.method.imgreader
 * @Description: gif格式图片读取器工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:49:24
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method.imgreader;

/**
 * @Title: GifImageReaderFactory
 * @Description: gif格式图片读取器工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:49:24
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class GifImageReaderFactory implements ImageReaderFactory {

	@Override
	public ImageReader createReader() {
		return new GifImageReader();
	}

}
