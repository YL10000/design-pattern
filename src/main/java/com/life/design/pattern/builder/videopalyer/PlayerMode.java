/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PlayerMode.java
 * @Package com.life.desgn.pattern.builder.videopalyer
 * @Description: 抽象播放模式类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午2:26:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder.videopalyer;

/**
 * @Title: PlayerMode
 * @Description: 抽象播放模式类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午2:26:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PlayerMode {
	
	private String mianWindow;//主窗口
	
	private String controlbar;//控制条
	
	private String menu;//菜单
	
	private String collectList;//收藏列表
	
	private String palyList;//播放列表

	public String getMianWindow() {
		return mianWindow;
	}

	public void setMianWindow(String mianWindow) {
		this.mianWindow = mianWindow;
	}

	public String getControlbar() {
		return controlbar;
	}

	public void setControlbar(String controlbar) {
		this.controlbar = controlbar;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getCollectList() {
		return collectList;
	}

	public void setCollectList(String collectList) {
		this.collectList = collectList;
	}

	public String getPalyList() {
		return palyList;
	}

	public void setPalyList(String palyList) {
		this.palyList = palyList;
	}

	@Override
	public String toString() {
		return "PlayerMode [mianWindow=" + mianWindow + ", controlbar=" + controlbar + ", menu=" + menu
				+ ", collectList=" + collectList + ", palyList=" + palyList + "]";
	}
}
