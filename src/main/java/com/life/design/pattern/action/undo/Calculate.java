/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Calculate.java
 * @Package com.life.design.pattern.action.undo
 * @Description: 计算器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:54:29
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

import java.util.Stack;

/**
 * @Title: Calculate
 * @Description: 计算器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:54:29
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Calculate {
	
	//命令栈
	private Stack<CalculateCommand> undoCommanStack=new Stack<>();

	private AddCommand addCommand;
	
	private MinusCommand minusCommand;
	
	public Calculate(AddCommand addCommand,MinusCommand minusCommand) {
		super();
		this.addCommand = addCommand;
		this.minusCommand=minusCommand;
	}

	public Calculate add(int value) {
		//将命令添加到命令栈中
		undoCommanStack.push(addCommand);
		addCommand.calculate(value);
		return this;
	}
	
	public Calculate mins(int value) {
		undoCommanStack.push(minusCommand);
		minusCommand.calculate(value);
		return this;
	}
	
	public Calculate undo() {
		//将栈顶的命令弹出，进行撤销操作
		if(undoCommanStack.size()>0) undoCommanStack.pop().undo();
		return this;
	}
	
	public double result() {
		return CalculateResult.result;
	}
}
