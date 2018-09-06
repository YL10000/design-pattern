/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ChildrenDiscount.java
 * @Package com.life.design.pattern.strategy
 * @Description: 儿童折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:11:19
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy;

/**
 * @Title: ChildrenDiscount
 * @Description: 儿童折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:11:19
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ChildrenDiscount extends Discount {

	@Override
	public double calculatePrice(double price) {
		System.out.println("儿童票");
		return price-10;
	}
}
