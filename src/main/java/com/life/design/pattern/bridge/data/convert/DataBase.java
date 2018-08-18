/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DataBase.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:38:39
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: DataBase
 * @Description: 抽象数据库接口
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:38:39
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class DataBase {

	public abstract String readData();
}
