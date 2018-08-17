/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: OranageFruit.java
 * @Package com.life.desgn.pattern.factory.method
 * @Description: 橘子工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:55:53
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method;

import com.life.design.pattern.simple.factory.Fruit;
import com.life.design.pattern.simple.factory.Oranage;

/**
 * @Title: OranageFruit
 * @Description: 橘子工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:55:53
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class OranageFactory implements AbstractFruitFactory {

	public Fruit createFruit() {
		return new Oranage();
	}
}
