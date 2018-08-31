/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Congress.java
 * @Package com.life.design.pattern.chains
 * @Description: 董事会--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月27日 上午10:28:26
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.chains;

/**
 * @Title: Congress
 * @Description: 董事会--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月27日 上午10:28:26
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	public void processRequest(Double money) {
		System.out.println("金额过大，开董事会决定");
	}
}
