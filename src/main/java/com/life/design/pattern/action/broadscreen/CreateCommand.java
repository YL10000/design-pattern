/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CreateCommand.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 新建命令---具体命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:22:06
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * @Title: CreateCommand
 * @Description: 新建命令---具体命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:22:06
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class CreateCommand extends Command {
	
	private BoardScreen boardScreen;
	
	public CreateCommand(BoardScreen boardScreen) {
		super();
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		boardScreen.create();
	}

}
