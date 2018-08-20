/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ContainerControl.java
 * @Package com.life.design.pattern.composite.page.control
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:50:41
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.page.control;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ContainerControl
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:50:41
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ContainerControl extends PageControl {

	private List<PageControl> controls=new ArrayList<>();
	
	public ContainerControl() {
		super();
	}

	public ContainerControl(String name) {
		super(name);
	}

	@Override
	public void addControl(PageControl control) {
		controls.add(control);
	}

	@Override
	public void removeControl(PageControl control) {
		controls.remove(control);
	}

	@Override
	public PageControl getControl(Integer index) {
		return controls.get(index);
	}

	@Override
	public void display() {
		System.out.println("======"+getName()+" start====");
		for(PageControl control:controls) {
			control.display();
		}
		System.out.println("======"+getName()+" end====");
	}
}
