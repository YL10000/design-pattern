/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Coordinate.java
 * @Package com.life.design.pattern.flyweight
 * @Description: 坐标类---享元对象的外部特征
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:22:22
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight;

/**
 * @Title: Coordinate
 * @Description: 坐标类---享元对象的外部特征
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:22:22
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Coordinate {

	private int x;
	
	private int y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
