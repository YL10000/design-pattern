/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Plane.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:38:51
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: Plane
 * @Description: 环境类--飞机
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:38:51
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Plane {
	
	private PlaneType planeType;

	public void setPlaneType(PlaneType planeType) {
		this.planeType = planeType;
	}
	
	public void takeOff() {
		this.planeType.takeOff();
	} 
	
	public void fly() {
		this.planeType.fly();
	}
}
