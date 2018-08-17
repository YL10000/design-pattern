/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Consumer.java
 * @Package com.life.desgn.pattern.prototype.consumer.deepcopy
 * @Description: 深拷贝 客户类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午10:10:57
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype.consumer.deepcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Title: Consumer
 * @Description: 深拷贝 客户类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午10:10:57
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Consumer implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
	public Consumer deepCopy() throws Exception {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (Consumer) ois.readObject();
	}

}
