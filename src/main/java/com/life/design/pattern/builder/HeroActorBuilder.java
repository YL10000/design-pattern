/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: HeroActorBuilder.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 英雄角色建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:33:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: HeroActorBuilder
 * @Description: 英雄角色建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:33:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class HeroActorBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("英雄");
	}

	@Override
	public void buildFace() {
		actor.setFace("英俊");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("飘逸");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("盔甲");
	}
}
