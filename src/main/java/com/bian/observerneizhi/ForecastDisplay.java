/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： ForecastDisplay.java
 * 注意事项：
 * Id: ForecastDisplay.java,v3.0 2018年9月3日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observerneizhi;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement{
	Observable observable;
	private float currentPressure=29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable wd) {
		this.observable=wd;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("lastPressure:  "+lastPressure+"    currentPressure:  "+currentPressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData wd=(WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = wd.getCurrentPressure();
			display();
		}
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */