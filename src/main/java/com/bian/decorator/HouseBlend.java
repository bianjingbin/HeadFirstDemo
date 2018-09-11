/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： HouseBlend.java
 * 注意事项：
 * Id: HouseBlend.java,v3.0 2018年9月6日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;
//综合咖啡
public class HouseBlend extends Beverage{

	public HouseBlend() {
		description="综合咖啡";
	}
	
	@Override
	public double cost() {
		return .89;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setSize(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */