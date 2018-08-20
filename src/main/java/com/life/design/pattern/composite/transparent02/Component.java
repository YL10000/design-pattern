/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Component.java
 * @Package com.life.design.pattern.composite.transparent02
 * @Description: 透明组合模式-抽象构件类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:57:19
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.transparent02;

/**
 * @Title: Component
 * @Description: 透明组合模式-抽象构件类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:57:19
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Component {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component() {
		super();
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public abstract void operation();
}
