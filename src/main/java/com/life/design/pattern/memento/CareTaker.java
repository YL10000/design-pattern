/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CareTaker.java
 * @Package com.life.design.pattern.memento
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:26:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.memento;

import java.util.Stack;

/**
 * @Title: CareTaker
 * @Description: 备忘录管理者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:26:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class CareTaker {
	
	//定义备忘录栈，实现多次恢复
	private Stack<Memento> mementos = new Stack<>();
	
	//保存备忘录
	public void saveMemento(Memento memento) {
		mementos.push(memento);
	}
	
	//获取备忘录
	public Memento getMemento() {
		return mementos.pop();
	}
}
