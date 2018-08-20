/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Decorator.java
 * @Package com.life.design.pattern.decorator
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:57:10
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator;

/**
 * @Title: Decorator
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:57:10
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Decorator extends Component {
	
	private Component component;
	
	public Decorator() {
		super();
	}

	public Decorator(Component component) {
		super();
		this.component = component;
	}
	
	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void display() {
		component.display();
	}
}
