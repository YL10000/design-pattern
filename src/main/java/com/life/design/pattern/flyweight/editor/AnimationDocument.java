/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AnimationDocument.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: 动画类-具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:13:16
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

/**
 * @Title: AnimationDocument
 * @Description: 动画类-具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:13:16
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class AnimationDocument extends Document{

	public AnimationDocument(String path) {
		super();
		this.setType("动画");
		this.setPath(path);
	}
}
