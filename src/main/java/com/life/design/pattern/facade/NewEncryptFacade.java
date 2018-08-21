/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: NewEncryptFacade.java
 * @Package com.life.design.pattern.facade
 * @Description: 新的加密方式外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:03:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: NewEncryptFacade
 * @Description: 新的加密方式外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:03:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class NewEncryptFacade extends AbstractFacade {

	private FileReader filereader;
	
	private NewEncrypt newEncrypt;
	
	private FileWriter filewriter;
	
	public NewEncryptFacade() {
		super();
		this.filereader=new FileReader();
		this.newEncrypt=new NewEncrypt();
		this.filewriter=new FileWriter();
	}

	@Override
	public void encrypt(String sourcePath, String targetPath) {
		String content=filereader.read(sourcePath);
		content=newEncrypt.encrype(content);
		filewriter.writer(content, targetPath);
	}
}
