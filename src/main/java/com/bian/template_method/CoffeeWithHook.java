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

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
	/*void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}*/

	private void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");		
	}

	private void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
		
	}

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments() {
		String answer=null;
		System.out.println("Do You Want Condiments? Please enter Y or N :");
		Scanner sc=new Scanner(System.in);
		answer=sc.nextLine();
		if((answer.toUpperCase()).equals("Y")) {
			return true;
		}
		return false;
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */