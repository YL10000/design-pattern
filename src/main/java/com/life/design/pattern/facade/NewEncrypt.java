/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: NewEncrypt.java
 * @Package com.life.design.pattern.facade
 * @Description: 新的加密类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:04:43
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: NewEncrypt
 * @Description: 新的加密类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午11:04:43
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class NewEncrypt {

	public String encrype(String content) {
		System.out.println("使用新的加密类进行加密"+content);
		return "新加密类加密后的内容"+content;
	}
}
