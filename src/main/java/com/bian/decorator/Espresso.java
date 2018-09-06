/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Espresso.java
 * 注意事项：
 * Id: Espresso.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;
//浓缩咖啡
public class Espresso extends Beverage{
	
	public Espresso() {
		description="浓缩咖啡";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */