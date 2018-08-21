/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: VideoDoucment.java
 * @Package com.life.design.pattern.flyweight.editor
 * @Description: 视频类-具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:10:50
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.flyweight.editor;

/**
 * @Title: VideoDoucment
 * @Description: 视频类-具体享元类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午6:10:50
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class VideoDoucment extends Document {

	public VideoDoucment(String path) {
		super();
		this.setType("视频");
		this.setPath(path);
	}
}
