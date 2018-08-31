/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ProxyTest.java
 * @Package com.life.design.pattern
 * @Description: 代理对象测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:12:29
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.lang.reflect.InvocationHandler;

import org.junit.Test;

import com.life.design.pattern.proxy.JdkDynamicProxy;
import com.life.design.pattern.proxy.Proxy;
import com.life.design.pattern.proxy.RealSubject;
import com.life.design.pattern.proxy.Subject;

/**
 * @Title: ProxyTest
 * @Description: 代理对象测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午10:12:29
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ProxyTest {

	@Test
	public void proxyTest() {
		Proxy proxy=new Proxy();
		proxy.operation();
	}
	
	@Test
	public void jdkDynamicProxyTest() {
		Subject subject=new RealSubject();
		InvocationHandler handler=new JdkDynamicProxy(subject);
		
		//动态创建代理类实例
		Subject proxy=(Subject) java.lang.reflect.Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),subject.getClass().getInterfaces(), handler);
		proxy.operation();
	}
}
