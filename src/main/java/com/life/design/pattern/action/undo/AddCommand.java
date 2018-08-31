/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AddCommand.java
 * @Package com.life.design.pattern.action.undo
 * @Description: 加命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:27:05
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

import java.util.Stack;

/**
 * @Title: AddCommand
 * @Description: 加命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:27:05
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AddCommand extends CalculateCommand {
	
	private Adder adder;
	
	//保存加命令值得栈
	private Stack<Integer> valueStack;
	
	public AddCommand(Adder adder) {
		super();
		this.adder = adder;
		this.valueStack=new Stack<>();
	}

	@Override
	public double calculate(int value) {
		valueStack.push(value);
		double result=this.adder.add(value);
		System.out.println("加"+value+"="+CalculateResult.result);
		return result;
	}

	@Override
	public double undo() {
		double result=getResult();
		if (valueStack.size()>0) {
			int value=valueStack.pop();
			result=this.adder.add(-valueStack.pop());
			System.out.println("撤销"+value+"="+CalculateResult.result);
		}
		return result;
	}

}
