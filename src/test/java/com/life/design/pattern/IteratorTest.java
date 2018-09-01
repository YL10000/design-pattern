/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: IteratorTest.java
 * @Package com.life.design.pattern
 * @Description: 迭代器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 上午10:20:11
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import com.life.design.pattern.iterator.AbstractIterator;
import com.life.design.pattern.iterator.AbstractObjectList;
import com.life.design.pattern.iterator.ProductListWithIterator;
import com.life.design.pattern.iterator.student.Student;
import com.life.design.pattern.iterator.student.StudentList;

/**
 * @Title: IteratorTest
 * @Description: 迭代器模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 上午10:20:11
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class IteratorTest {
	
	@Test
	public void iteratorTest() {
		//ProductList productList=new ProductList();
		//使用内部类获取迭代器
		ProductListWithIterator productList=new ProductListWithIterator();
		productList.addObjct("1");
		productList.addObjct("2");
		productList.addObjct("3");
		productList.addObjct("4");
		
		AbstractIterator<String> iterator=productList.iterator();
		System.out.println("正向输出");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("逆向输出");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	
	@Test
	public void listIteratorTest() {
		List<String> list=new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//jdk8中增加了forEachRemaining的支持
		list.iterator().forEachRemaining(System.out::println);;
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<String> listIterator=list.listIterator();
		System.out.println("正向输出");
		while(listIterator.hasNext()) {
			String str=listIterator.next();
			if (str.equals("bb")) {
				//在遍历中动态删除和添加元素
				listIterator.remove();
				listIterator.add("bb1");
			}else {
				System.out.println(str);
			}
		}
		
		//只有在正向输出完后才采用逆向输出
		System.out.println("逆向输出");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
	
	@Test
	public void studentTest() {
		AbstractObjectList<Student> studentList=new StudentList()
				.addObjct(new Student("张三", 24)).addObjct(new Student("李四", 18))
				.addObjct(new Student("王五", 36)).addObjct(new Student("赵六", 28));
		AbstractIterator<Student> iterator=studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("逆序打印");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
