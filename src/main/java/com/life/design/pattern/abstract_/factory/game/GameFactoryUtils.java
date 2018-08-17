/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GameFactoryUtils.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: 游戏工厂工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:04:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

import java.io.IOException;
import java.util.Properties;

/**
 * @Title: GameFactoryUtils
 * @Description: 游戏工厂工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午11:04:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class GameFactoryUtils {

	public static GameFactory createGameFactory() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Properties properties=new Properties();
		properties.load(GameFactoryUtils.class.getResourceAsStream("/factory.properties"));
		return (GameFactory) Class.forName(properties.getProperty("gameType")).newInstance();
	}
}
