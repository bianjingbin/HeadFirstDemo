/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Duck.java
 * 注意事项：
 * Id: Duck.java,v3.0 2018年8月27日 bianjingbin Exp
 * ==============================================
 */
package com.bian.strategy;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
	
	public void perfromQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void swim() {
		System.out.println("我会游泳！");
	}
	
	public void display() {
		System.out.println("头的类型。。");
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */