/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SolidLine.java
 * @Package com.life.design.pattern.bridge
 * @Description: 实线--具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:27:17
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: SolidLine
 * @Description: 实线--具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:27:17
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SolidLine extends LineStyle {

	@Override
	String getStyle() {
		return "实线";
	}
}
