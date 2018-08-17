/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Address.java
 * @Package com.life.desgn.pattern.prototype.consumer.clone
 * @Description: 浅拷贝 客户地址类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午9:57:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype.consumer.clone;

/**
 * @Title: Address
 * @Description: 浅拷贝 客户地址类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午9:57:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Address implements Cloneable {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
