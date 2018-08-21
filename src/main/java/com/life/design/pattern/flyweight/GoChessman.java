/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: GoChessman.java
 * @Package com.life.design.pattern.flyweight
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:18:52
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight;


/**
 * @Title: GoChessman
 * @Description: 围棋棋子类--抽象享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:18:52
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class GoChessman {

	//内部状态作为享元类的成员变量
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	//外部状态作为参数注入给享元类
	public abstract void display(Coordinate coordinate);
}
