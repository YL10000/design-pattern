/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ConcreteCommand.java
 * @Package com.life.design.pattern.action
 * @Description: 具体命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午3:12:26
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action;

/**
 * @Title: ConcreteCommand
 * @Description: 具体命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午3:12:26
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ConcreteCommand extends Command {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}
}
