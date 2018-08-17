/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ImageReaderFactory.java
 * @Package com.life.desgn.pattern.factory.method.imgreader
 * @Description: 图片读取器抽象工厂
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:47:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method.imgreader;

/**
 * @Title: ImageReaderFactory
 * @Description: 图片读取器抽象工厂
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午4:47:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public interface ImageReaderFactory {

	ImageReader createReader();
}
