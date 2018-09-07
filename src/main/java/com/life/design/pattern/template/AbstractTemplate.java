/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractTemplate.java
 * @Package com.life.design.pattern.template
 * @Description: 抽象模板类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:24:47
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.template;

/**
 * @Title: AbstractTemplate
 * @Description: 抽象模板类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:24:47
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AbstractTemplate {

	//模板方法
	public final void templateMethod() {
		commonMethod();
		//使用钩子方法来让子类控制模板方法的执行
		if (!isSkipMethod()) {
			method2();
		}
		method3();
	}
	
	//具体方法
	public void commonMethod() {
		System.out.println("步骤1");
	}
	
	//钩子方法
	public boolean isSkipMethod() {
		return false;
	}
	
	//抽象方法
	public abstract void method2();
	
	public abstract void method3();
}
