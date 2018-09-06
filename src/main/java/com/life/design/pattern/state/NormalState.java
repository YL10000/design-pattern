/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: NormalState.java
 * @Package com.life.design.pattern.state
 * @Description: 正常状态
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:32:18
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state;

/**
 * @Title: NormalState
 * @Description: 正常状态
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午4:32:18
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class NormalState extends AccountState {
	
	public NormalState(Account account) {
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
		System.out.println("正常状态，无需支付利息");
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
