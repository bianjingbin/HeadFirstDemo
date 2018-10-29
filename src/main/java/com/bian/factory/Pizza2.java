/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Pizza.java
 * 注意事项：
 * Id: Pizza.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.factory;

public abstract class Pizza2 {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Dough dough; //面团
	Sauce sauce; //酱汁
	Veggies veggies[]; //蔬菜
	Cheese cheese; //芝士
	Pepperoni pepperoni; //辣香肠
	Clams clam; //蛤利
	
	abstract void prepare();
	
	void bake() {
		System.out.println("烘焙25分钟~");
	}
	
	void cut() {
		System.out.println("切片~");
	}
	
	void box() {
		System.out.println("装盒~");
	}
	
	public String toString() {
		return "pizza code";
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */