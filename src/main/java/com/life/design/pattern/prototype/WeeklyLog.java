/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: WeeklyLog.java
 * @Package com.life.desgn.pattern.prototype
 * @Description: TODO(用一句话描述该文件做什么)
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午2:47:00
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
import java.util.Date;


/**
 * @Title: WeeklyLog
 * @Description: 周报原型类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月16日 下午2:47:00
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class WeeklyLog implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private Date date;
	
	private String content;
	
	private Attachment attachment;
	
	

	public WeeklyLog() {
		super();
	}
	
	public WeeklyLog(String name, Date date, String content) {
		super();
		this.name = name;
		this.date = date;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	@Override
	public String toString() {
		return "WeeklyLog [name=" + name + ", date=" + date + ", content=" + content + ", attachment=" + attachment
				+ "]";
	}

	@Override
	public WeeklyLog clone(){
		try {
			return (WeeklyLog) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制");
			return null;
		}
	}
	
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
		//将对象写入到输出流中
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//从输出流中将对象读取出来
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (WeeklyLog) ois.readObject();
	}
}
