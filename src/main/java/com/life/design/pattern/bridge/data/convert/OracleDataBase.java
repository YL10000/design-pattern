/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: OracleDataBase.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: oracle数据库
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:08:06
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: OracleDataBase
 * @Description: oracle数据库
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午3:08:06
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class OracleDataBase extends DataBase {

	@Override
	public String readData() {
		return "oracle中的数据";
	}

}
