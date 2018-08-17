/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Actor.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 复杂对象
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:25:40
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: Actor
 * @Description: 复杂对象
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:25:40
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Actor {

	private String type;//角色类型
	
	private String sex;//性别
	
	private String face;//脸型
	
	private String costume;//服饰
	
	private String hairStyle;//发型

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getCostume() {
		return costume;
	}

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public String getHairStyle() {
		return hairStyle;
	}

	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}

	@Override
	public String toString() {
		return "Actor [type=" + type + ", sex=" + sex + ", face=" + face + ", costume=" + costume + ", hairStyle="
				+ hairStyle + "]";
	}
}
