/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： CurrentConditionDisplay.java
 * 注意事项：
 * Id: CurrentConditionDisplay.java,v3.0 2018年9月3日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observerneizhi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("当前状况：    温度:"+ temperature + "℃        湿度:"+ humidity + "%");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData wd=(WeatherData) o;
			this.temperature=wd.getTemperature();
			this.humidity=wd.getHumidity();
			display();
		}
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */