/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractFruitFactory.java
 * @Package com.life.desgn.pattern.factory.method
 * @Description: 抽象工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:51:34
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.factory.method;

import com.life.design.pattern.simple.factory.Fruit;

/**
 * @Title: AbstractFruitFactory
 * @Description: 抽象工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午3:51:34
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public interface AbstractFruitFactory {

	Fruit createFruit();
}
