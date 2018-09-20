/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： PizzaStore.java
 * 注意事项：
 * Id: PizzaStore.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public abstract class PizzaStore {
	
	public final Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	abstract Pizza createPizza(String type);
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */