/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: HelpCommand.java
 * @Package com.life.design.pattern.action.function
 * @Description: 帮助文档命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:25:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.function;

/**
 * @Title: HelpCommand
 * @Description: 帮助文档命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:25:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class HelpCommand extends Command {
	
	private HelpHandler handler;

	public HelpCommand(String name,HelpHandler handler) {
		super();
		this.setName(name);
		this.handler = handler;
	}

	@Override
	public void execute() {
		System.out.println("执行"+getName()+"命令");
		handler.display();
	}
}
