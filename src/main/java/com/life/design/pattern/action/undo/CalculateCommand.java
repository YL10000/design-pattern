/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CalculateCommand.java
 * @Package com.life.design.pattern.action.undo
 * @Description: 抽象计算命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:24:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

/**
 * @Title: CalculateCommand
 * @Description: 抽象计算命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:24:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class CalculateCommand {

	public abstract double calculate(int value);
	
	public abstract double undo();
	
	public double getResult() {
		return CalculateResult.result;
	}
}
