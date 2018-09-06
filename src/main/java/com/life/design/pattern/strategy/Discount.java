/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Discount.java
 * @Package com.life.design.pattern.strategy
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:04:53
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy;

/**
 * @Title: Discount
 * @Description: 折扣类---抽象策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:04:53
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Discount {

	public abstract double calculatePrice(double price);
}
