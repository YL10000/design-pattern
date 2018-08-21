/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ImageDocument.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:06:59
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

/**
 * @Title: ImageDocument
 * @Description: 具体享元类--图片文档
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:06:59
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ImageDocument extends Document {

	public ImageDocument(String path) {
		super();
		this.setType("图片");
		this.setPath(path);
	}
}
