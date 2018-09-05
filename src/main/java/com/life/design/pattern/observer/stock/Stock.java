/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Stock.java
 * @Package com.life.design.pattern.observer.stock
 * @Description: 抽象股票类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:45:31
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.stock;

import java.util.Observable;

/**
 * @Title: Stock
 * @Description: 股票类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:45:31
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Stock extends Observable {
	
	//那种股票
	private String name;
	
	private Double price;
	
	public void setPrice(Double price) {
		if (this.price!=null) {
			//如果波动大于5%
			if (Math.abs(this.price-price)/this.price*100>5) {
				//设置变化标示
				this.setChanged();
				System.out.println(name+"股票"+(price-this.price>0?"上涨":"下跌")+"了");
				//通知其他观察者
				notifyObservers(price-this.price);
			}
		}
		this.price = price;
	}

	public Stock(String name) {
		super();
		this.name = name;
	}
}
