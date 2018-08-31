/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FunctionBt.java
 * @Package com.life.design.pattern.action.function
 * @Description: 快捷按钮
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:28:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.function;

/**
 * @Title: FunctionBt
 * @Description: 快捷按钮
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:28:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FunctionBt {

	private String name;
	
	private Command command;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public FunctionBt(String name, Command command) {
		super();
		this.name = name;
		this.command = command;
	}
	
	public void click() {
		System.out.println(this.getName()+"点击了");
		command.execute();
	}
}
