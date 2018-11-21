/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Fan.java
 * 注意事项：
 * Id: Fan.java,v3.0 2018年11月21日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class Fan {
	public static final int HIGH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=0;
	String location;
	int speed;
	
	public Fan(String location) {
		this.location=location;
		speed=OFF;
	}
	
	public void high() {
		speed=HIGH;
		System.out.println(location + "电风扇高速");
	}
	
	public void medium() {
		speed=MEDIUM;
		System.out.println(location + "电风扇中速");
	}
	
	public void low() {
		speed=LOW;
		System.out.println(location + "电风扇低速");
	}
	
	public void off() {
		speed=OFF;
		System.out.println(location + "电风扇关闭");
	}
	
	public int getSpeed() {
		return speed;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */