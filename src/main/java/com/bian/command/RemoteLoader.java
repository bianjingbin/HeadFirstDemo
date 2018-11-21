/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： RemoteLoader.java
 * 注意事项：
 * Id: RemoteLoader.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl rc=new RemoteControl();
		
		Light livingRoomLight=new Light("卧室灯");
		Light kitchenLight=new Light("厨房灯");
		Stereo stereo=new Stereo("卧室");
		GarageDoor gd=new GarageDoor();
		Fan fan=new Fan("教室");
		
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		GarageDoorOpenCommand garageDoorOpen=new GarageDoorOpenCommand(gd);
		
		FanHighCommand fanhigh=new FanHighCommand(fan);
		FanMEDIUMCommand fanmedium=new FanMEDIUMCommand(fan);
		FanLowCommand fanlow=new FanLowCommand(fan);
		FanOFFCommand fanoff=new FanOFFCommand(fan);
		
		StereoOnWithCdCommand stereoOnWithCD=new StereoOnWithCdCommand(stereo);
		StereoOffWithCdCommand stereoOffWithCD=new StereoOffWithCdCommand(stereo);
		
		rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		rc.setCommand(1, kitchenLightOn, kitchenLightOff);
		rc.setCommand(2, stereoOnWithCD, stereoOffWithCD);
		rc.setCommand(3, garageDoorOpen, garageDoorOpen);
		rc.setCommand(4, fanhigh, fanoff);
		rc.setCommand(5, fanmedium, fanoff);
		rc.setCommand(6, fanlow, fanoff);
		
		System.out.println(rc);
		
		rc.onButtonWasPushed(0);
		//rc.offButtonWasPushed(0);
		rc.undoButtomWasPressed();
		rc.onButtonWasPushed(1);
		//rc.offButtonWasPushed(1);
		rc.undoButtomWasPressed();
		rc.onButtonWasPushed(2);
		rc.offButtonWasPushed(2);
		rc.onButtonWasPushed(3);
		rc.undoButtomWasPressed();
		
		rc.onButtonWasPushed(4);
		rc.onButtonWasPushed(5);
		rc.undoButtomWasPressed();
		rc.onButtonWasPushed(6);
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */