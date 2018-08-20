/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: UnitControl.java
 * @Package com.life.design.pattern.composite.page.control
 * @Description: 单元控件--叶子类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:39:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.page.control;

/**
 * @Title: UnitControl
 * @Description: 单元控件--叶子类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:39:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class UnitControl extends PageControl {

	public UnitControl() {
		super();
	}

	public UnitControl(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println(getName());
	}
}
