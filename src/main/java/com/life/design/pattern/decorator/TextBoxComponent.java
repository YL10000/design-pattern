/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TextBoxComponent.java
 * @Package com.life.design.pattern.decorator
 * @Description: 文本框-具体构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:47:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator;

/**
 * @Title: TextBoxComponent
 * @Description: 文本框-具体构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:47:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class TextBoxComponent extends Component {

	@Override
	public void display() {
		System.out.println("textbox");
	}
}
