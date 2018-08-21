/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FacadeTest.java
 * @Package com.life.design.pattern
 * @Description: 外观模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:49:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.facade.AbstractFacade;
import com.life.design.pattern.facade.EncryptFacade;
import com.life.design.pattern.facade.Facade;
import com.life.design.pattern.facade.NewEncryptFacade;
import com.life.design.pattern.facade.backmanager.AbstractBackManager;
import com.life.design.pattern.facade.backmanager.BackManager;

/**
 * @Title: FacadeTest
 * @Description: 外观模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:49:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FacadeTest {

	@Test
	public void fileEncrypt() {
		Facade facade=new Facade();
		facade.fileEncrype("1.txt", "1.en.text");
	}
	
	@Test
	public void abstractFacadeTest() {
		AbstractFacade facade=new EncryptFacade();
		facade.encrypt("1.txt", "1.en.text");
	}
	
	@Test
	public void backFacadeTest() {
		AbstractBackManager backManager=new BackManager();
		backManager.back();
	}
}
