/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Stereo.java
 * 注意事项：
 * Id: Stereo.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class Stereo {
	String str;
	
	public Stereo(String str) {
		this.str=str;
	}
	
	public void setCD() {
		System.out.println(str + "音响设置CD");
	}

	public void on() {
		System.out.println(str + "打开音响");
	}

	public void setVolume(int i) {
		System.out.println(str + "音响设置音量为 " + i);
	}

	public void off() {
		System.out.println(str + "关闭音响");
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */