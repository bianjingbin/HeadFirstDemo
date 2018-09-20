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

public abstract class Pizza {
	public void prepare() {
		System.out.println("开始准备");
	}
	
	public void bake() {
		System.out.println("开始烘焙");
	}
	
	public void cut() {
		System.out.println("开始切块");
	}
	
	public void box() {
		System.out.println("开始装盒");
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */