/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Account.java
 * @Package com.life.design.pattern.state
 * @Description: 账号类---环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:27:01
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state;

/**
 * @Title: Account
 * @Description: 账号类---环境类
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:27:01
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Account {
	
	private AccountState state;

	private String owner;
	
	private double balance;

	public Account(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.state=new NormalState(this);
		System.out.println(owner+"账户初始化金额"+balance);
		System.out.println("------------------");
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	//存款
	public Account deposit(Double money) {
		System.out.println(owner+"存款"+money);
		state.deposit(money);
		System.out.println("现在余额为："+this.balance);
		System.out.println("现在的账户状态为："+this.state.getClass().getSimpleName());
		System.out.println("------------------");
		return this;
	}
	
	//提现
	public Account withdraw(Double money) {
		System.out.println(owner+"取款"+money);
		state.withdraw(money);
		System.out.println("现在余额为："+this.balance);
		System.out.println("现在的账户状态为："+this.state.getClass().getSimpleName());
		System.out.println("------------------");
		return this;
	}
	
	//计算利息
	public void computeInterest() {
		state.computeInterest();
	}
}
