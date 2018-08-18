/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: RedColor.java
 * @Package com.life.design.pattern.bridge
 * @Description: 红色---具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:24:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: RedColor
 * @Description: 红色---具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:24:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class RedColor extends Color {

	@Override
	String getColor() {
		return "红色";
	}
}
