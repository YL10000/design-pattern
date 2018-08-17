/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AdapterTest.java
 * @Package com.life.design.pattern
 * @Description: 适配器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:01:52
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.adapter.Adaptee01;
import com.life.design.pattern.adapter.ClassAdapter;
import com.life.design.pattern.adapter.ObjectAdapter;
import com.life.design.pattern.adapter.Target;
import com.life.design.pattern.adapter.TwowayAdapter;

/**
 * @Title: AdapterTest
 * @Description: 适配器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月17日 下午6:01:52
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AdapterTest {

	@Test
	public void objectAdapterTest() {
		Target target=new ObjectAdapter();
		target.newMethod01();
		target.newMethod02();
	}
	
	@Test
	public void classAdapterTest() {
		Target target=new ClassAdapter();
		target.newMethod01();
		target.newMethod02();
	}
	
	@Test
	public void twowayAdapterTest() {
		Target target=new TwowayAdapter(new Adaptee01());
		target.newMethod01();
		Adaptee01 adaptee01=new TwowayAdapter(new Target() {
			
			@Override
			public void newMethod02() {
				System.out.println("target newmethod02");
			}
			
			@Override
			public void newMethod01() {
				System.out.println("target newmethod01");
			}
		});
		adaptee01.oldMethod01();
	}
}
