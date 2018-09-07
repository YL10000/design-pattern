/**
 * Copyright © 2017, Beijing XitianQujing Technology Co., Ltd.
 * @Title: Candidate.java
 * @Package com.life.design.pattern.visitor.award
 * @Description: 抽象元素--候选人
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:17:32
 * @Version V1.0
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
package com.life.design.pattern.visitor.award;

/**
 * @Title: Candidate
 * @Description: 抽象元素--候选人
 * @Author: ViaX-yanglin
 * @Date: 2018年9月7日 下午6:17:32
 * 
 * @Copyright: 2018 All Rights Reserved.北京西天取经科技有限公司
 */
public abstract class Candidate {

	private String name;
	
	//发表论文数
	private int paperCount;
	
	//分数
	private int scores;

	public Candidate(String name, int paperCount, int scores) {
		super();
		this.name = name;
		this.paperCount = paperCount;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public int getPaperCount() {
		return paperCount;
	}

	public int getScores() {
		return scores;
	}
	
	public abstract void accept(Award award);
}
