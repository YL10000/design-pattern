/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ScientificAward.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: 科研奖---具体访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:25:34
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

/**
 * @Title: ScientificAward
 * @Description: 科研奖---具体访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:25:34
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ScientificAward extends Award {

	@Override
	public void visit(Student student) {
		StringBuffer buffer=new StringBuffer("学生："+student.getName());
		buffer.append("，发表的论文数为："+student.getPaperCount());
		if (student.getPaperCount()>2) {
			buffer.append(",符合申请科研奖条件");
		}else {
			buffer.append(",不符合申请科研奖条件");
		}
		System.out.println(buffer);
	}

	@Override
	public void visit(Teacher teacher) {
		StringBuffer buffer=new StringBuffer("老师："+teacher.getName());
		buffer.append("，发表的论文数为："+teacher.getPaperCount());
		if (teacher.getPaperCount()>10) {
			buffer.append(",符合申请科研奖条件");
		}else {
			buffer.append(",不符合申请科研奖条件");
		}
		System.out.println(buffer);
	}

}
