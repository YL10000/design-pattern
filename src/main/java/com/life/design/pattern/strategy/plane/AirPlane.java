/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AirPlane.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: 客机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:47:48
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: AirPlane
 * @Description: 客机---具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:47:48
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AirPlane extends PlaneType {

	public AirPlane() {
		System.out.println("客机");
	}

	@Override
	public void takeOff() {
		System.out.println("长距离起飞");
	}

	@Override
	public void fly() {
		System.out.println("亚音速飞行");
	}

}
