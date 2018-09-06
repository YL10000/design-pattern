/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: StrategyTest.java
 * @Package com.life.design.pattern
 * @Description: 策略模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:16:43
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.strategy.ChildrenDiscount;
import com.life.design.pattern.strategy.MovieTicket;
import com.life.design.pattern.strategy.plane.Harrier;
import com.life.design.pattern.strategy.plane.Plane;

/**
 * @Title: StrategyTest
 * @Description: 策略模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:16:43
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class StrategyTest {

	@Test
	public void ticketTest() {
		MovieTicket ticket=new MovieTicket(80);
		//设置使用的折扣策略
		ticket.setDiscount(new ChildrenDiscount());
		double price=ticket.getPrice();
		System.out.println("折后票价："+price);
	}
	
	@Test
	public void planeTest() {
		Plane plane=new Plane();
		plane.setPlaneType(new Harrier());
		plane.takeOff();
		plane.fly();
	}
}
