/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteAllyControlCenter.java
 * @Package com.life.design.pattern.observer.game
 * @Description: 具体站队控制中心
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:17:31
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.game;

/**
 * @Title: ConcreteAllyControlCenter
 * @Description: 具体站队控制中心
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:17:31
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

	@Override
	public void notifyObservers(String name) {
		for(Observer observer:observers) {
			if (!observer.getName().equals(name)) {
				observer.help();
			}
		}
	}

}
