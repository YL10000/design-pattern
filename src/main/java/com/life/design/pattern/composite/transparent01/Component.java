/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Component.java
 * @Package com.life.design.pattern.composite.transparent
 * @Description: 抽象组件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:05:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.transparent01;

/**
 * @Title: Component
 * @Description: 抽象组件-透明组合模式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:05:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Component {

	private String name;
	
	public void addComponent(Component component) {
		System.out.println(getName()+"是叶子节点，不支持addComponent操作");
	}

	public void removeComponent(Component component) {
		System.out.println(getName()+"是叶子节点，不支持removeComponent操作");
	}

	public Component getComponent(int index) {
		System.out.println(getName()+"是叶子节点，不支持getComponent操作");
		return null;
	}
	
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
