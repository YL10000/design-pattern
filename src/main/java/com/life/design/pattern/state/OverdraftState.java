/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: OverdraftState.java
 * @Package com.life.design.pattern.state
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:06:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state;

/**
 * @Title: OverdraftState
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:06:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class OverdraftState extends AccountState {

	public OverdraftState(Account account) {
		super(account);
	}

	@Override
	public void deposit(Double money) {
		account.setBalance(account.getBalance()+money);
		checkState();
	}

	@Override
	public void withdraw(Double money) {
		account.setBalance(account.getBalance()-money);
		checkState();
	}

	@Override
	public void computeInterest() {
		System.out.println("计算利息");
	}

	@Override
	public void checkState() {
		if (account.getBalance()>0) {
			account.setState(new NormalState(this.account));
		}else if (account.getBalance()>=-2000) {
			account.setState(new OverdraftState(this.account));
		}else if (account.getBalance()<-2000) {
			account.setState(new RestrictedState(this.account));
		}
	}
}
