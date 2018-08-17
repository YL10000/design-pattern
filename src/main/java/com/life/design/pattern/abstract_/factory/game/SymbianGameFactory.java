/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SymbianGameFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Symbian系统下的游戏工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:57:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: SymbianGameFactory
 * @Description: Symbian系统下的游戏工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:57:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SymbianGameFactory implements GameFactory {

	@Override
	public OperationController createOperationController() {
		return new SymbianOperationController();
	}

	@Override
	public InterfaceController createInterfaceController() {
		return new SymbianInterfaceController();
	}
}
