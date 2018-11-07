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

public class SingletonChocolateBoiler {
//	private static SingletonChocolateBoiler instance;
	private static SingletonChocolateBoiler instance=new SingletonChocolateBoiler();
	private boolean empty;
	private boolean boiled;
	
	private SingletonChocolateBoiler() {
		empty=true;
		boiled=false;
	}
	
	/*//如果不加synchronized修饰的话,外面如果多个线程同时获取这个类的实例,可能会同时
	//进入这个方法，这样就会造成返回此类多个不同的实例,加了synchronized则只会允许上一个线程离开这个方法下一个线程才能进入
	public static synchronized SingletonChocolateBoiler getinstance() {
		if(instance == null) {
			instance = new SingletonChocolateBoiler();
		}
		return instance;
	}*/
	
	public static SingletonChocolateBoiler getinstance() {
		return instance;
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
	
	/*//双重检查锁实现
	private static volatile SingletonChocolateBoiler instance;
	
	public static SingletonChocolateBoiler getinstance() {
		if(instance==null) {
			synchronized(SingletonChocolateBoiler.class) {
				if(instance==null) {
					instance = new SingletonChocolateBoiler();
				}
			}
		}
		return instance;
	}*/
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */