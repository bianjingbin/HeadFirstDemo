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

public class RemotePartyLoader {

	public static void main(String[] args) {
		RemoteControl rc=new RemoteControl();
		
		Light livingRoomLight=new Light("卧室灯");
		Light kitchenLight=new Light("厨房灯");
		Stereo stereo=new Stereo("卧室");
		
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);
		StereoOnWithCdCommand stereon=new StereoOnWithCdCommand(stereo);
		StereoOffWithCdCommand stereoff=new StereoOffWithCdCommand(stereo);
		
		Command[] partyOn= {livingRoomLightOn,kitchenLightOn,stereon};
		Command[] partyOff= {livingRoomLightOff,kitchenLightOff,stereoff};
		
		rc.setCommand(partyOn, partyOff);
		
		rc.onButtonWasPushed();
		System.out.println("-----------------------");
		rc.offButtonWasPushed();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */