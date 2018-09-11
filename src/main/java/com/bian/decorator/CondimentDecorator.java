/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： CondimentDecorator.java
 * 注意事项：
 * Id: CondimentDecorator.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

public abstract class CondimentDecorator extends Beverage{

	public abstract String getDescription();
	
	public abstract int getSize();
	
	public abstract int setSize(int i);
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */