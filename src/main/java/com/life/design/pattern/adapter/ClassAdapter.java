/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ClassAdapter.java
 * @Package com.life.design.pattern.adapter
 * @Description: 类适配器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:04:16
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.adapter;

/**
 * @Title: ClassAdapter
 * @Description: 类适配器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:04:16
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ClassAdapter extends Adaptee01 implements Target {

	@Override
	public void newMethod01() {
		oldMethod01();
	}

	@Override
	public void newMethod02() {
		//java不能实现多继承，所以类适配器不能同时对多个适配者进行适配
	}
}
