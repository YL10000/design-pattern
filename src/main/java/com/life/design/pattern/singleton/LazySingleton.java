/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: LazySingleton.java
 * @Package com.life.desgn.pattern.singleton
 * @Description: 懒汉式单例
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午1:44:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.singleton;

/**
 * @Title: LazySingleton
 * @Description: 懒汉式单例
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 下午1:44:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class LazySingleton {

	private static volatile LazySingleton lazySingleton=null;
	
	private LazySingleton() {};
	
	/**
	 * 
	 * @Title: getInstance
	 * @Description: 使用双重检查锁定来实现懒汉式
	 * @Param: @return
	 * @Return: LazySingleton
	 * @Throws
	 */
	public static LazySingleton getInstance() {
		if (lazySingleton==null) {
			synchronized (LazySingleton.class) {
				if (lazySingleton==null) {
					lazySingleton=new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
