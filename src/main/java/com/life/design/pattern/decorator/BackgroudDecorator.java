/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BackgroudDecorator.java
 * @Package com.life.design.pattern.decorator
 * @Description: 背景装饰器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:20:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator;

/**
 * @Title: BackgroudDecorator
 * @Description: 背景装饰器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:20:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BackgroudDecorator extends Decorator {

	public BackgroudDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("给"+getComponent().getClass().getName()+"设置背景");
	}
}
