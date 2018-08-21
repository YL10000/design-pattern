/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Encrypt.java
 * @Package com.life.design.pattern.facade
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:39:04
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: Encrypt
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:39:04
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Encrypt {

	public String encrypy(String content) {
		System.out.println("对文件进行加密"+content);
		return content+"加密后的内容";
	}
}
