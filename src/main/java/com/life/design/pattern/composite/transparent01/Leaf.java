/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Leaf.java
 * @Package com.life.design.pattern.composite.transparent
 * @Description: 叶子类--透明组合模式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:12:40
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.transparent01;

/**
 * @Title: Leaf
 * @Description: 叶子类--透明组合模式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午10:12:40
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
	public void operation() {
		System.out.println(getName()+"具体操作");
	}
}
