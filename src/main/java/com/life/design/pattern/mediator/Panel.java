/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Panel.java
 * @Package com.life.design.pattern.mediator
 * @Description: 抽象同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:45:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.mediator;

/**
 * @Title: Panel
 * @Description: 抽象同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:45:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Panel {
	
	private Mediator mediator;
	
	//依赖方法，与中介者通信
	public abstract void update();
	
	//自身方法
	public abstract void review();

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		//给当前同事类设置中介者
		this.mediator = mediator;
		mediator.addPanel(this);
	}
}
