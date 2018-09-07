/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: School.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: 学校  -- 对象结构类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:33:30
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: School
 * @Description: 学校  -- 对象结构类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:33:30
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class School {

	private List<Candidate> candidates=new ArrayList<>();
	
	public School add(Candidate candidate) {
		candidates.add(candidate);
		return this;
	}
	
	public School accept(Award award) {
		System.out.println(award.getClass().getSimpleName());
		candidates.forEach(c->c.accept(award));
		System.out.println("-----------");
		return this;
	}
}
