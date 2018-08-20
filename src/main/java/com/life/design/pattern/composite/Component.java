/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Component.java
 * @Package com.life.design.pattern.composite
 * @Description: 抽象构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:24:47
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite;

/**
 * @Title: Component
 * @Description: 抽象构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:24:47
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Component {

	private String name;
	
	public abstract void addComponent(Component component);
	
	public abstract void removeComponent(Component component);
	
	public abstract Component getComponent(int index);
	
	public abstract void operation();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public Component() {
		super();
	}
}
