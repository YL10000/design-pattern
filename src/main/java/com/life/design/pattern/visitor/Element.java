/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Element.java
 * @Package com.life.design.pattern.visitor
 * @Description: 抽象元素
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:53:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

/**
 * @Title: Element
 * @Description: 抽象元素
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午4:53:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Element {
	
	public abstract void accept(Visitor visitor);
}
