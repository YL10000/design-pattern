/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Attachment.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: 周报附件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午3:47:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype;

import java.io.Serializable;

/**
 * @Title: Attachment
 * @Description: 周报附件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午3:47:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Attachment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Attachment [name=" + name + "]";
	}
	
	public Attachment() {
		super();
	}

	public Attachment(String name) {
		super();
		this.name = name;
	}
}
