/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FinalLevel.java
 * @Package com.life.design.pattern.state.game
 * @Description: 骨灰级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 上午10:48:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: FinalLevel
 * @Description: 骨灰级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 上午10:48:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FinalLevel extends PlayerLevel {

	@Override
	public void doubleScore() {
		System.out.println("双倍积分");
	}

	@Override
	public void changeCards() {
		System.out.println("换牌");
	}

	@Override
	public void peekCards() {
		System.out.println("偷看被人的牌");
	}

}
