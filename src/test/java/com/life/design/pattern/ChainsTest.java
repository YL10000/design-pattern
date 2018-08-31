/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ChainsTest.java
 * @Package com.life.design.pattern
 * @Description: 职责链模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月27日 上午11:02:20
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.chains.Approver;
import com.life.design.pattern.chains.Chairman;
import com.life.design.pattern.chains.Congress;
import com.life.design.pattern.chains.Director;
import com.life.design.pattern.chains.ViceChairman;

/**
 * @Title: ChainsTest
 * @Description: 职责链模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月27日 上午11:02:20
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ChainsTest {

	@Test
	public void approveTest() {
		Approver director=new Director("部门主管");
		Approver viceChairman=new ViceChairman("副董事长");
		Approver chairman=new Chairman("董事长");
		Approver congress=new Congress("董事会");
		director.setSuperior(viceChairman);
		viceChairman.setSuperior(chairman);
		chairman.setSuperior(congress);
		
		director.processRequest(3000d);
		director.processRequest(8000d);
		director.processRequest(13000d);
		director.processRequest(63000d);
	}
}
