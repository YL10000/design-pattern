/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MinusCommand.java
 * @Package com.life.design.pattern.action.undo
 * @Description: 减法命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午8:59:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

import java.util.Stack;

/**
 * @Title: MinusCommand
 * @Description: 减法命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午8:59:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MinusCommand extends CalculateCommand {
	
	private Minuser minuser;
	
	private Stack<Integer> valueStack;
	
	public MinusCommand(Minuser minuser) {
		super();
		this.minuser = minuser;
		this.valueStack=new Stack<>();
	}

	@Override
	public double calculate(int value) {
		valueStack.push(value);
		double result=minuser.minus(value);
		System.out.println("减"+value+"="+CalculateResult.result);
		return result;
	}

	@Override
	public double undo() {
		double result=getResult();
		if (!valueStack.isEmpty()) result=minuser.minus(-valueStack.pop());
		System.out.println("撤销="+CalculateResult.result);
		return result;
	}

}
