/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PlayerLevel.java
 * @Package com.life.design.pattern.state.game
 * @Description: 抽象状态类--玩家等级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午7:26:34
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: PlayerLevel
 * @Description: 抽象状态类--玩家等级
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午7:26:34
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class PlayerLevel {

	public void play() {
		System.out.println("玩牌");
	}
	
	public abstract void doubleScore();
	
	public abstract void changeCards();
	
	public abstract void peekCards();
}
