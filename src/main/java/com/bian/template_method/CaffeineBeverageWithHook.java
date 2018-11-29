/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： CaffeineBeverage.java
 * 注意事项：
 * Id: CaffeineBeverage.java,v3.0 2018年11月29日 bianjingbin Exp
 * ==============================================
 */
package com.bian.template_method;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
		   addCondiments();			
		}
	}
	
	public boolean customerWantsCondiments() {
		return true;
	}

	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */