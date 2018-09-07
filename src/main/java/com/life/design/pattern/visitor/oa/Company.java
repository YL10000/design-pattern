/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Company.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: 数据结构
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:49:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Company
 * @Description: 数据结构
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:49:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Company {

	private List<Employee> employees=new ArrayList<>();
	
	public Company addEmployee(Employee employee) {
		employees.add(employee);
		return this;
	}
	
	public Company accept(Deptment deptment) {
		System.out.println(deptment.getClass().getSimpleName());
		employees.forEach(e->e.accept(deptment));
		System.out.println("------------");
		return this;
	}
}
