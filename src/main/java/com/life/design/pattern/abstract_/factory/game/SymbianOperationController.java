/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SymbianOperationController.java
 * @Package com.life.desgn.pattern.abstract_.factory.game
 * @Description: Symbain系统下的操作控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:30:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.abstract_.factory.game;

/**
 * @Title: SymbianOperationController
 * @Description: Symbain系统下的操作控制
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 上午10:30:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SymbianOperationController implements OperationController {

	@Override
	public void info() {
		System.out.println("symbain operation");
	}

}
