/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Memento.java
 * @Package com.life.design.pattern.memento
 * @Description: 备忘录类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:05:35
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.memento;

/**
 * @Title: Memento
 * @Description: 备忘录类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月3日 下午3:05:35
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
class Memento {
	
	//对应原发类的内部状态
	private String state;
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
