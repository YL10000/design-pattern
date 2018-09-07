/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteTemplate.java
 * @Package com.life.design.pattern.template
 * @Description: 具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:31:58
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.template;

/**
 * @Title: ConcreteTemplate
 * @Description: 具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:31:58
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteTemplate extends AbstractTemplate {

	@Override
	public boolean isSkipMethod() {
		return true;
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public void method3() {
		System.out.println("method3");
	}
}
