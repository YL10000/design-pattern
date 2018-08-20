/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DecoratorTest.java
 * @Package com.life.design.pattern
 * @Description: 装饰器测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:22:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.decorator.BackgroudDecorator;
import com.life.design.pattern.decorator.BorderDecorator;
import com.life.design.pattern.decorator.Component;
import com.life.design.pattern.decorator.TextBoxComponent;
import com.life.design.pattern.decorator.encrypy.Encryptor;
import com.life.design.pattern.decorator.encrypy.ReverseEncrypy;
import com.life.design.pattern.decorator.encrypy.SeekModelEncryptor;
import com.life.design.pattern.decorator.encrypy.SerialEncrypy;

/**
 * @Title: DecoratorTest
 * @Description: 装饰器测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午6:22:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DecoratorTest {

	@Test
	public void decoratorTest() {
		Component component=new TextBoxComponent();
		BorderDecorator bComponent=new BorderDecorator(component);
		bComponent.setBorderColor("blue");
		Component bgComponent=new BackgroudDecorator(bComponent);
		bgComponent.display();
	}
	
	@Test
	public void encrypyTest() {
		String source="admin";
		Encryptor encryptor=new SerialEncrypy(new Encryptor());
		encryptor=new ReverseEncrypy(encryptor);
		encryptor=new SeekModelEncryptor(encryptor);
		encryptor.encrypy(source);
	}
}
