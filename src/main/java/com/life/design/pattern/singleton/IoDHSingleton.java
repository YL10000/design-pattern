/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: IoDHSingleton.java
 * @Package com.life.desgn.pattern.singleton
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午2:01:43
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.singleton;

/**
 * @Title: IoDHSingleton
 * @Description: Initialization on Demand Holder(IoDH),
 * 			在内部添加静态内部类，在该内部类中创建单例对象，再将该单例对象通过单例对象的getInstance方法给外部访问
 * 			由于静态单例对象没有作为类的成员变量直接实例化，因此了类加载时不会实例化，第一次调用时将加载内部类，此时才会初始化内部类的成员变量
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午2:01:43
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class IoDHSingleton {

	private IoDHSingleton() {};
	
	private static class HolderClass{
		private final static IoDHSingleton IO_DH_SINGLETON=new IoDHSingleton();
	}
	
	public static IoDHSingleton getInstance() {
		return HolderClass.IO_DH_SINGLETON;
	}
}
