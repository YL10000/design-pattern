/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BlueColor.java
 * @Package com.life.design.pattern.bridge
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:23:14
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge;

/**
 * @Title: BlueColor
 * @Description: 蓝色--具体实现类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午1:23:14
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BlueColor extends Color {

	@Override
	String getColor() {
		return "蓝色";
	}
}
