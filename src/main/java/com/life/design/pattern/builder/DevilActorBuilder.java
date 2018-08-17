/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DevilActorBuilder.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 恶魔建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:40:54
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: DevilActorBuilder
 * @Description: 恶魔建筑者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:40:54
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DevilActorBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("恶魔");
	}

	@Override
	public void buildFace() {
		actor.setFace("丑陋");
	}

	@Override
	public void buildSex() {
		actor.setSex("妖");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairStyle("光头");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("黑衣");
	}
}
