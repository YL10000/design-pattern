/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PlaneType.java
 * @Package com.life.design.pattern.strategy.plane
 * @Description: 飞机类型--抽象策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:40:12
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy.plane;

/**
 * @Title: PlaneType
 * @Description: 飞机类型--抽象策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:40:12
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class PlaneType {
	
	public abstract void takeOff() ;
	
	public abstract void fly();
}
