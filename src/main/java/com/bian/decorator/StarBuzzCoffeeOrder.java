/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： StarBuzzCoffeeOrder.java
 * 注意事项：
 * Id: StarBuzzCoffeeOrder.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

public class StarBuzzCoffeeOrder {

	public static void main(String[] args) {
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2=new DarkRoast();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		beverage2=new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		Beverage beverage3=new HouseBlend();
		beverage3=new Soy(beverage3);
		beverage3=new Mocha(beverage3);
		beverage3=new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */