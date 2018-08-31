/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: JdkDynamicProxy.java
 * @Package com.life.design.pattern.proxy
 * @Description: jdk实现的动态代理
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:51:47
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Title: JdkDynamicProxy
 * @Description: jdk实现的动态代理
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:51:47
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class JdkDynamicProxy implements InvocationHandler {
	
	private Subject subject;
	
	public JdkDynamicProxy(Subject subject) {
		super();
		this.subject=subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理方法执行前");
		System.out.println("mehod:"+method);
		method.invoke(subject, args);
		System.out.println("动态代理方法执行后");
		return null;
	}
}
