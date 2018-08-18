/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TransformType.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: 转换器--抽象接口类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:41:31
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: TransformType
 * @Description: 转换类型--抽象接口类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:41:31
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Converter {

	private DataBase dataBase;

	public DataBase getDataBase() {
		return dataBase;
	}

	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}
	
	public abstract void convert();
}
