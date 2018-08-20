/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SeekModelEncryptor.java
 * @Package com.life.design.pattern.decorator.encrypy
 * @Description: 求模加密
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午8:04:02
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator.encrypy;

/**
 * @Title: SeekModelEncryptor
 * @Description: 求模加密
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午8:04:02
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SeekModelEncryptor extends Encryptor {

	public SeekModelEncryptor(Encryptor encryptor) {
		super(encryptor);
	}

	@Override
	public String encrypy(String source) {
		source=getEncryptor().encrypy(source);
		System.out.println(source+"->求模加密");
		return source+"->求模加密";
	}
}
