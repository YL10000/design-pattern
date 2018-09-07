/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: VisitorTest.java
 * @Package com.life.design.pattern
 * @Description: 访问者模式
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:04:20
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.visitor.ConcreteElementA;
import com.life.design.pattern.visitor.ConcreteElementB;
import com.life.design.pattern.visitor.ConcreteVisitorB;
import com.life.design.pattern.visitor.ObjectStruct;
import com.life.design.pattern.visitor.award.ExcellenceAward;
import com.life.design.pattern.visitor.award.School;
import com.life.design.pattern.visitor.award.ScientificAward;
import com.life.design.pattern.visitor.award.Student;
import com.life.design.pattern.visitor.award.Teacher;
import com.life.design.pattern.visitor.oa.Company;
import com.life.design.pattern.visitor.oa.FADeptment;
import com.life.design.pattern.visitor.oa.FullTimeEmployee;
import com.life.design.pattern.visitor.oa.HRDeptment;
import com.life.design.pattern.visitor.oa.PartTimeEmployee;

/**
 * @Title: VisitorTest
 * @Description: 访问者模式
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:04:20
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class VisitorTest {

	@Test
	public void visitorTest() {
		new ObjectStruct()
			.add(new ConcreteElementA())
			.add(new ConcreteElementB())
			.accept(new ConcreteVisitorB());;
	}
	
	@Test
	public void aoTest() {
		new Company()
			.addEmployee(new FullTimeEmployee("张三", 100d, 50))
			.addEmployee(new FullTimeEmployee("李四", 120d, 35))
			.addEmployee(new PartTimeEmployee("王五", 80d, 20))
			.addEmployee(new PartTimeEmployee("赵六", 50d, 30))
			.accept(new HRDeptment())
			.accept(new FADeptment());
	}
	
	@Test
	public void awardTest() {
		new School()
			.add(new Student("张三", 3, 80))
			.add(new Student("李四", 1, 95))
			.add(new Teacher("王五", 8, 80))
			.add(new Teacher("赵六", 12, 98))
			.accept(new ScientificAward())
			.accept(new ExcellenceAward());
	}
}
