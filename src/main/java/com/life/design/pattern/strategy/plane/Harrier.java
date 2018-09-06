/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Harrier.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: 鹞式战斗机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:50:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: Harrier
 * @Description: 鹞式战斗机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:50:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Harrier extends PlaneType {

	public Harrier() {
		System.out.println("鹞式战斗机");
	}

	@Override
	public void takeOff() {
		System.out.println("垂直起飞");
	}

	@Override
	public void fly() {
		System.out.println("超音速飞行");
	}

}
