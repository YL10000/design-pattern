/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SerialEncrypy.java
 * @Package com.life.design.pattern.decorator.encrypy
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:05:10
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator.encrypy;

/**
 * @Title: SerialEncrypy
 * @Description: 串行加密
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:05:10
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SerialEncrypy extends Encryptor {

	public SerialEncrypy(Encryptor encryptor) {
		super(encryptor);
	}

	@Override
	public String encrypy(String source) {
		source=getEncryptor().encrypy(source);
		System.out.println(source+"->串行加密");
		return source+"->串行加密";
	}
}
