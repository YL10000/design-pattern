/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: AbstractFacade.java
 * @Package com.life.design.pattern.facade
 * @Description: 抽象外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:55:56
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.facade;

/**
 * @Title: AbstractFacade
 * @Description: 抽象外观角色
 * @Author: ViaX-yanglin
 * @Date: 2018年8月21日 上午10:55:56
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class AbstractFacade {

	public abstract void encrypt(String sourcePath,String targetPath);
}
