/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WindowComponent.java
 * @Package com.life.design.pattern.decorator
 * @Description: 窗口-具体构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:45:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator;

/**
 * @Title: WindowComponent
 * @Description: 窗口-具体构建类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午2:45:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WindowComponent extends Component {

	@Override
	public void display() {
		System.out.println("窗口");
	}
}
