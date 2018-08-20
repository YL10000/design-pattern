/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Encryptor.java
 * @Package com.life.design.pattern.decorator.encrypy
 * @Description: 抽象加密器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:07:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator.encrypy;

/**
 * @Title: Encryptor
 * @Description: 抽象加密器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:07:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Encryptor {
	
	private Encryptor encryptor;
	
	public Encryptor() {
		super();
	}

	public Encryptor(Encryptor encryptor) {
		super();
		this.encryptor = encryptor;
	}

	public Encryptor getEncryptor() {
		return encryptor;
	}

	public void setEncryptor(Encryptor encryptor) {
		this.encryptor = encryptor;
	}

	public String encrypy(String source) {
		System.out.println(source);
		return source;
	};
}
