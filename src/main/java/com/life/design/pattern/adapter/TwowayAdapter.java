/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TwowayAdapter.java
 * @Package com.life.design.pattern.adapter
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:24:39
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.adapter;

/**
 * @Title: TwowayAdapter
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:24:39
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class TwowayAdapter extends Adaptee01 implements Target {
	
	private Adaptee01 adaptee01;
	
	private Target target;
	
	public TwowayAdapter(Adaptee01 adaptee01) {
		super();
		this.adaptee01 = adaptee01;
	}

	public TwowayAdapter(Target target) {
		super();
		this.target = target;
	}

	@Override
	public void newMethod01() {
		adaptee01.oldMethod01();
	}

	@Override
	public void newMethod02() {

	}

	@Override
	public void oldMethod01() {
		target.newMethod01();
	}
}
