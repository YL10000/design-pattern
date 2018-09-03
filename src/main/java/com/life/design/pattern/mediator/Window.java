/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Window.java
 * @Package com.life.design.pattern.mediator
 * @Description: 具体中介者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:44:21
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title: Window
 * @Description: 具体中介者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:44:21
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Window extends Mediator{

	//采用set集合来存储同事类，可以实现在mediator.addPanel()和 panel.setMediator()双向添加中介者
	private Set<Panel> panels=new HashSet<Panel>();
	
	@Override
	public void notifyPanel(Panel panel) {
		panels.stream().forEach((p)->{
			if (p!=panel) {
				p.review();
			}
		});
	}

	@Override
	public Mediator addPanel(Panel panel) {
		panels.add(panel);
		return this;
	}
}
