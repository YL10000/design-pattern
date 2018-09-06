/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: StudentDiscount.java
 * @Package com.life.design.pattern.strategy
 * @Description: 学生折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:09:34
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy;

/**
 * @Title: StudentDiscount
 * @Description: 学生折扣--具体策略类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:09:34
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class StudentDiscount extends Discount {

	@Override
	public double calculatePrice(double price) {
		System.out.println("学生票");
		return price*0.5;
	}
}
