/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Menu.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 菜单类包含多个菜单项
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:25:14
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Menu
 * @Description: 菜单类包含多个菜单项
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:25:14
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class Menu {

	List<MenuItem> items=new ArrayList<>();
	
	public Menu addMenuItem(MenuItem menuItem) {
		items.add(menuItem);
		return this;
	}
	
	public Menu removeMenuItem(MenuItem menuItem) {
		items.remove(menuItem);
		return this;
	}
	
	public void display() {
		items.stream().forEach(System.out::println);
	}
	
	public void call() {
		items.stream().forEach(MenuItem::click);
	}
}
