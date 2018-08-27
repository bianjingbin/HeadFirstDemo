/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Duck_one.java
 * 注意事项：
 * Id: Duck_one.java,v3.0 2018年8月27日 bianjingbin Exp
 * ==============================================
 */
package com.bian.day01;

public class Duck_two extends Duck{
	public Duck_two() {
		quackBehavior=new Quack();
	}
	
	public void display() {
		System.out.println("我是红头鸭!");
	}
	
	public static void main(String[] args) {
		Duck_two d=new Duck_two();
		d.perfromQuack();
		d.display();
		d.swim();
	}
}
/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */