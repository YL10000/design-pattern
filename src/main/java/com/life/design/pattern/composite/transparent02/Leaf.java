/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Leaf.java
 * @Package com.life.design.pattern.composite.transparent02
 * @Description: 透明组合模式-叶子类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:01:18
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.composite.transparent02;

/**
 * @Title: Leaf
 * @Description: 透明组合模式-叶子类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 上午11:01:18
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Leaf extends Component {

	@Override
	public void operation() {
		System.out.println(getName()+"具体操作");
	}

	public Leaf() {
		super();
	}

	public Leaf(String name) {
		super(name);
	}
}
