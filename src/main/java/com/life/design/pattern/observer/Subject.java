/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Subject.java
 * @Package com.life.design.pattern.observer
 * @Description: 抽象主题类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:32:28
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Subject
 * @Description: 抽象主题类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:32:28
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Subject {
	
	//观察者集合
	protected List<Observer> observers=new ArrayList<>();
	
	//添加观察者
	public Subject addObserver(Observer observer) {
		observers.add(observer);
		return this;
	}
	
	//删除观察者
	public Subject removeObserver(Observer observer) {
		observers.remove(observer);
		return this;
	}
	
	//通知观察者更新
	public abstract void notifyObservers();
}
