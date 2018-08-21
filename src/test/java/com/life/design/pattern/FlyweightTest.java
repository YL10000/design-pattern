/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FlyweightTest.java
 * @Package com.life.design.pattern
 * @Description: 享元模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:40:39
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.flyweight.Coordinate;
import com.life.design.pattern.flyweight.GoChessman;
import com.life.design.pattern.flyweight.GoChessmanFactory;
import com.life.design.pattern.flyweight.editor.Document;
import com.life.design.pattern.flyweight.editor.DocumentFactory;
import com.life.design.pattern.flyweight.editor.Style;

/**
 * @Title: FlyweightTest
 * @Description: 享元模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 下午3:40:39
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FlyweightTest {
	
	@Test
	public void goChessmanTest() {
		GoChessman w1=GoChessmanFactory.getInstance().getGoChessman("white");
		GoChessman w2=GoChessmanFactory.getInstance().getGoChessman("white");
		GoChessman w3=GoChessmanFactory.getInstance().getGoChessman("white");
		
		GoChessman b1=GoChessmanFactory.getInstance().getGoChessman("black");
		GoChessman b2=GoChessmanFactory.getInstance().getGoChessman("black");
		
		System.out.println(w1==w2);//true
		System.out.println(w1==b1);//false
		System.out.println(b1==b2);//true
		w1.display(new Coordinate(1, 5));
		w2.display(new Coordinate(3, 8));
		w3.display(new Coordinate(2, 1));
		b1.display(new Coordinate(3, 5));
		b2.display(new Coordinate(4, 2));
	}
	
	@Test
	public void test() {
		//字符串内部使用了享元模式
		String a="abc";
		String b="abc";
		String c="ab"+"c";
		String d="ab";
		d+="c";
		String e=new String("abc");
		String f=new String("abc");
		System.out.println(a==b);//true
		System.out.println(a==c);//true
		System.out.println(a==d);//false
		System.out.println(a==e);//false
		System.out.println(f==e);//false
	}
	
	@Test
	public void eidtorTest() {
		Document a1=DocumentFactory.getInstance().getDocument("动画", "1.swf");
		Document a2=DocumentFactory.getInstance().getDocument("动画", "1.swf");
		Document v1=DocumentFactory.getInstance().getDocument("视频", "1.mp4");
		Document v2=DocumentFactory.getInstance().getDocument("视频", "2.mp4");
		Document i1=DocumentFactory.getInstance().getDocument("图片", "1.jpg");
		Document i2=DocumentFactory.getInstance().getDocument("图片", "1.jpg");
		
		System.out.println(a1==a2);
		System.out.println(v1==v2);
		System.out.println(i1==i2);
		System.out.println(a1==v1);
		a1.insertDocument(new Style(30l, 30l, 0l, 0l));
		a2.insertDocument(new Style(10l, 10l, 10l, 10l));
		v1.insertDocument(new Style(30l, 30l, 23l, 45l));
		v2.insertDocument(new Style(30l, 30l, 45l, 56l));
		i1.insertDocument(new Style(30l, 30l, 34l, 56l));
		i2.insertDocument(new Style(30l, 30l, 12l, 19l));
		
	}
}
