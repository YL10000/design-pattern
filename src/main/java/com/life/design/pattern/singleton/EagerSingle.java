/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: EagerSingle.java
 * @Package com.life.desgn.pattern.singleton
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 上午11:39:14
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.singleton;

/**
 * @Title: EagerSingle
 * @Description: 饿汉式实现单例
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 上午11:39:14
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class EagerSingle {

	private static EagerSingle eagerSingle=new EagerSingle();
	
	private EagerSingle() {};
	
	public static EagerSingle getInstance() {
		return eagerSingle;
	}
}
