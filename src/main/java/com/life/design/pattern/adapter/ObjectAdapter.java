/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ObjectAdapter.java
 * @Package com.life.design.pattern.adapter
 * @Description: 对象适配器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午5:55:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.adapter;

/**
 * @Title: ObjectAdapter
 * @Description: 对象适配器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午5:55:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ObjectAdapter implements Target {
	
	private Adaptee01 adaptee01;
	
	private Adaptee02 adaptee02;
	
	public ObjectAdapter() {
		this.adaptee01 = new Adaptee01();
		this.adaptee02 = new Adaptee02();
	}

	@Override
	public void newMethod01() {
		this.adaptee01.oldMethod01();
	}

	@Override
	public void newMethod02() {
		this.adaptee02.oldMethod02();
	}
}
