/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MemoryPlayerModeBuilder.java
 * @Package com.life.desgn.pattern.builder.videopalyer
 * @Description: 记忆模式建造器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:36:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder.videopalyer;

/**
 * @Title: MemoryPlayerModeBuilder
 * @Description: 记忆模式建造器类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:36:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MemoryPlayerModeBuilder extends PlayerModeBuilder {

	@Override
	public void buildMainWindow() {
		mode.setMianWindow("记忆模式-主窗口");
	}

	@Override
	public void buildControlbar() {
		mode.setControlbar("记忆模式-控制条");
	}

	@Override
	public void buildMenu() {
		mode.setMenu("记忆模式-菜单");
	}

	@Override
	public void buildCollectList() {
		mode.setCollectList("记忆模式-收藏列表");
	}

	@Override
	public void buildPlayList() {
		mode.setPalyList("记忆模式-播放列表");
	}

	@Override
	public boolean showMenu() {
		return false;
	}

	@Override
	public boolean showPlayList() {
		return false;
	}

	@Override
	public boolean showCollectList() {
		return true;
	}
}
