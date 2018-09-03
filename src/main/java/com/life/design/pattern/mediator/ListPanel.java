/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ListPanel.java
 * @Package com.life.design.pattern.mediator
 * @Description: 具体同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午12:00:06
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.mediator;

/**
 * @Title: ListPanel
 * @Description: 具体同事类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午12:00:06
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ListPanel extends Panel {

	@Override
	public void update() {
		System.out.println("listPanel进行了修改");
		getMediator().notifyPanel(this);
	}

	@Override
	public void review() {
		System.out.println("listPanel进行了重新加载");
	}
}
