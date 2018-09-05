/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteSubject.java
 * @Package com.life.design.pattern.observer
 * @Description: 具体主题类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:38:06
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer;

/**
 * @Title: ConcreteSubject
 * @Description: 具体主题类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:38:06
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteSubject extends Subject{

	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update();
		}
	}
}
