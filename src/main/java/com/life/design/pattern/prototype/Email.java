/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Email.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: 邮件抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:34:00
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Title: Email
 * @Description: 邮件抽象类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午4:34:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public  class Email implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String content;
	
	private Attachment attachment;
	
	public Email() {
		super();
	}

	public Email(String content, Attachment attachment) {
		super();
		this.content = content;
		this.attachment = attachment;
	}

	@Override
	public String toString() {
		return "Email [content=" + content + ", attachment=" + attachment + "]";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public Email deepCopy() {
		try {
			return deepClone(this);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("复制失败");
			return null;
		}
	}
	
	public void display() {
		System.out.println(this);
	};
	
	@SuppressWarnings("unchecked")
	protected <T extends Email> T deepClone(T t) throws IOException, ClassNotFoundException{
		//将对象写入到输出流中
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//从输出流中将对象读取出来
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (T) ois.readObject();
	}
}
