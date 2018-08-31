/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MacroCommand.java
 * @Package com.life.design.pattern.action
 * @Description: 宏命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午11:19:28
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: MacroCommand
 * @Description: 宏命令
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午11:19:28
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MacroCommand extends Command {
	
	private List<Command> commands;
	
	public MacroCommand() {
		super();
		this.commands=new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void removeCommand(Command command) {
		this.commands.remove(command);
	}

	@Override
	public void execute() {
		commands.stream().forEach(Command::execute);
	}
}
