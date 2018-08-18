/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: MysqlDataBase.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: mysql数据库
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:07:04
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: MysqlDataBase
 * @Description: mysql数据库
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:07:04
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class MysqlDataBase extends DataBase {

	@Override
	public String readData() {
		return "mysql 中的数据";
	}

}
