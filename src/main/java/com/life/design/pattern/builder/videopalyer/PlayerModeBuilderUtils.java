/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PlayerModeBuilderUtils.java
 * @Package com.life.desgn.pattern.builder.videopalyer
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:41:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder.videopalyer;

import java.util.Properties;

/**
 * @Title: PlayerModeBuilderUtils
 * @Description: 播放模式构造器工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午3:41:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PlayerModeBuilderUtils {

	public static PlayerModeBuilder getPlayerModeBuilder() throws Exception {
		Properties properties=new Properties();
		properties.load(PlayerModeBuilderUtils.class.getResourceAsStream("/factory.properties"));
		return (PlayerModeBuilder) Class.forName(properties.getProperty("playMode")).newInstance();
	}
}
