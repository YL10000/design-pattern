/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ProductIterator.java
 * @Package com.life.design.pattern.iterator
 * @Description: 产品迭代器---具体迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:15:27
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator;

import java.util.List;

/**
 * @Title: ProductIterator
 * @Description: 产品迭代器---具体迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:15:27
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ProductIterator implements AbstractIterator<String> {
	
	private List<String> products;
	
	private int cursor1;
	
	private int cursor2;

	public ProductIterator(ProductList productList) {
		this.cursor1=-1;
		products=productList.getList();
		this.cursor2=products.size();
	}

	@Override
	public boolean hasNext() {
		return cursor1!=products.size()-1;
	}

	@Override
	public String next() {
		if (cursor1==products.size()-1) throw new RuntimeException("没有更多的元素");
		return products.get(++cursor1);
	}

	@Override
	public boolean hasPrevious() {
		return cursor2!=0;
	}

	@Override
	public String previous() {
		if (cursor2==0) throw new RuntimeException("没有更多的元素");
		return products.get(--cursor2);
	}
}
