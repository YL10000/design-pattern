/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Address.java
 * @Package com.life.desgn.pattern.prototype.consumer.deepcopy
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午10:09:38
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype.consumer.deepcopy;

import java.io.Serializable;

/**
 * @Title: Address
 * @Description: 深拷贝 客户地址类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午10:09:38
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
}
