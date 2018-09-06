/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SecondaryLevel.java
 * @Package com.life.design.pattern.state.game
 * @Description: 熟练级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午8:04:33
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: SecondaryLevel
 * @Description: 熟练级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午8:04:33
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SecondaryLevel extends PlayerLevel {

	@Override
	public void doubleScore() {
		System.out.println("双倍积分");
	}

	@Override
	public void changeCards() {
		System.out.println("熟练级暂不支持换牌功能");
	}

	@Override
	public void peekCards() {
		System.out.println("熟练级暂不支持偷看牌功能");
	}

}
