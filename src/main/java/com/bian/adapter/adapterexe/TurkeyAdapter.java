/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： TurkeyAdapter.java
 * 注意事项：
 * Id: TurkeyAdapter.java,v3.0 2018年11月22日 bianjingbin Exp
 * ==============================================
 */
package com.bian.adapter.adapterexe;

public class TurkeyAdapter implements Duck {
	Turkey t;
	
	public TurkeyAdapter(Turkey t) {
		this.t=t;
	}

	@Override
	public void quack() {
		t.gobble();
	}

	@Override
	public void fly() {
		t.fly();
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */