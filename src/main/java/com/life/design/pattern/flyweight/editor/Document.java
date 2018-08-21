/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Document.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: 抽象文档类--抽象享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:03:31
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

/**
 * @Title: Document
 * @Description: 抽象文档类--抽象享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:03:31
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Document {

	private String type;//文档类型
	
	private String path;//文档路径
	
	public Document() {
		super();
	}
	
	//插入文档
	public void insertDocument(Style style) {
		System.out.println("插入"+this.getType()+",宽："+style.getWidth()+",高："+style.getHeight()+",坐标为x:"+style.getX()+",y:"+style.getY());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
