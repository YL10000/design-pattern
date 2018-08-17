/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PrivateEmail.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: 私人邮件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:51:40
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype;

/**
 * @Title: PrivateEmail
 * @Description: 私人邮件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:51:40
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PrivateEmail extends Email {

	private static final long serialVersionUID = 1L;


	@Override
	public void display() {
		System.out.println("private email");
	}
	
}
