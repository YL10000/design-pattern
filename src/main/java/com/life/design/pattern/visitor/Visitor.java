/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Visitor.java
 * @Package com.life.design.pattern.visitor
 * @Description: 抽象访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:52:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: Visitor
 * @Description: 抽象访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:52:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Visitor {

	public abstract void visit(ConcreteElementA element);
	
	public abstract void visit(ConcreteElementB element);
}
