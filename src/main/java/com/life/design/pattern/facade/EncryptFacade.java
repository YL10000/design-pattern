/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: EncryptFacade.java
 * @Package com.life.design.pattern.facade
 * @Description: 加密外观类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:57:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: EncryptFacade
 * @Description: 加密外观类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:57:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class EncryptFacade extends AbstractFacade{

	private FileReader fileReader;
	
	private Encrypt encrypt;
	
	private FileWriter fileWriter;
	
	public EncryptFacade() {
		super();
		this.fileReader=new FileReader();
		this.encrypt=new Encrypt();
		this.fileWriter=new FileWriter();
	}

	@Override
	public void encrypt(String sourcePath,String targetPath) {
		String content=fileReader.read(sourcePath);
		content=encrypt.encrypy(content);
		fileWriter.writer(content, targetPath);
	}
}
