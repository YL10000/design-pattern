/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BorderDecorator.java
 * @Package com.life.design.pattern.decorator
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:08:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator;

/**
 * @Title: BorderDecorator
 * @Description: 边框装饰器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:08:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BorderDecorator extends Decorator {
	
	private String color;

	public BorderDecorator(Component component) {
		super(component);
	}
	
	public void setBorderColor(String color) {
		this.color=color;
		System.out.println("设置边框的颜色为"+this.color);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("给"+getComponent().getClass().getName()+"添加边框");
		this.setBorderColor(this.color);
	}
}
