/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 抽象表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:44:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: AbstractNode
 * @Description: 抽象表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:44:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AbstractNode {
	
	public abstract String interpret(Context context);
}
