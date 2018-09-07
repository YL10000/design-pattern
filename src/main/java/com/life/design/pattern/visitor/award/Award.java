/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Award.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:20:23
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

/**
 * @Title: Award
 * @Description: 抽象奖励类--抽象访问者
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:20:23
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Award {
	
	public abstract void visit(Student student);
	
	public abstract void visit(Teacher teacher);
}
