/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WhiteGoChessman.java
 * @Package com.life.design.pattern.flyweight
 * @Description: 围棋白子--具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:25:24
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight;

/**
 * @Title: WhiteGoChessman
 * @Description: 围棋白子--具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:25:24
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WhiteGoChessman extends GoChessman {

	public WhiteGoChessman() {
		super();
		this.setColor("白色");
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println(getColor()+" x="+coordinate.getX()+",y="+coordinate.getY());
	}
}
