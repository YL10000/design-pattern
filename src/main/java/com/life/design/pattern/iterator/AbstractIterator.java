/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractIterator.java
 * @Package com.life.design.pattern.iterator
 * @Description: 抽象迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:07:17
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator;

/**
 * @Title: AbstractIterator
 * @Description: 抽象迭代器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:07:17
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public interface AbstractIterator<E> {

	boolean hasNext();
	
	E next();
	
	boolean hasPrevious();
	
	E previous();
}
