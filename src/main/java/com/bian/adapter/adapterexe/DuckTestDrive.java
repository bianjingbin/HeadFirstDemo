/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： DuckTestDrive.java
 * 注意事项：
 * Id: DuckTestDrive.java,v3.0 2018年11月22日 bianjingbin Exp
 * ==============================================
 */
package com.bian.adapter.adapterexe;

public class DuckTestDrive {
	public static void main(String[] args) {
		/*TTurkey tt=new TTurkey();
		Duck ta=new TurkeyAdapter(tt);
		ta.quack();
		ta.fly();*/
		
		TDuck td=new TDuck();
		Turkey t=new DuckAdapter(td);
		t.gobble();
		t.fly();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */