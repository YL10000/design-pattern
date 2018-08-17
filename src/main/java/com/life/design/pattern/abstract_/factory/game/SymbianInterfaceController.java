/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SymbianInterfaceController.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Symbian系统界面
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:35:35
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: SymbianInterfaceController
 * @Description: Symbian系统界面控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:35:35
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SymbianInterfaceController implements InterfaceController {

	@Override
	public void info() {
		System.out.println("symbian interface");
	}

}
