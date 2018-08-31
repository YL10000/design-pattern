/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Proxy.java
 * @Package com.life.design.pattern.proxy
 * @Description: 代理对象
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:09:53
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.proxy;

/**
 * @Title: Proxy
 * @Description: 代理对象
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:09:53
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Proxy implements Subject {
	
	//维护一个队真实对象的引用
	private RealSubject realSubject=new RealSubject();

	@Override
	public void operation() {
		System.out.println("调用前的预处理");
		realSubject.operation();
		System.out.println("调用后的处理");
	}
}
