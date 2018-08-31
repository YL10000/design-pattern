/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Minuser.java
 * @Package com.life.design.pattern.action.undo
 * @Description: 减法接收者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午9:00:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.undo;

/**
 * @Title: Minuser
 * @Description: 减法接收者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午9:00:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Minuser {

	public Double minus(int value) {
		CalculateResult.result=CalculateResult.result-value;
		return CalculateResult.result;
	}
}
