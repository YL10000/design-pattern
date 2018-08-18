/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: SpecificAdapter.java
 * @Package com.life.design.pattern.adapter
 * @Description: 具体适配器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 上午9:42:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.adapter;

/**
 * @Title: SpecificAdapter
 * @Description: 具体适配器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 上午9:42:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class SpecificAdapter extends DefaultAdapter {

	@Override
	public void newMethod01() {
		oldMethod01();
	}
}
