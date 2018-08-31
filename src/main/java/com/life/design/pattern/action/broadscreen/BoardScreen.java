/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BoardScreen.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 公告板系统界面类----命令接收者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:16:39
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * @Title: BoardScreen
 * @Description: 公告板系统界面类----命令接收者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:16:39
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BoardScreen {
	
	public void open() {
		System.out.println("打开了公告面板");
	}
	
	public void create() {
		System.out.println("新建公告面板");
	}
	
	public void edit() {
		System.out.println("修改公告面板");
	}

}
