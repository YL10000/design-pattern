/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteVisitorB.java
 * @Package com.life.design.pattern.visitor
 * @Description: 具体访问者B
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:58:32
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: ConcreteVisitorB
 * @Description: 具体访问者B
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:58:32
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteVisitorB extends Visitor {

	@Override
	public void visit(ConcreteElementA element) {
		System.out.println("访问者B访问元素A");
	}

	@Override
	public void visit(ConcreteElementB element) {
		System.out.println("访问者B访问元素B");
	}
}
