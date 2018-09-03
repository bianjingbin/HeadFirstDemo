/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： WeatherStation.java
 * 注意事项：
 * Id: WeatherStation.java,v3.0 2018年8月30日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observerneizhi;

public class WeatherStation {

//	public static void main(String[] args) {
//		WeatherData wd=new WeatherData();
//		CurrentConditionDisplay ccd=new CurrentConditionDisplay(wd);
//		wd.setMeasurements(36, 65, 30.4f);
//	}

	public static void main(String[] args) {
		WeatherData wd=new WeatherData();
		ForecastDisplay fd=new ForecastDisplay(wd);
		wd.setMeasurements(0, 0, 0, 30f);
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */