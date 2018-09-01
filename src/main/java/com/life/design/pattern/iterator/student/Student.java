/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Student.java
 * @Package com.life.design.pattern.iterator.student
 * @Description: 学生实体
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 下午1:49:12
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.iterator.student;

import java.util.Comparator;

/**
 * @Title: Student
 * @Description: 学生实体
 * @Author: ViaX-yanglin
 * @Date: 2018年9月1日 下午1:49:12
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Student implements Comparator<Student> {
	
	private String name;
	
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}
}
