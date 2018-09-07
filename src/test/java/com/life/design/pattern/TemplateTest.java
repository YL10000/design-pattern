/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: TemplateTest.java
 * @Package com.life.design.pattern
 * @Description: 模板方法模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:34:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.template.AbstractTemplate;
import com.life.design.pattern.template.ConcreteTemplate;

/**
 * @Title: TemplateTest
 * @Description: 模板方法模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午2:34:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class TemplateTest {

	@Test
	public void templateTest() {
		AbstractTemplate template=new ConcreteTemplate();
		template.templateMethod();
	}
}
