/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Mocha.java
 * 注意事项：
 * Id: Mocha.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" + 奶泡";
	}

	@Override
	public double cost() {
		double cost=beverage.cost();
		if(getSize() == Beverage.SMALL) {
			cost +=.10;
		}else if(getSize() == Beverage.MIDDLE) {
			cost +=.15;
		}else if(getSize() == Beverage.LARGE) {
			cost +=.20;
		}
		return cost;
	}

	@Override
	public int getSize() {
		return beverage.getSize();
	}

	@Override
	public int setSize(int i) {
		return i;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */