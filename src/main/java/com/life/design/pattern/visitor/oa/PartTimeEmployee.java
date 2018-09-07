/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PartTimeEmployee.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:23:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: PartTimeEmployee
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:23:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name, Double hourWage, Integer workTime) {
		super(name, hourWage, workTime);
	}

	@Override
	public void accept(Deptment deptment) {
		deptment.visit(this);
	}

}
