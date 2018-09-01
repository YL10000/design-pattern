/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ProductListWithIterator.java
 * @Package com.life.design.pattern.iterator
 * @Description: 具体聚合类中采用内部类实现具体迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 上午11:12:41
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator;

import java.util.List;

/**
 * @Title: ProductListWithIterator
 * @Description: 具体聚合类中采用内部类实现具体迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 上午11:12:41
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ProductListWithIterator extends AbstractObjectList<String> {

	@Override
	public AbstractIterator<String> iterator() {
		return new Iterator();
	}
	
	/**
	 * 
	 * @Title: Iterator
	 * @Description: 使用内部类来实现具体聚合对象的迭代器，可以更方便的访问聚合对象中的数据
	 */
	public class Iterator implements AbstractIterator<String>{
		
		private int cursor1;
		
		private int cursor2;
		
		private List<String> products;

		public Iterator() {
			this.cursor1=-1;
			//内部类中直接使用外部类中的方法
			products=ProductListWithIterator.this.getList();
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
}
