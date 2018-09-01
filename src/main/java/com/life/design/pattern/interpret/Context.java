/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Context.java
 * @Package com.life.design.pattern.interpret
 * @Description: 环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:29:24
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: Context
 * @Description: 环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:29:24
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Context {
	
	private String direction;//沿哪个轴移动
	
	private int distinct;//沿正方向还是负方向

	private int x;
	
	private int y;
	
	public Context(int x, int y) {
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

	@Override
	public String toString() {
		return "("+x+","+y+")";
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getDistinct() {
		return distinct;
	}

	public void setDistinct(int distinct) {
		this.distinct = distinct;
	}
}
