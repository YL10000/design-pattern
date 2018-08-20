/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PageControl.java
 * @Package com.life.design.pattern.composite.page.control
 * @Description: 抽象构件-页面控件类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:31:41
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.page.control;

/**
 * @Title: PageControl
 * @Description: 抽象构件-页面控件类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:31:41
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class PageControl {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PageControl() {
		super();
	}

	public PageControl(String name) {
		super();
		this.name = name;
	}

	public void addControl(PageControl control) {
		System.out.println("单元控件不支持添加控件的方法");
	}
	
	public void removeControl(PageControl control) {
		System.out.println("单元控件不支持删除控件的方法");
	}
	
	public PageControl getControl(Integer index) {
		System.out.println("单元控件不支持获取控件的方法");
		return null;
	}
	
	public abstract void display();
}
