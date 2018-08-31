/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ViceChairman.java
 * @Package com.life.design.pattern.chains
 * @Description: 副董事长--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:29:12
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.chains;

/**
 * @Title: ViceChairman
 * @Description: 副董事长--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:29:12
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ViceChairman extends Approver {

	public ViceChairman(String name) {
		super(name);
	}

	@Override
	public void processRequest(Double money) {
		if (money<10000) {
			System.out.println("金额小于10000，副董事长直接处理");
		}else {
			this.superior.processRequest(money);
		}
	}
}
