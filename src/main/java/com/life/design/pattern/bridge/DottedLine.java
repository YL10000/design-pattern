/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DottedLine.java
 * @Package com.life.design.pattern.bridge
 * @Description: 虚线--具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:26:04
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: DottedLine
 * @Description: 虚线--具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:26:04
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DottedLine extends LineStyle {

	@Override
	String getStyle() {
		return "虚线";
	}
}
