/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Adder.java
 * @Package com.life.design.pattern.action.undo
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:37:29
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

/**
 * @Title: Adder
 * @Description: 加命令接收者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午7:37:29
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Adder {
	
	public double add(int value) {
		CalculateResult.result=CalculateResult.result+value;
		return CalculateResult.result;
	}
}
