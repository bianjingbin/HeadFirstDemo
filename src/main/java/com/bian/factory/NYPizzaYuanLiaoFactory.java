/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： NYPizzaYuanLiaoFactory.java
 * 注意事项：
 * Id: NYPizzaYuanLiaoFactory.java,v3.0 2018年10月24日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public class NYPizzaYuanLiaoFactory implements PizzaYuanLiaoFactory{

	@Override
	public Dough createDough() {
		return new Dough();
	}

	@Override
	public Sauce createSauce() {
		return new Sauce();
	}

	@Override
	public Cheese createCheese() {
		return new Cheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[]= {new Carrot() , new RomaineLettuce()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

	@Override
	public Clams createClam() {
		return new Clams();
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */