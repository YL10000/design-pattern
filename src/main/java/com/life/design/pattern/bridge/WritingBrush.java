/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WritingBrush.java
 * @Package com.life.design.pattern.bridge
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 上午11:41:46
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: WritingBrush
 * @Description: 毛笔类--抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 上午11:41:46
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class WritingBrush {

	private Color color;
	
	private LineStyle lineStyle;
	
	public void setColor(Color color) {
		this.color = color;
	}

	public void setLineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
	}

	public Color getColor() {
		return color;
	}

	public LineStyle getLineStyle() {
		return lineStyle;
	}

	public abstract void paint();
}
