/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PublicEmail.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: 群邮件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:36:41
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype;

import java.util.List;

/**
 * @Title: PublicEmail
 * @Description: 群邮件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:36:41
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PublicEmail extends Email {
	
	private static final long serialVersionUID = 1L;

	private List<String> reviers=null;

	public List<String> getReviers() {
		return reviers;
	}

	public void setReviers(List<String> reviers) {
		this.reviers = reviers;
	}

	@Override
	public void display() {
		System.out.println("public email");
	}
}
