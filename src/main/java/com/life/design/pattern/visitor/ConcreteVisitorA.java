/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteVisitorA.java
 * @Package com.life.design.pattern.visitor
 * @Description: 具体访问者A
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:58:32
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: ConcreteVisitorA
 * @Description: 具体访问者A
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:58:32
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteVisitorA extends Visitor {

	@Override
	public void visit(ConcreteElementA element) {
		System.out.println("访问者A访问元素A");
	}

	@Override
	public void visit(ConcreteElementB element) {
		System.out.println("访问者A访问元素B");
	}
}
