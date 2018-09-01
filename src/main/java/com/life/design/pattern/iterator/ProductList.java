/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PorductList.java
 * @Package com.life.design.pattern.iterator
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:14:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator;

/**
 * @Title: PorductList
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:14:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ProductList extends AbstractObjectList<String> {

	@Override
	public AbstractIterator<String> iterator() {
		return new ProductIterator(this);
	}
}
