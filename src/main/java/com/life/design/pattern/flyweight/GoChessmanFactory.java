/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GoChessmanFactory.java
 * @Package com.life.design.pattern.flyweight
 * @Description: 享元工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:31:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight;

import java.util.Hashtable;

/**
 * @Title: GoChessmanFactory
 * @Description: 享元工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:31:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class GoChessmanFactory {

	private GoChessmanFactory() {
		this.goChessmanPool=new Hashtable<>();
		goChessmanPool.put("white", new WhiteGoChessman());
		goChessmanPool.put("black", new BlackGoChessman());
	};
	
	private static GoChessmanFactory goChessmanFactory=new GoChessmanFactory();
	
	private Hashtable<String, GoChessman> goChessmanPool=null;
	
	public GoChessman getGoChessman(String color) {
		return goChessmanPool.get(color);
	}
	
	public static GoChessmanFactory getInstance() {
		return goChessmanFactory;
	}
}
