/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DirectionNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 方向结点--终结表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:52:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: DirectionNode
 * @Description: 方向结点--终结表达式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午1:52:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DirectionNode extends AbstractNode {
	
	private String direction;

	public DirectionNode(String direction) {
		super();
		this.direction = direction;
	}

	@Override
	public String interpret(Context context) {
		if (direction.equalsIgnoreCase("UP")) {
			context.setDirection("y");
			context.setDistinct(1);
			return "向上";
		}else if (direction.equalsIgnoreCase("DOWN")) {
			context.setDirection("y");
			context.setDistinct(-1);
			return "向下";
		}else if (direction.equalsIgnoreCase("LEFT")) {
			context.setDirection("x");
			context.setDistinct(-1);
			return "向左";
		}else if (direction.equalsIgnoreCase("RIGHT")) {
			context.setDirection("x");
			context.setDistinct(1);
			return "向右";
		}else {
			return "无效指令";
		}
	}
}
