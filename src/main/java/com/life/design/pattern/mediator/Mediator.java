/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Mediator.java
 * @Package com.life.design.pattern.mediator
 * @Description: 抽象中介者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:45:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.mediator;

/**
 * @Title: Mediator
 * @Description: 抽象中介者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:45:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Mediator {
	
	//添加新的同事类
	public abstract Mediator addPanel(Panel panel);
	
	//调用其他同事的方法
	public abstract void notifyPanel(Panel panel);
}
