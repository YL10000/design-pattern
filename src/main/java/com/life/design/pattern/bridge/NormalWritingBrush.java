/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: NormalWritingBrush.java
 * @Package com.life.design.pattern.bridge
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:20:27
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: NormalWritingBrush
 * @Description: 中号的毛笔---扩展抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:20:27
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class NormalWritingBrush extends WritingBrush {

	@Override
	public void paint() {
		System.out.println("绘制正常的"+getColor().getColor()+getLineStyle().getStyle());
	}
}
