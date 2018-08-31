/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Command.java
 * @Package com.life.design.pattern.action.function
 * @Description: 抽象命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:16:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.function;

/**
 * @Title: Command
 * @Description: 抽象命令类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:16:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Command {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void execute();
}
