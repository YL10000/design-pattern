/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: StateTest.java
 * @Package com.life.design.pattern
 * @Description: 状态模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:14:37
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.state.Account;
import com.life.design.pattern.state.game.Player;

/**
 * @Title: StateTest
 * @Description: 状态模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:14:37
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class StateTest {
	
	@Test
	public void accountTest() {
		Account account=new Account("张三", 1000);
		account.deposit(1000.0).withdraw(3000.0).withdraw(2000.0).withdraw(1000.0).deposit(5000.0).computeInterest();
	}
	
	@Test
	public void gameTest() {
		Player player=new Player("张三", 50);
		player.play();
		player.doubleScore();
		player.changeCards();
		player.peekCards();
		
		player.setScore(200);
		player.play();
		player.doubleScore();
		player.changeCards();
		player.peekCards();
		
		player.setScore(800);
		player.play();
		player.doubleScore();
		player.changeCards();
		player.peekCards();
		
		player.setScore(1500);
		player.play();
		player.doubleScore();
		player.changeCards();
		player.peekCards();
	}
}
