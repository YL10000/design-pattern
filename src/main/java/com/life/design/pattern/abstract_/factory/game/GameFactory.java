/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GameFactory.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: 游戏抽象工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:53:40
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: GameFactory
 * @Description: 游戏抽象工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:53:40
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public interface GameFactory {

	OperationController createOperationController();
	
	InterfaceController createInterfaceController();
}
