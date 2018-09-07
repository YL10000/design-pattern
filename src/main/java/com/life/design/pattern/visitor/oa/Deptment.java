/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Deptment.java
 * @Package com.life.design.pattern.visitor.oa
 * @Description: 抽象部门类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:18:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.oa;

/**
 * @Title: Deptment
 * @Description: 抽象部门类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午5:18:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Deptment {
	
	public abstract void visit(FullTimeEmployee employee);
	
	public abstract void visit(PartTimeEmployee employee);

}
