/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Order.java
 * 注意事项：
 * Id: Order.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public class Order {

	public static void main(String[] args) {
		//PizzaStore nyps=new NYStylePizzaStore();
		//nyps.orderPizza("cheese");
		//Veggies veggies[]= {new Carrot() , new RomaineLettuce()};
		//System.out.println(veggies);
		PizzaStore ps=new NYStylePizzaStore2();
		ps.orderPizza("veggie");
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */