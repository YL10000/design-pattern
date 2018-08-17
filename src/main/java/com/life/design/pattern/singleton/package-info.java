/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: package-info.java
 * @Package com.life.desgn.pattern.singleton
 * @Description: 单例设计模式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 上午11:21:38
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
/**
 * @Title: package-info
 * @Description: 单例设计模式
 * @Author: ViaX-yanglin
 * @Date: 2018年8月15日 上午11:21:38
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.singleton;

/**
 * 饿汉式：在类加载时直接实例化，无效考虑多线程安全问题，但不管将来用不用，它总是占着资源
 * 懒汉式：在第一次调用时创建实例，无须一直占有资源，实现了延迟加载，但多线程下要考虑安全性问题，效率可能不高
 */


