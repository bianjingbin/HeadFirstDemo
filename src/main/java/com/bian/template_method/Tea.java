/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Coffee.java
 * 注意事项：
 * Id: Coffee.java,v3.0 2018年11月29日 bianjingbin Exp
 * ==============================================
 */
package com.bian.template_method;

public class Tea extends CaffeineBeverage{
	/*void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}*/

	private void addLemon() {
		System.out.println("Adding Lemon");		
	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea");		
	}

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */