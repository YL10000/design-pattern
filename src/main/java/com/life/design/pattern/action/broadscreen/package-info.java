/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: package-info.java
 * @Package com.life.design.pattern.action.broadscreen
 * @Description: 命令模式实现公告平台
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:05:36
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
/**
 * @Title: package-info
 * @Description: 命令模式实现公告平台
 * @Author: ViaX-yanglin
 * @Date: 2018年8月31日 上午10:05:36
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.action.broadscreen;

/**
 * 1、主菜单menu包含一些菜单项menuItem
 * 2、通过menu的addMenuItem方法添加菜单项
 * 3、菜单项的主要方法是click,每一个菜单项中包含一个抽象命令类OpenCommand,CreateCommand,EditCommand,
 * 4、命令类都有一个execute方法，调用公告面板界面类BoardScreen的open、create、edit方法
 */
