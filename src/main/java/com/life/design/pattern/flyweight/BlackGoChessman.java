/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BlackGoChessman.java
 * @Package com.life.design.pattern.flyweight
 * @Description: 黑子--具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:29:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight;

/**
 * @Title: BlackGoChessman
 * @Description: 黑子--具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:29:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BlackGoChessman extends GoChessman {
	
	public BlackGoChessman() {
		super();
		this.setColor("黑子");
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println(getColor()+" x="+coordinate.getX()+",y="+coordinate.getY());
	}
}
