/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： NYStylePizzaStore.java
 * 注意事项：
 * Id: NYStylePizzaStore.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public class NYStylePizzaStore extends PizzaStore{
	Pizza pizza;
	
	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			pizza= new NYStyleCheesePizza();
		}else if(type.equals("pepperoni")) {
			pizza=new NYStylePepperoniPizza();
		}else if(type.equals("veggie")) {
			pizza=new NYStyleVeggiePizza();
		}
		return pizza;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */