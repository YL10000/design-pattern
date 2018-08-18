/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: LargeWritingBrush.java
 * @Package com.life.design.pattern.bridge
 * @Description: 大号的毛笔---扩展抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:22:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: LargeWritingBrush
 * @Description: 大号的毛笔---扩展抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:22:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class LargeWritingBrush extends WritingBrush {

	@Override
	public void paint() {
		System.out.println("绘制粗的"+getColor().getColor()+getLineStyle().getStyle());
	}
}
