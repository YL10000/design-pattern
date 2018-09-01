/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: InstructionHandler.java
 * @Package com.life.design.pattern.interpret
 * @Description: 指令处理类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:02:05
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @Title: InstructionHandler
 * @Description: 指令处理类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:02:05
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class InstructionHandler {

	public AbstractNode interpretInstruction(String instruction) {
		Stack<AbstractNode> stack=new Stack<>();
		StringTokenizer tokenizer=new StringTokenizer(instruction, " ");
		while(tokenizer.hasMoreTokens()) {
			String token=tokenizer.nextToken();
			if (token.equalsIgnoreCase("and")) {
				SentenceNode rightNode=new SentenceNode(new DirectionNode(tokenizer.nextToken()), new ActionNode(tokenizer.nextToken()), new DistanceNode(Integer.parseInt(tokenizer.nextToken())));
				stack.push(new AndNode(stack.pop(), rightNode));
			}else {
				SentenceNode sentenceNode=new SentenceNode(new DirectionNode(token), new ActionNode(tokenizer.nextToken()), new DistanceNode(Integer.parseInt(tokenizer.nextToken())));
				stack.push(sentenceNode);
			}
		}
		return stack.pop();
	}
}
