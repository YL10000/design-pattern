/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PrototypeTest.java
 * @Package com.life.desgn.pattern
 * @Description: 原型模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午2:58:24
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.life.design.pattern.prototype.Attachment;
import com.life.design.pattern.prototype.Email;
import com.life.design.pattern.prototype.PrototypeManager;
import com.life.design.pattern.prototype.WeeklyLog;
import com.life.design.pattern.prototype.consumer.clone.Address;
import com.life.design.pattern.prototype.consumer.clone.Consumer;

/**
 * @Title: PrototypeTest
 * @Description: 原型模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午2:58:24
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PrototypeTest {

	@Test
	public void weeklyLogTest() throws ClassNotFoundException, IOException {
		WeeklyLog log=new WeeklyLog("张三", new Date(), "这周工作很忙，每天加班！");
		Attachment attachment=new Attachment("张三的附件");
		log.setAttachment(attachment);
		WeeklyLog log2=log.clone();
		WeeklyLog log3=log.deepClone();
		log2.setName("李四");
		log2.getAttachment().setName("李四的附件");
		log3.setName("王五");
		log3.getAttachment().setName("王五的附件");
		System.out.println(log);
		System.out.println(log2);
		System.out.println(log3);
		System.out.println("log==log2:"+(log==log2));//false
		System.out.println("log==log3:"+(log==log3));//false
		System.out.println("log.getContent()==log2.getContent()："+(log.getContent()==log2.getContent()));//true
		System.out.println("log.getContent()==log3.getContent()："+(log.getContent()==log3.getContent()));//false
		System.out.println("log.getDate()==log2.getDate():"+ (log.getDate()==log2.getDate()));//true
		System.out.println("log.getDate()==log3.getDate():"+(log.getDate()==log3.getDate()));//false
		System.out.println("log.getAttachment()==log2.getAttachment():"+(log.getAttachment()==log2.getAttachment()));//true
		System.out.println("log.getAttachment()==log3.getAttachment():"+(log.getAttachment()==log3.getAttachment()));//false
	}
	
	@Test
	public void prototypeManagerTest() {
		PrototypeManager<Email> manager=PrototypeManager.getPrototypeManager();
		manager.getEmail("private").display();
		manager.getEmail("public").display();
	}
	
	@Test
	public void consumerCloneTest() throws CloneNotSupportedException {
		Consumer consumer=new Consumer("张三", new Address("北京"));
		//浅拷贝只会拷贝基本数据类型，引用类型不会进行拷贝
		Consumer consumer2=consumer.clone();
		consumer2.setName("李四");
		consumer2.getAddress().setCity("上海");
		System.out.println(consumer);
		System.out.println(consumer2);
	}
	
	@Test
	public void consumerDeepCopyTest() throws Exception {
		com.life.design.pattern.prototype.consumer.deepcopy.Consumer consumer=new com.life.design.pattern.prototype.consumer.deepcopy.Consumer("tom", new com.life.design.pattern.prototype.consumer.deepcopy.Address("beijing"));
		com.life.design.pattern.prototype.consumer.deepcopy.Consumer consumer2=consumer.deepCopy();
		consumer2.setName("jack");
		consumer2.getAddress().setCity("shanghai");
		System.out.println(consumer);
		System.out.println(consumer2);
	}
}
