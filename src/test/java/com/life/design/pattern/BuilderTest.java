/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BuilderTest.java
 * @Package com.life.desgn.pattern
 * @Description: 建筑者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:54:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.builder.Actor;
import com.life.design.pattern.builder.ActorBuilderUtils;
import com.life.design.pattern.builder.ActorController;
import com.life.design.pattern.builder.videopalyer.PlayerMode;
import com.life.design.pattern.builder.videopalyer.PlayerModeBuilderUtils;

/**
 * @Title: BuilderTest
 * @Description: 建筑者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:54:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BuilderTest {

	@Test
	public void actorBuilderTest() throws Exception {
		ActorController controller=new ActorController();
		Actor actor=controller.construct(ActorBuilderUtils.getActorBuilder());
		System.out.println(actor);
		Actor actor2=ActorBuilderUtils.getActorBuilder().construct();
		System.out.println(actor2);
	}
	
	@Test
	public void playerBuilderTest() throws Exception {
		PlayerMode mode=PlayerModeBuilderUtils.getPlayerModeBuilder().construct();
		System.out.println(mode);
	}
}
