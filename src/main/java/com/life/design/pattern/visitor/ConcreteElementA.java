/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteElementA.java
 * @Package com.life.design.pattern.visitor
 * @Description: 具体元素A
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:54:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: ConcreteElementA
 * @Description: 具体元素A
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:54:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
