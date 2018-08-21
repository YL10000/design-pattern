/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Style.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午5:59:34
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

/**
 * @Title: Style
 * @Description: 属性：大小和位置--外部状态
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午5:59:34
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Style {

	private double height;
	
	private double width;
	
	private double x;
	
	private double y;

	public Style(double height, double width, double x, double y) {
		super();
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
