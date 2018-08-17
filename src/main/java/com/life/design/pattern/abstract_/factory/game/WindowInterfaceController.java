/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WindowInterfaceController.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Windows系统下的界面控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:40:17
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: WindowInterfaceController
 * @Description: Windows系统下的界面控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:40:17
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WindowInterfaceController implements InterfaceController {

	@Override
	public void info() {
		System.out.println("windows interface");
	}

}
