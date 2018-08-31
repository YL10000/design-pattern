/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: ActionTest.java
 * @Package com.life.design.pattern
 * @Description: 命令模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:11:36
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern;

import org.junit.Test;

import com.life.design.pattern.action.CommandQueue;
import com.life.design.pattern.action.CommandQueueInvoker;
import com.life.design.pattern.action.ConcreteCommand;
import com.life.design.pattern.action.Invoker;
import com.life.design.pattern.action.Receiver;
import com.life.design.pattern.action.broadscreen.BoardScreen;
import com.life.design.pattern.action.broadscreen.CreateCommand;
import com.life.design.pattern.action.broadscreen.EditCommand;
import com.life.design.pattern.action.broadscreen.Menu;
import com.life.design.pattern.action.broadscreen.MenuItem;
import com.life.design.pattern.action.broadscreen.OpenCommand;
import com.life.design.pattern.action.function.Command;
import com.life.design.pattern.action.function.FunctionBt;
import com.life.design.pattern.action.function.FunctionBtWindow;
import com.life.design.pattern.action.function.HelpCommand;
import com.life.design.pattern.action.function.HelpHandler;
import com.life.design.pattern.action.function.MinCommand;
import com.life.design.pattern.action.function.MinHandler;
import com.life.design.pattern.action.undo.AddCommand;
import com.life.design.pattern.action.undo.Adder;
import com.life.design.pattern.action.undo.Calculate;
import com.life.design.pattern.action.undo.MinusCommand;
import com.life.design.pattern.action.undo.Minuser;

/**
 * @Title: ActionTest
 * @Description: 命令模式测试类
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午4:11:36
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class ActionTest {

	@Test
	public void actionTest() {
		Invoker invoker=new Invoker(new ConcreteCommand(new Receiver()));
		invoker.call();
	}
	
	@Test
	public void functionTest() {
		FunctionBtWindow functionBtWindow=new FunctionBtWindow();
		Command minCommand=new MinCommand("最小化",new MinHandler());
		Command helpCommand=new HelpCommand("帮助",new HelpHandler());
		
		functionBtWindow.addFunctionBt(new FunctionBt("按钮1", helpCommand));
		functionBtWindow.addFunctionBt(new FunctionBt("按钮2", minCommand));
		functionBtWindow.displayBts();
	}
	
	@Test
	public void commandQueueTest() {
		CommandQueueInvoker invoker=new CommandQueueInvoker(new CommandQueue());
		invoker.seedCommand(new ConcreteCommand(new Receiver()));
		invoker.seedCommand(new ConcreteCommand(new Receiver()));
		invoker.seedCommand(new ConcreteCommand(new Receiver()));
		invoker.call();
	}
	
	@Test
	public void undoTest() {
		Calculate calculate=new Calculate(new AddCommand(new Adder()),new MinusCommand(new Minuser()));
		double result=calculate.add(4).add(5).undo().undo().mins(3).add(2).undo().add(4).mins(1).result();
		System.out.println(result);
	}
	
	@Test
	public void boardScreenTest() {
		Menu menu=new Menu();
		BoardScreen boardScreen=new BoardScreen();
		menu.addMenuItem(new MenuItem("菜单项1", new OpenCommand(boardScreen)))
			.addMenuItem(new MenuItem("菜单项2", new CreateCommand(boardScreen)))
			.addMenuItem(new MenuItem("菜单项3", new EditCommand(boardScreen)));
		menu.display();
		menu.call();
	}
}
