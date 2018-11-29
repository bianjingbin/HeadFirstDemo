/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： TTurkey.java
 * 注意事项：
 * Id: TTurkey.java,v3.0 2018年11月22日 bianjingbin Exp
 * ==============================================
 */
package com.bian.adapter.adapterexe;

public class TTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("咯咯叫");
	}

	@Override
	public void fly() {
		int j=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("飞行1米!");
			j++;
		}
		System.out.println("总计"+j+"米！");
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */