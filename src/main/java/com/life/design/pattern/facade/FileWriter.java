/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FileWriter.java
 * @Package com.life.design.pattern.facade
 * @Description: 保存文件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:41:47
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: FileWriter
 * @Description: 保存文件
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:41:47
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FileWriter {

	public void writer(String content,String targetPath) {
		System.out.println("将"+content+"保存到"+targetPath);
	}
}
