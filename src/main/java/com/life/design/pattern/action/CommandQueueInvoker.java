/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: CommandQueueInvoker.java
 * @Package com.life.design.pattern.action
 * @Description: 面向请求队列编程的请求者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午5:53:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action;

/**
 * @Title: CommandQueueInvoker
 * @Description: 面向请求队列编程的请求者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月30日 下午5:53:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class CommandQueueInvoker {

	private CommandQueue commandQueue;

	public CommandQueueInvoker(CommandQueue commandQueue) {
		super();
		this.commandQueue = commandQueue;
	}
	
	public void seedCommand(Command command) {
		this.commandQueue.addCommand(command);
	}
	
	public void call() {
		this.commandQueue.execute();
	}
}
