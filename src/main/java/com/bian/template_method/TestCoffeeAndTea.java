/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： TestCoffeeAndTea.java
 * 注意事项：
 * Id: TestCoffeeAndTea.java,v3.0 2018年11月29日 bianjingbin Exp
 * ==============================================
 */
package com.bian.template_method;

public class TestCoffeeAndTea {

	public static void main(String[] args) {
		/*Tea tea=new Tea();
		tea.prepareRecipe();*/
		
		CoffeeWithHook cwh=new CoffeeWithHook();
		cwh.prepareRecipe();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */