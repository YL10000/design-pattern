/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AndroidInterfaceController.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Android系统下的界面控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:52:23
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: AndroidInterfaceController
 * @Description: Android系统下的界面控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:52:23
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AndroidInterfaceController implements InterfaceController {

	@Override
	public void info() {
		System.out.println("android interface");
	}

}
