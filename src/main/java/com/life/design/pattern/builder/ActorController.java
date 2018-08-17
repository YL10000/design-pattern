/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ActorController.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 角色指挥者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:44:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

/**
 * @Title: ActorController
 * @Description: 角色指挥者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:44:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ActorController {

	public Actor construct(ActorBuilder builder) {
		builder.buildType();
		builder.buildSex();
		builder.buildFace();
		builder.buildCostume();
		builder.buildHairStyle();
		return builder.createActor();
	}
}
