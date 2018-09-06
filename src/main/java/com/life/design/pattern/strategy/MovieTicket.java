/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MovieTicket.java
 * @Package com.life.design.pattern.strategy
 * @Description: 电影票--环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:03:50
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.strategy;

/**
 * @Title: MovieTicket
 * @Description: 电影票--环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 下午4:03:50
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MovieTicket {

	private  double price;
	
	//策略
	private Discount discount;

	public MovieTicket(double price) {
		super();
		this.price = price;
		System.out.println("原价为："+price);
	}

	public double getPrice() {
		if (discount!=null) {
			return discount.calculatePrice(price);
		}else {
			return price;
		}
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}
