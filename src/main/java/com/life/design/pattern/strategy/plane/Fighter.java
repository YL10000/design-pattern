/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Fighter.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: 歼击机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:48:58
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: Fighter
 * @Description: 歼击机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:48:58
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Fighter extends PlaneType {

	public Fighter() {
		System.out.println("歼击机");
	}

	@Override
	public void takeOff() {
		System.out.println("长距离起飞");
	}

	@Override
	public void fly() {
		System.out.println("超音速飞行");
	}

}
