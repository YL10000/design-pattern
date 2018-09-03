/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MementoTest.java
 * @Package com.life.design.pattern
 * @Description: 备忘录模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:59:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.memento.CareTaker;
import com.life.design.pattern.memento.Originator;

/**
 * @Title: MementoTest
 * @Description: 备忘录模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:59:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MementoTest {

	@Test
	public void mementoTest() {
		Originator originator=new Originator();
		CareTaker careTaker=new CareTaker();
		careTaker.saveMemento(originator.setState("1").saveMemento());
		originator.display();
		careTaker.saveMemento(originator.setState("3").saveMemento());
		originator.display();
		careTaker.saveMemento(originator.setState("5").saveMemento());
		originator.display();
		originator.setState("8");
		originator.display();
		originator.undo(careTaker.getMemento()).display();;
		originator.undo(careTaker.getMemento()).display();;
	}
}
