/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MenuItem.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 菜单项-命令请求者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:11:35
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * @Title: MenuItem
 * @Description: 菜单项-命令请求者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:11:35
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MenuItem {

	private Command command;
	
	private String name;

	public MenuItem(String name) {
		super();
		this.name=name;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public MenuItem(String name,Command command) {
		super();
		this.name=name;
		this.command = command;
	}
	
	public void click() {
		System.out.println("点击了菜单项："+this.name);
		this.command.execute();
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + "]";
	}
}
