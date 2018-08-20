/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Leaf.java
 * @Package com.life.design.pattern.composite
 * @Description: 叶子构件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:29:53
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite;

/**
 * @Title: Leaf
 * @Description: 叶子构件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月18日 下午4:29:53
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Leaf extends Component {
	
	public Leaf() {
		super();
	}

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void addComponent(Component component) {
		System.out.println(getName()+"是叶子节点，不支持addComponent操作");
	}

	@Override
	public void removeComponent(Component component) {
		System.out.println(getName()+"是叶子节点，不支持removeComponent操作");
	}

	@Override
	public Component getComponent(int index) {
		System.out.println(getName()+"是叶子节点，不支持getComponent操作");
		return null;
	}

	@Override
	public void operation() {
		System.out.println(getName()+"具体操作");
	}

}
