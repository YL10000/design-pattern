/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MediatorTest.java
 * @Package com.life.design.pattern
 * @Description: 中介者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午1:35:55
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.mediator.GraphicPanel;
import com.life.design.pattern.mediator.ListPanel;
import com.life.design.pattern.mediator.Mediator;
import com.life.design.pattern.mediator.Panel;
import com.life.design.pattern.mediator.TextPanel;
import com.life.design.pattern.mediator.Window;

/**
 * @Title: MediatorTest
 * @Description: 中介者模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午1:35:55
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MediatorTest {
	
	@Test
	public void panelTest() {
		Mediator mediator=new Window();
		Panel textPanel=new TextPanel();
		Panel listPanel=new ListPanel();
		Panel graphicPanel=new GraphicPanel();
		textPanel.setMediator(mediator);
		listPanel.setMediator(mediator);
		graphicPanel.setMediator(mediator);
		
		//会覆盖textPanel.setMediator(mediator);
		mediator.addPanel(textPanel);
		
		textPanel.update();
		
		listPanel.update();
	}
}
