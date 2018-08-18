/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SmallWritingBrush.java
 * @Package com.life.design.pattern.bridge
 * @Description: 小号的毛笔---扩展抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午12:03:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: SmallWritingBrush
 * @Description: 小号的毛笔---扩展抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午12:03:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SmallWritingBrush extends WritingBrush {

	@Override
	public void paint() {
		System.out.println("绘制细的"+getColor().getColor()+getLineStyle().getStyle());
	}
}
