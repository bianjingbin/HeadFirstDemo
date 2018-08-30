/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Observer.java
 * 注意事项：
 * Id: Observer.java,v3.0 2018年8月30日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observer;

public interface Observer {
	public void update(float temp,float humidity,float pressure);
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */