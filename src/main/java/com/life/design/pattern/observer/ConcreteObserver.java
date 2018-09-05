/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteObserver.java
 * @Package com.life.design.pattern.observer
 * @Description: 具体观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:43:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer;

/**
 * @Title: ConcreteObserver
 * @Description: 具体观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:43:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("观察者观察到变化，自动更新");
	}
}
