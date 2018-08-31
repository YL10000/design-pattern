/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Approver.java
 * @Package com.life.design.pattern.chains
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月25日 上午11:17:08
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.chains;

/**
 * @Title: Approver
 * @Description: 审批者----抽象处理者
 * @Author: ViaX-yanglin
 * @Date: 2018年8月25日 上午11:17:08
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Approver {

	//审批者名称
	private String name;
	
	//审批者的上级
	protected Approver superior;
	
	public Approver(String name) {
		super();
		this.name = name;
	}

	public Approver(String name, Approver superior) {
		super();
		this.name = name;
		this.superior = superior;
	}

	public abstract void processRequest(Double money) ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Approver getSuperior() {
		return superior;
	}

	public void setSuperior(Approver superior) {
		this.superior = superior;
	}
}
