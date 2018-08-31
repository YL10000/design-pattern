/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: FunctionBtWindow.java
 * @Package com.life.design.pattern.action.function
 * @Description: 快捷按钮设置窗口
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:31:16
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.function;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: FunctionBtWindow
 * @Description: 快捷按钮设置窗口
 * @Author: ViaX-yanglin
 * @Date: 2018年8月29日 下午8:31:16
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public class FunctionBtWindow {

	private List<FunctionBt> functionBts=new ArrayList<>();
	
	public void addFunctionBt(FunctionBt functionBt) {
		functionBts.add(functionBt);
	}
	
	public void deleteFunctionBt(FunctionBt functionBt) {
		functionBts.remove(functionBt);
	}
	
	public void displayBts() {
		functionBts.stream().forEach(FunctionBt::click);
	}
	
}
