/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AccountState.java
 * @Package com.life.design.pattern.state
 * @Description: 抽象账号状态类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:25:29
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state;

/**
 * @Title: AccountState
 * @Description: 抽象账号状态类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:25:29
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AccountState {
	
	protected Account account;
	
	public AccountState(Account account) {
		super();
		this.account = account;
	}
	
	//存款
	public abstract void deposit(Double money);
	
	//提现
	public abstract void withdraw(Double money);
	
	//计算利息
	public abstract void computeInterest();
	
	//检查状态
	public abstract void checkState();
}
