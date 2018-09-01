/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: InterpretTest.java
 * @Package com.life.design.pattern
 * @Description: 解释器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:14:22
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.interpret.AbstractNode;
import com.life.design.pattern.interpret.Context;
import com.life.design.pattern.interpret.InstructionHandler;

/**
 * @Title: InterpretTest
 * @Description: 解释器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:14:22
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class InterpretTest {

	@Test
	public void interpretTest() {
		Context context=new Context(0,0);
		String instruction="up run 4 and left move 3 and down move 4 and right run  2";
		AbstractNode abstractNode=new InstructionHandler().interpretInstruction(instruction);
		instruction=abstractNode.interpret(context);
		System.out.println(instruction);
	}
}
