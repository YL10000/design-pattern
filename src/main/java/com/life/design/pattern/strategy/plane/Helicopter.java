/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Helicopter.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: 直升机--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:46:26
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: Helicopter
 * @Description: 直升机--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:46:26
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Helicopter extends PlaneType {

	public Helicopter() {
		System.out.println("直升机");
	}

	@Override
	public void takeOff() {
		System.out.println("垂直起飞");
	}

	@Override
	public void fly() {
		System.out.println("亚音速飞行");
	}

}
