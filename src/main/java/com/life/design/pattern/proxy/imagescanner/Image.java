/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Image.java
 * @Package com.life.design.pattern.proxy.imagescanner
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午11:40:13
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.proxy.imagescanner;

/**
 * @Title: Image
 * @Description: TODO(用一句话描述这个类的作用)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月22日 上午11:40:13
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Image {
	
	//图片类型
	private String type;
	
	//图片名称
	private String name;
	
	//图片路径
	private String path;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Image(String type, String name, String path) {
		super();
		this.type = type;
		this.name = name;
		this.path = path;
	}

	public Image() {
		super();
	}
}
