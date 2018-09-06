/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: VipDiscount.java
 * @Package com.life.design.pattern.strategy
 * @Description: vip折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:12:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy;

/**
 * @Title: VipDiscount
 * @Description: vip折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:12:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class VipDiscount extends Discount {

	@Override
	public double calculatePrice(double price) {
		System.out.println("vip票");
		System.out.println("增加积分");
		return price*0.8;
	}
}
