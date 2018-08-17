/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: PrototypeManager.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: 原型管理器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:28:49
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype;

import java.util.HashMap;

/**
 * @Title: PrototypeManager
 * @Description: 原型管理器
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:28:49
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class PrototypeManager<T extends Email> {

	//使用饿汉式实现单例
	private static PrototypeManager<Email> prototypeManager=new PrototypeManager<>();
	
	public static PrototypeManager<Email> getPrototypeManager() {
		return prototypeManager;
	}
	
	//定义一个存储原型对象的HashMap
	private HashMap<String, Email> prototypes=new HashMap<>();
	
	private PrototypeManager(){
		prototypes.put("private", new PrivateEmail());
		prototypes.put("public", new PublicEmail());
	}
	
	public void addEmailPrototype(String key,Email email) {
		prototypes.put(key, email);
	}
	
	public Email getEmail(String key) {
		return prototypes.get(key).deepCopy();
	}
}
