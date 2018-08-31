/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CommandQueue.java
 * @Package com.life.design.pattern.action
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午5:50:28
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: CommandQueue
 * @Description: 命令队列
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午5:50:28
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class CommandQueue {

	private List<Command> commands=new ArrayList<>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void removeCommand(Command command) {
		commands.remove(command);
	}
	
	public void execute() {
		commands.stream().forEach(Command::execute);
	}
}
