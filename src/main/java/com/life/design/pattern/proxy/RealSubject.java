/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: RealSubject.java
 * @Package com.life.design.pattern.proxy
 * @Description: 真实主题
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:08:45
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.proxy;

/**
 * @Title: RealSubject
 * @Description: 真实主题
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:08:45
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class RealSubject implements Subject {

	@Override
	public void operation() {
		System.out.println("真实主题的operation方法");
	}
}
