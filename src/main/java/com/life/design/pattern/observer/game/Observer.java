/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Observer.java
 * @Package com.life.design.pattern.observer.game
 * @Description: 抽象观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:05:24
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.game;

/**
 * @Title: Observer
 * @Description: 抽象观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:05:24
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Observer {
	
	private String name;

	public Observer(String name) {
		super();
		this.name = name;
	}
	
	public abstract void help();
	
	public abstract void beAttacked(AllyControlCenter allyControlCenter);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
