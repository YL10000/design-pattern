/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AndNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 非终结结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:47:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: AndNode
 * @Description: 非终结结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:47:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AndNode extends AbstractNode {
	
	private AbstractNode leftNode;
	
	private AbstractNode rightNode;
	
	public AndNode(AbstractNode leftNode, AbstractNode rightNode) {
		super();
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	@Override
	public String interpret(Context context) {
		return leftNode.interpret(context)+",再"+rightNode.interpret(context) ;
	}
}
