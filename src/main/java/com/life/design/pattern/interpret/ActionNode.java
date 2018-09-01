/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ActionNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 动作结点----终极结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:57:50
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: ActionNode
 * @Description: 动作结点----终极结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:57:50
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ActionNode extends AbstractNode {
	
	private String action;
	
	public ActionNode(String action) {
		super();
		this.action = action;
	}

	@Override
	public String interpret(Context context) {
		if (action.equalsIgnoreCase("move")) {
			return "移动";
		}else if (action.equalsIgnoreCase("run")) {
			return "快速移动";
		}else {
			return "无效指令";
		}
	}
}
