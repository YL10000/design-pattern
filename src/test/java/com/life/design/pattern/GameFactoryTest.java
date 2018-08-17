/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GameFactoryTest.java
 * @Package com.life.desgn.pattern
 * @Description: 游戏测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:32:06
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.IOException;

import org.junit.Test;

import com.life.design.pattern.abstract_.factory.game.AndroidGameFactory;
import com.life.design.pattern.abstract_.factory.game.GameFactory;
import com.life.design.pattern.abstract_.factory.game.GameFactoryUtils;

/**
 * @Title: GameFactoryTest
 * @Description: 游戏测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:32:06
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class GameFactoryTest {

	@Test
	public void createGameFactory() {
		GameFactory factory=new AndroidGameFactory();
		factory.createOperationController().info();
		factory.createInterfaceController().info();
	}
	
	@Test
	public void createGameFactoryReflect() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		GameFactory factory=GameFactoryUtils.createGameFactory();
		factory.createOperationController().info();
		factory.createInterfaceController().info();
	}
	
}
