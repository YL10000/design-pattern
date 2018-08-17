/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ActorBuilderUtils.java
 * @Package com.life.desgn.pattern.builder
 * @Description: 角色建筑者工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:50:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.builder;

import java.util.Properties;

/**
 * @Title: ActorBuilderUtils
 * @Description: 角色建筑者工具类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 上午11:50:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ActorBuilderUtils {

	public static ActorBuilder getActorBuilder() throws Exception {
		Properties properties=new Properties();
		properties.load(ActorBuilderUtils.class.getResourceAsStream("/factory.properties"));
		return (ActorBuilder) Class.forName(properties.getProperty("actorType")).newInstance();
	}
}
