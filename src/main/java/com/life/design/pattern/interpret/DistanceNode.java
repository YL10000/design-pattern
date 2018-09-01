/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DistanceNode.java
 * @Package com.life.design.pattern.interpret
 * @Description: 距离结点---终极结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:00:12
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.interpret;

/**
 * @Title: DistanceNode
 * @Description: 距离结点---终极结点
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午2:00:12
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DistanceNode extends AbstractNode {
	
	private int distance;
	
	public DistanceNode(int distance) {
		super();
		this.distance = distance;
	}

	@Override
	public String interpret(Context context) {
		if (context.getDirection().equalsIgnoreCase("x")) {
			context.setX(context.getX()+context.getDistinct()*distance);
		}else if (context.getDirection().equalsIgnoreCase("y")) {
			context.setY(context.getY()+context.getDistinct()*distance);
		}
		return this.distance+"";
	}
}
