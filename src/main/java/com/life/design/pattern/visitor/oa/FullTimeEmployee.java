/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FullTimeEmployee.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:21:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: FullTimeEmployee
 * @Description: 正式员工
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:21:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(String name, Double hourWage, Integer workTime) {
		super(name, hourWage, workTime);
	}

	@Override
	public void accept(Deptment deptment) {
		deptment.visit(this);
	}
}
