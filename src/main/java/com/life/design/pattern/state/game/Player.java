/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Player.java
 * @Package com.life.design.pattern.state.game
 * @Description: 环境类-游戏玩家
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午7:25:18
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state.game;

/**
 * @Title: Player
 * @Description: 环境类-游戏玩家
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午7:25:18
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Player {
	
	private String name;
	
	private int score;
	
	private PlayerLevel level;
	
	public Player(String name, int score) {
		super();
		this.name = name;
		setScore(score);
		System.out.println(name+"会员注册成功，当前积分："+score);
		System.out.println("-----------");
	}

	public void play() {
		System.out.println(name+"当前积分为："+score);
		System.out.println(name+"当前等级为："+level.getClass().getSimpleName());
		level.play();
		System.out.println("-----------");
	}
	
	public void doubleScore() {
		System.out.println(name+"当前积分为："+score);
		System.out.println(name+"当前等级为："+level.getClass().getSimpleName());
		level.doubleScore();
		System.out.println("-----------");
	}
	
	public void changeCards() {
		System.out.println(name+"当前积分为："+score);
		System.out.println(name+"当前等级为："+level.getClass().getSimpleName());
		level.changeCards();
		System.out.println("-----------");
	}
	
	public void peekCards(){
		System.out.println(name+"当前积分为："+score);
		System.out.println(name+"当前等级为："+level.getClass().getSimpleName());
		level.peekCards();
		System.out.println("-----------");
	}

	public void setScore(int score) {
		this.score = score;
		if (this.score<100) {
			this.level=new PrimaryLevel();
		}else if (this.score<500) {
			this.level=new SecondaryLevel();
		}else if (this.score<1000) {
			this.level=new ProfessionalLevel();
		}else {
			this.level=new FinalLevel();
		}
	}
}
