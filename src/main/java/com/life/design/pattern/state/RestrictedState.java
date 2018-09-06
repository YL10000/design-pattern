/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: RestrictedState.java
 * @Package com.life.design.pattern.state
 * @Description: 受限状态
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:01:25
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.state;

/**
 * @Title: RestrictedState
 * @Description: 受限状态
 * @Author: ViaX-yanglin
 * @Date: 2018年9月5日 下午5:01:25
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class RestrictedState extends AccountState {

	public RestrictedState(Account account) {
		super(account);
	}

	@Override
	public void deposit(Double money) {
		account.setBalance(account.getBalance()+money);
		checkState();
	}

	@Override
	public void withdraw(Double money) {
		System.out.println("账号受限，取款失败");
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
		}
	}
}
