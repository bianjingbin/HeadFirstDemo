/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： VeggiePizza.java
 * 注意事项：
 * Id: VeggiePizza.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public class VeggiePizza extends Pizza2{
	NYPizzaYuanLiaoFactory nyfac;
	
	public VeggiePizza(NYPizzaYuanLiaoFactory nyfac) {
		this.nyfac=nyfac;
	}

	@Override
	void prepare() {
		System.out.println("Preparing "+ name);
		dough=nyfac.createDough();
		sauce=nyfac.createSauce();
		cheese=nyfac.createCheese();
		veggies=nyfac.createVeggies();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */