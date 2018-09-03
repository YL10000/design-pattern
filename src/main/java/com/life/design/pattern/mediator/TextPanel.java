/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TextPanel.java
 * @Package com.life.design.pattern.mediator
 * @Description: 具体同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:58:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.mediator;

/**
 * @Title: TextPanel
 * @Description: 具体同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 上午11:58:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class TextPanel extends Panel {

	@Override
	public void update() {
		System.out.println("textPanel进行修改");
		getMediator().notifyPanel(this);
	}

	@Override
	public void review() {
		System.out.println("textPanel进行了重新加载");
	}
}
