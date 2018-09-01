/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractObjectList.java
 * @Package com.life.design.pattern.iterator
 * @Description: 抽象聚合类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:01:42
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: AbstractObjectList
 * @Description: 抽象聚合类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 下午4:01:42
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AbstractObjectList<E> {
	
	private List<E> list=new ArrayList<>();
	
	public AbstractObjectList<E> addObjct(E object) {
		list.add(object);
		return this;
	}
	
	public AbstractObjectList<E> removeObject(E object){
		list.remove(object);
		return this;
	}
	
	public List<E> getList(){
		return list;
	}
	
	//创建迭代器
	public abstract AbstractIterator<E> iterator();
}
