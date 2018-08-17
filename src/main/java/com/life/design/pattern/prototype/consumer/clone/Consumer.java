/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Consumer.java
 * @Package com.life.desgn.pattern.prototype.consumer.clone
 * @Description: 浅拷贝 客户类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午9:57:09
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype.consumer.clone;

/**
 * @Title: Consumer
 * @Description: 浅拷贝 客户类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午9:57:09
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Consumer implements Cloneable {

	private String name;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Consumer() {
		super();
	}

	public Consumer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Consumer [name=" + name + ", address=" + address + "]";
	}

	@Override
	public Consumer clone() throws CloneNotSupportedException {
		return (Consumer) super.clone();
	}
	
	
}
