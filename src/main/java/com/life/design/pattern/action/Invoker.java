/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Invoker.java
 * @Package com.life.design.pattern.action
 * @Description: 调用者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午3:06:32
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action;

/**
 * @Title: Invoker
 * @Description: 调用者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午3:06:32
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call() {
		System.out.println("请求者发出命令");
		command.execute();
	}
}
