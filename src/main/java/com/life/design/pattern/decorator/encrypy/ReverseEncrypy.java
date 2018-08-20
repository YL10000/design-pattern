/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ReverseEncrypy.java
 * @Package com.life.design.pattern.decorator.encrypy
 * @Description: 逆向输出加密器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:09:22
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.decorator.encrypy;

/**
 * @Title: ReverseEncrypy
 * @Description: 逆向输出加密器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月20日 下午7:09:22
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ReverseEncrypy extends Encryptor {

	public ReverseEncrypy(Encryptor encryptor) {
		super(encryptor);
	}

	@Override
	public String encrypy(String source) {
		source=getEncryptor().encrypy(source);
		System.out.println(source+"->逆向输出加密");
		return source+"->逆向输出加密";
	}

}
