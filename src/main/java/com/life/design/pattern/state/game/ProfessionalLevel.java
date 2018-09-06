/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ProfessionalLevel.java
 * @Package com.life.design.pattern.state.game
 * @Description: 高手级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 上午10:46:26
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: ProfessionalLevel
 * @Description: 高手级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月6日 上午10:46:26
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ProfessionalLevel extends PlayerLevel {

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
		System.out.println("高手级暂不支持偷看牌功能");
	}

}
