/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Originator.java
 * @Package com.life.design.pattern.memento
 * @Description: 原发者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:07:22
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.memento;

/**
 * @Title: Originator
 * @Description: 原发者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:07:22
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Originator {
	
	private String state;
	
	//将内部状态保存到备忘录中
	public Memento saveMemento() {
		return new Memento(state);
	}
	
	//从备忘录中恢复内部状态
	public Originator undo(Memento memento) {
		state=memento.getState();
		return this;
	}

	public String getState() {
		return state;
	}

	public Originator setState(String state) {
		this.state = state;
		return this;
	}
	
	public void display() {
		System.out.println(state);
	}
}
