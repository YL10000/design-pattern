/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WholePlayerModeBuilder.java
 * @Package com.life.desgn.pattern.builder.videopalyer
 * @Description: 完整模式建造器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:26:10
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder.videopalyer;

/**
 * @Title: WholePlayerModeBuilder
 * @Description: 完整模式建造器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:26:10
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WholePlayerModeBuilder extends PlayerModeBuilder {

	@Override
	public void buildMainWindow() {
		mode.setMianWindow("完整模式 -主窗口");
	}

	@Override
	public void buildControlbar() {
		mode.setControlbar("完整模式-控制条");
	}

	@Override
	public void buildMenu() {
		mode.setMenu("完整模式-菜单");
	}

	@Override
	public void buildCollectList() {
		mode.setCollectList("完整模式-收藏列表");
	}

	@Override
	public void buildPlayList() {
		mode.setPalyList("完整模式-播放列表");
	}
}
