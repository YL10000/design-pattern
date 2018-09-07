/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Employee.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: 抽象员工类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:18:23
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: Employee
 * @Description: 抽象员工类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:18:23
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Employee {
	
private String name;
	
	private Integer workTime;
	
	private Double hourWage;
	
	public Employee(String name,Double hourWage, Integer workTime) {
		super();
		this.name = name;
		this.workTime = workTime;
		this.hourWage=hourWage;
	}

	public String getName() {
		return name;
	}

	public Double getHourWage() {
		return hourWage;
	}

	public Integer getWorkTime() {
		return workTime;
	}

	public abstract void accept(Deptment deptment);
}
