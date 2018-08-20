/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Composite.java
 * @Package com.life.design.pattern.composite
 * @Description: 容器构件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:33:17
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Composite
 * @Description: 容器构件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:33:17
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Composite extends Component {
	
	public Composite() {
		super();
	}

	public Composite(String name) {
		super(name);
	}

	private List<Component> components=new ArrayList<>();
	
	@Override
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		components.remove(component);
	}

	@Override
	public Component getComponent(int index) {
		return components.get(index);
	}

	@Override
	public void operation() {
		System.out.println("查找容器"+getName()+"下的所有叶子：");
		for(Component component:components) {
			component.operation();
		}
	}
}
