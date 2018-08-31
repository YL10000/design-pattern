/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: OpenCommand.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 打开命令--具体命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:20:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * @Title: OpenCommand
 * @Description: 打开命令--具体命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:20:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class OpenCommand extends Command {
	
	private BoardScreen boardScreen;
	
	public OpenCommand(BoardScreen boardScreen) {
		super();
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		boardScreen.open();
	}
}
