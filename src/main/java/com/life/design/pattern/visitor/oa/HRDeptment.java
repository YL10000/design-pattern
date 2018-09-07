/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: HRDeptment.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:26:32
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: HRDeptment
 * @Description: 人力资源部
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:26:32
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class HRDeptment extends Deptment {

	@Override
	public void visit(FullTimeEmployee employee) {
		int workTime=employee.getWorkTime();
		StringBuffer buffer=new StringBuffer("正式员工："+employee.getName()+",工作时长："+workTime);
		if (workTime>40) {
			buffer.append(",其中加班："+(workTime-40));
		}else if (workTime<40) {
			buffer.append(",请假："+(40-workTime));
		}
		System.out.println(buffer);
	}

	@Override
	public void visit(PartTimeEmployee employee) {
		System.out.println("临时员工："+employee.getName()+",工作时长："+employee.getWorkTime());
	}
}
