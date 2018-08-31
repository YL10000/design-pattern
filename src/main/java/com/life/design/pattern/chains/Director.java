/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Director.java
 * @Package com.life.design.pattern.chains
 * @Description: 主任类--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:22:48
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.chains;

/**
 * @Title: Director
 * @Description: 主任类--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:22:48
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	@Override
	public void processRequest(Double money) {
		if(money<5000) {
			System.out.println("金额小于5000,主任直接审批");
		}else {
			this.superior.processRequest(money);
		}
	}
}
