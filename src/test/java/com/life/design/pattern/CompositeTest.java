/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CompositeTest.java
 * @Package com.life.design.pattern
 * @Description: 组合模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:36:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.composite.Component;
import com.life.design.pattern.composite.Composite;
import com.life.design.pattern.composite.Leaf;
import com.life.design.pattern.composite.page.control.ContainerControl;
import com.life.design.pattern.composite.page.control.PageControl;
import com.life.design.pattern.composite.page.control.UnitControl;

/**
 * @Title: CompositeTest
 * @Description: 组合模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:36:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class CompositeTest {

	@Test
	public void compositeTest() {
		Component component=new Composite("容器0");
		Component composite1=new Composite("容器1");
		Component composite1_1=new Composite("容器1-1");
		Component composite2=new Composite("容器2");
		composite1.addComponent(new Leaf("叶子1-1"));
		composite1.addComponent(composite1_1);
		composite1_1.addComponent(new Leaf("叶子1-1-1"));
		composite2.addComponent(new Leaf("叶子2-1"));
		component.addComponent(composite1);
		component.addComponent(composite2);
		composite1_1.operation();
	}
	
	@Test
	public void transparnetCompositeTest01() {
		com.life.design.pattern.composite.transparent01.Component component=new com.life.design.pattern.composite.transparent01.Composite("容器0");
		com.life.design.pattern.composite.transparent01.Component composite1=new com.life.design.pattern.composite.transparent01.Composite("容器1");
		com.life.design.pattern.composite.transparent01.Component composite1_1=new com.life.design.pattern.composite.transparent01.Composite("容器1-1");
		com.life.design.pattern.composite.transparent01.Component composite2=new com.life.design.pattern.composite.transparent01.Composite("容器2");
		composite1.addComponent(new com.life.design.pattern.composite.transparent01.Leaf("叶子1-1"));
		composite1.addComponent(composite1_1);
		composite1_1.addComponent(new com.life.design.pattern.composite.transparent01.Leaf("叶子1-1-1"));
		composite2.addComponent(new com.life.design.pattern.composite.transparent01.Leaf("叶子2-1"));
		component.addComponent(composite1);
		component.addComponent(composite2);
		composite1_1.operation();
	}
	
	@Test
	public void transparnetCompositeTest02() {
		com.life.design.pattern.composite.transparent02.Composite component=new com.life.design.pattern.composite.transparent02.Composite("容器0");
		com.life.design.pattern.composite.transparent02.Composite composite1=new com.life.design.pattern.composite.transparent02.Composite("容器1");
		com.life.design.pattern.composite.transparent02.Composite composite1_1=new com.life.design.pattern.composite.transparent02.Composite("容器1-1");
		com.life.design.pattern.composite.transparent02.Composite composite2=new com.life.design.pattern.composite.transparent02.Composite("容器2");
		composite1.addComponent(new com.life.design.pattern.composite.transparent02.Leaf("叶子1-1"));
		composite1.addComponent(composite1_1);
		composite1_1.addComponent(new com.life.design.pattern.composite.transparent02.Leaf("叶子1-1-1"));
		composite2.addComponent(new com.life.design.pattern.composite.transparent02.Leaf("叶子2-1"));
		component.addComponent(composite1);
		component.addComponent(composite2);
		composite1_1.operation();
	}
	
	@Test
	public void pageControlTest() {
		PageControl window=new ContainerControl("窗口控件");
		PageControl panel01=new ContainerControl("中间面板01");
		PageControl panel02=new ContainerControl("中间面板02");
		panel01.addControl(new UnitControl("01按钮"));
		panel01.addControl(new UnitControl("01文本框"));
		
		panel02.addControl(new UnitControl("02按钮"));
		panel02.addControl(new UnitControl("02按钮"));
		
		window.addControl(panel01);
		window.addControl(panel02);
		
		window.display();
	}
}
