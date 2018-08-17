/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ActorBuilder.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 抽象角色建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:29:02
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: ActorBuilder
 * @Description: 抽象角色建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:29:02
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class ActorBuilder {
	
	protected Actor actor=new Actor();
	
	public abstract void buildType();
	
	public abstract void buildFace();
	
	public abstract void buildSex();
	
	public abstract void buildHairStyle();
	
	public abstract void buildCostume();
	
	public Actor createActor() {
		return actor;
	}
	
	public static Actor construct(ActorBuilder builder) {
		builder.buildType();
		builder.buildSex();
		builder.buildFace();
		builder.buildCostume();
		builder.buildHairStyle();
		return builder.createActor();
	}
	
	public Actor construct() {
		this.buildType();
		this.buildSex();
		this.buildFace();
		this.buildCostume();
		this.buildHairStyle();
		return actor;
	}
}
