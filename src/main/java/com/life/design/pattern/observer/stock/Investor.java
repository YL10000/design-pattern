/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Investor.java
 * @Package com.life.design.pattern.observer.stock
 * @Description: 股民
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:53:50
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.stock;

import java.util.Observable;
import java.util.Observer;

/**
 * @Title: Investor
 * @Description: 股民
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:53:50
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Investor implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Double change=(Double) arg;
		if (change>0) {
			System.out.println("终于涨了");
		}else {
			System.out.println("怎么又跌了");
		}
	}
}
