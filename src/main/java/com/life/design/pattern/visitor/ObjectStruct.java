/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ObjectStruct.java
 * @Package com.life.design.pattern.visitor
 * @Description: 对象结构
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:02:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ObjectStruct
 * @Description: 对象结构
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:02:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ObjectStruct {

	private List<Element> elements=new ArrayList<>();
	
	public ObjectStruct add(Element element) {
		elements.add(element);
		return this;
	}
	
	public void accept(Visitor visitor) {
		elements.forEach(e->e.accept(visitor));
	}
}
