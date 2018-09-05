/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AllyControlCenter.java
 * @Package com.life.design.pattern.observer.game
 * @Description: 站队控制中心
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:54:39
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.game;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: AllyControlCenter
 * @Description: 站队控制中心
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:54:39
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AllyControlCenter {

	//观察者列表
	protected List<Observer> observers=new ArrayList<>();
	
	public AllyControlCenter join(Observer observer) {
		observers.add(observer);
		System.out.println(observer.getName()+"加入到站队");
		return this;
	}
	
	public AllyControlCenter quit(Observer observer) {
		observers.remove(observer);
		System.out.println(observer.getName()+"离开了站队");
		return this;
	}
	
	public abstract void notifyObservers(String name);
	
}
