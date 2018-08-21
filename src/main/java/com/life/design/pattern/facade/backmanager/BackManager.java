/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: BackManager.java
 * @Package com.life.design.pattern.facade.backmanager
 * @Description: 具体外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:47:03
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade.backmanager;

/**
 * @Title: BackManager
 * @Description: 具体外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:47:03
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class BackManager extends AbstractBackManager {
	
	private AddressListManager addressListManager;
	
	private SmsManager smsManager;
	
	private ImageManager imageManager;
	
	public BackManager() {
		super();
		this.addressListManager=new AddressListManager();
		this.smsManager=new SmsManager();
		this.imageManager=new ImageManager();
	}

	@Override
	public void back() {
		addressListManager.backAddressList();
		smsManager.backSms();
		imageManager.backImage();
	}

}
