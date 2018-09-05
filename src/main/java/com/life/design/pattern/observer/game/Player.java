/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Player.java
 * @Package com.life.design.pattern.observer.game
 * @Description: 游戏玩家--具体观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:00:09
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.observer.game;

/**
 * @Title: Player
 * @Description: 游戏玩家--具体观察者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午11:00:09
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Player extends Observer {

	public Player(String name) {
		super(name);
	}

	@Override
	public void help() {
		System.out.println("坚持住,"+getName()+"前来救你！");
	}

	@Override
	public void beAttacked(AllyControlCenter allyControlCenter) {
		System.out.println(getName()+"正遭受敌人攻击！");
		allyControlCenter.notifyObservers(getName());
	}
}
