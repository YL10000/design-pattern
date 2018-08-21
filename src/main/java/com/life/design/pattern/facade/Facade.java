/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Facade.java
 * @Package com.life.design.pattern.facade
 * @Description: 外观类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:44:27
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: Facade
 * @Description: 外观类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:44:27
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Facade {

	private FileReader fileReader;
	
	private Encrypt encrypt;
	
	private FileWriter fileWriter;
	
	public Facade() {
		super();
		this.fileReader=new FileReader();
		this.encrypt=new Encrypt();
		this.fileWriter=new FileWriter();
	}

	public void fileEncrype(String sourcePath,String targetPath) {
		String content=fileReader.read(sourcePath);
		content=encrypt.encrypy(content);
		fileWriter.writer(content, targetPath);
	}
}
