/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FileReader.java
 * @Package com.life.design.pattern.facade
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:36:15
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: FileReader
 * @Description: 读取文件-子系统角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:36:15
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FileReader {

	public String read(String sourcePath) {
		System.out.println("读取文件"+sourcePath);
		return sourcePath+"文件中的内容";
	}
}
