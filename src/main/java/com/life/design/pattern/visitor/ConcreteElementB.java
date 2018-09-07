/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteElementB.java
 * @Package com.life.design.pattern.visitor
 * @Description: 具体元素B
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:55:57
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: ConcreteElementB
 * @Description: 具体元素B
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:55:57
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
