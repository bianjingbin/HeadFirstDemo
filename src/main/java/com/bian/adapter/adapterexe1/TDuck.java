/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： TDuck.java
 * 注意事项：
 * Id: TDuck.java,v3.0 2018年11月22日 bianjingbin Exp
 * ==============================================
 */
package com.bian.adapter.adapterexe1;

public class TDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("呱呱叫");
	}

	@Override
	public void fly() {
		System.out.println("飞行5米!");
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */