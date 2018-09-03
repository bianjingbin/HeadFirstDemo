/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： WeatherData.java
 * 注意事项：
 * Id: WeatherData.java,v3.0 2018年9月3日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observerneizhi;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	private float currentpressure;
	
	public WeatherData() {}
	
	public void setMeasurements(float temperature,float humidity,float pressure,float currentpressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		this.currentpressure=currentpressure;
		measurementsChanged();
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getCurrentPressure() {
		return currentpressure;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */