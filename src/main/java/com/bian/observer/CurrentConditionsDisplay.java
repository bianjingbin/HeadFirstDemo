/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： CurrentConditionsDisplay.java
 * 注意事项：
 * Id: CurrentConditionsDisplay.java,v3.0 2018年8月30日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("当前状况：    温度:"+ temperature + "℃        湿度:"+ humidity + "%");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */