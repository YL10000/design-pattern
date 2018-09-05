/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ObserverTest.java
 * @Package com.life.design.pattern
 * @Description: 观察者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:45:51
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.observer.ConcreteObserver;
import com.life.design.pattern.observer.ConcreteSubject;
import com.life.design.pattern.observer.Subject;
import com.life.design.pattern.observer.game.AllyControlCenter;
import com.life.design.pattern.observer.game.ConcreteAllyControlCenter;
import com.life.design.pattern.observer.game.Player;
import com.life.design.pattern.observer.stock.Investor;
import com.life.design.pattern.observer.stock.Stock;

/**
 * @Title: ObserverTest
 * @Description: 观察者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 上午10:45:51
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ObserverTest {

	
	@Test
	public void observerTest() {
		Subject subject=new ConcreteSubject()
				.addObserver(new ConcreteObserver())
				.addObserver(new ConcreteObserver());
		System.out.println("subject 发生了变化");
		subject.notifyObservers();
	}
	
	@Test
	public void gameTest() throws InterruptedException {
		//控制中心
		AllyControlCenter allyControlCenter=new ConcreteAllyControlCenter();
		
		//具体观察者
		com.life.design.pattern.observer.game.Observer player1=new Player("张三");
		com.life.design.pattern.observer.game.Observer player2=new Player("李四");
		com.life.design.pattern.observer.game.Observer player3=new Player("王五");
		
		allyControlCenter.join(player1).join(player2).join(player3);
		
		player1.beAttacked(allyControlCenter);
		Thread.sleep(1000);
		allyControlCenter.quit(player1);
		player2.beAttacked(allyControlCenter);
	}
	
	@Test
	public void stockTest() {
		Stock stock=new Stock("中国移动");
		Investor investor1=new Investor();
		Investor investor2=new Investor();
		Investor investor3=new Investor();
		stock.addObserver(investor1);
		stock.addObserver(investor2);
		stock.addObserver(investor3);
		stock.setPrice(20.0);
		stock.setPrice(10.0);
	}
}
