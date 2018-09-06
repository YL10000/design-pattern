/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PrimaryLevel.java
 * @Package com.life.design.pattern.state.game
 * @Description: 入门级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午8:00:07
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: PrimaryLevel
 * @Description: 入门级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午8:00:07
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PrimaryLevel extends PlayerLevel {

	@Override
	public void doubleScore() {
		System.out.println("入门级暂不支持双倍积分功能");
	}

	@Override
	public void changeCards() {
		System.out.println("入门级暂不支持换牌功能");
	}

	@Override
	public void peekCards() {
		System.out.println("入门级暂不支持偷看牌功能");
	}
}
