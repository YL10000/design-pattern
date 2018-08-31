/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Chairman.java
 * @Package com.life.design.pattern.chains
 * @Description: 董事长类--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:26:19
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.chains;

/**
 * @Title: Chairman
 * @Description: 董事长类--具体处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月26日 上午10:26:19
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Chairman extends Approver {

	public Chairman(String name) {
		super(name);
	}

	@Override
	public void processRequest(Double money) {
		if (money<50000) {
			System.out.println("金额小于50000,董事长直接处理");
		}else {
			this.superior.processRequest(money);
		}
	}
}
