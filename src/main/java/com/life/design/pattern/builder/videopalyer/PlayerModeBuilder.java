/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PlayerModeBuilder.java
 * @Package com.life.desgn.pattern.builder.videopalyer
 * @Description: 播放模式建造器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:14:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder.videopalyer;

/**
 * @Title: PlayerModeBuilder
 * @Description: 播放模式建造器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:14:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class PlayerModeBuilder {
	
	PlayerMode mode=new PlayerMode();

	public abstract void buildMainWindow();
	
	public abstract void buildControlbar();
	
	public abstract void buildMenu();
	
	public abstract void buildCollectList();
	
	public abstract void buildPlayList();
	
	//是否显示菜单
	public boolean showMenu() {
		return true;
	}
	
	//是否显示播放列表
	public boolean showPlayList() {
		return true;
	}
	
	//是否显示收藏列表
	public boolean showCollectList() {
		return false;
	}
	
	public PlayerMode construct() {
		this.buildMainWindow();
		if (showPlayList()) {
			this.buildPlayList();
		}
		if (showMenu()) {
			this.buildMenu();
		}
		this.buildControlbar();
		if (showCollectList()) {
			this.buildCollectList();
		}
		return mode;
	}
}
