/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AndroidGameFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Android系统下的游戏工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:02:52
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: AndroidGameFactory
 * @Description: Android系统下的游戏工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:02:52
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AndroidGameFactory implements GameFactory {

	@Override
	public OperationController createOperationController() {
		return new AndroidOperationController();
	}

	@Override
	public InterfaceController createInterfaceController() {
		return new AndroidInterfaceController();
	}

}
