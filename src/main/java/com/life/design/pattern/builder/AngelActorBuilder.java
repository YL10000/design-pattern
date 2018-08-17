/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AngelActorBuilder.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 天使建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:38:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: AngelActorBuilder
 * @Description: 天使建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:38:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AngelActorBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("天使");
	}

	@Override
	public void buildFace() {
		actor.setFace("漂亮");
	}

	@Override
	public void buildSex() {
		actor.setSex("女");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("披肩长发");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("白裙");
	}
}
