/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TxtConverter.java
 * @Package com.life.design.pattern.bridge.data.convert
 * @Description: Txt转换器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:58:46
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.bridge.data.convert;

/**
 * @Title: TxtConverter
 * @Description: Txt转换器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午2:58:46
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class TxtConverter extends Converter {

	@Override
	public void convert() {
		String text=getDataBase().readData();
		System.out.println("将"+text+"转换为txt");
	}

}
