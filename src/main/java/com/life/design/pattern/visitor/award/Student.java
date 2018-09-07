/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Student.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: 学生类--具体元素类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:21:08
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

/**
 * @Title: Student
 * @Description: 学生类--具体元素类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:21:08
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Student extends Candidate {

	public Student(String name, int paperCount, int scores) {
		super(name, paperCount, scores);
	}

	@Override
	public void accept(Award award) {
		award.visit(this);
	}
}
