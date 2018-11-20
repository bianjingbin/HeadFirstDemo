/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Light.java
 * 注意事项：
 * Id: Light.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class Light {
	String str;
	
	public Light(String str) {
		this.str=str;
	}
	
	public void on() {
		System.out.println("开 " + str);
	}

	public void off() {
		System.out.println("关 " + str);
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */