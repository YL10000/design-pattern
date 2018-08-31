/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MinCommand.java
 * @Package com.life.design.pattern.action.function
 * @Description: 最小化命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:17:42
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.function;


/**
 * @Title: MinCommand
 * @Description: 最小化命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:17:42
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MinCommand extends Command {

	private MinHandler minHelper;
	
	public MinCommand(String name,MinHandler minHelper) {
		super();
		this.setName(name);
		this.minHelper = minHelper;
	}

	@Override
	public void execute() {
		System.out.println("执行"+getName()+"命令");
		minHelper.min();
	}

}
