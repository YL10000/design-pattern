/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ExcellenceAward.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: 优秀奖--具体访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:30:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

/**
 * @Title: ExcellenceAward
 * @Description: 优秀奖--具体访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:30:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ExcellenceAward extends Award {

	@Override
	public void visit(Student student) {
		StringBuffer buffer=new StringBuffer("学生："+student.getName());
		buffer.append("，平均成绩为："+student.getScores());
		if (student.getScores()>=90) {
			buffer.append(",符合申请优秀奖条件");
		}else {
			buffer.append(",不符合申请优秀奖条件");
		}
		System.out.println(buffer);
	}

	@Override
	public void visit(Teacher teacher) {
		StringBuffer buffer=new StringBuffer("老师："+teacher.getName());
		buffer.append("，教学反馈分数为："+teacher.getScores());
		if (teacher.getScores()>90) {
			buffer.append(",符合申请优秀奖条件");
		}else {
			buffer.append(",不符合申请优秀奖条件");
		}
		System.out.println(buffer);
	}

}
