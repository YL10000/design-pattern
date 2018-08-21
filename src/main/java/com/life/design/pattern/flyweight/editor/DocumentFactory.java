/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: DocumentFactory.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: 享元工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:18:05
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

import java.util.Hashtable;

/**
 * @Title: DocumentFactory
 * @Description: 享元工厂类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:18:05
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class DocumentFactory {
	
	private Hashtable<String, Hashtable<String, Document>> documentPool=null;
	
	private static DocumentFactory factory=new DocumentFactory();

	private DocumentFactory() {
		documentPool=new Hashtable<>();
		documentPool.put("图片", new Hashtable<>());
		documentPool.put("视频", new Hashtable<>());
		documentPool.put("动画", new Hashtable<>());
	}
	
	public static DocumentFactory getInstance() {
		return factory;
	}
	
	public synchronized Document getDocument(String type,String path) {
		Document document=documentPool.get(type).get(path);
		if (document==null) {
			if (type.equals("图片")) {
				document=new ImageDocument(path);
			}else if(type.equals("视频")) {
				document=new VideoDoucment(path);
			}else if (type.equals("动画")) {
				document=new AnimationDocument(path);
			}else {
				throw new RuntimeException();
			}
			documentPool.get(type).put(path, document);
		}
		return document;
	}
}
