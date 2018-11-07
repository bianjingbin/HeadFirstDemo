/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： ChocolateBoiler.java
 * 注意事项：
 * Id: ChocolateBoiler.java,v3.0 2018年11月7日 bianjingbin Exp
 * ==============================================
 */
package com.bian.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		empty=true;
		boiled=false;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty=false;
			boiled=false;
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty=true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled=true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */