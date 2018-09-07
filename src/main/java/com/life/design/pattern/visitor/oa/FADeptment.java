/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FADeptment.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: 财务部
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:27:27
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: FADeptment
 * @Description: 财务部
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:27:27
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FADeptment extends Deptment {

	@Override
	public void visit(FullTimeEmployee employee) {
		Integer workTime=employee.getWorkTime();
		Double hourWage=employee.getHourWage();
		Double realWage=workTime*hourWage;
		StringBuffer buffer=new StringBuffer("正式员工："+employee.getName()).append(",基本工资："+realWage);
		if (workTime>40) {
			buffer.append(",加班费："+(100*(workTime-40)));
			realWage+=(100*(workTime-40));
		}else if (workTime<40) {
			buffer.append(",请假扣除："+(80*(40-workTime)));
			realWage-=(80*(40-workTime));
		}
		buffer.append(",实发："+(realWage>=0?realWage:0));
		System.out.println(buffer);
	}

	@Override
	public void visit(PartTimeEmployee employee) {
		System.out.println("临时员工："+employee.getName()+",实发工资："+(employee.getHourWage()*employee.getWorkTime()));
	}

}
