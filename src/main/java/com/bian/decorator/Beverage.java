/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Beverage.java
 * 注意事项：
 * Id: Beverage.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

public abstract class Beverage {
	public static final int SMALL=1;
	public static final int MIDDLE=2;
	public static final int LARGE=3;
	
	String description="Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public abstract int getSize();
	
	public abstract int setSize(int i);

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */