/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: EditCommand.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:23:36
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * @Title: EditCommand
 * @Description: 修改命令----具体命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:23:36
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class EditCommand extends Command {
	
	private BoardScreen boardScreen;
	
	public EditCommand(BoardScreen boardScreen) {
		super();
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		boardScreen.edit();
	}

}
