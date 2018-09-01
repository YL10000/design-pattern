/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SentenceNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 简单句子解释 非终结符表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:49:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: SentenceNode
 * @Description: 简单句子解释 非终结符表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:49:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SentenceNode extends AbstractNode {
	
	private AbstractNode direction;
	
	private AbstractNode action;
	
	private AbstractNode distance;
	
	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
		super();
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}

	@Override
	public String interpret(Context context) {
		return direction.interpret(context)+action.interpret(context)+distance.interpret(context)+context.toString();
	}
}
