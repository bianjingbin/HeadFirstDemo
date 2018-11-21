/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： FanCommand.java
 * 注意事项：
 * Id: FanCommand.java,v3.0 2018年11月21日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class FanLowCommand implements Command {
	Fan fan;
	int prevSpeed;
	
	public FanLowCommand(Fan fan) {
		this.fan=fan;
	}	

	@Override
	public void execute() {
		prevSpeed=fan.getSpeed();
		fan.low();
	}

	@Override
	public void undo() {
		if(prevSpeed==Fan.HIGH) {
			fan.high();
		}else if(prevSpeed==Fan.MEDIUM) {
			fan.medium();
		}else if(prevSpeed==Fan.LOW) {
			fan.low();
		}else if(prevSpeed==Fan.OFF) {
			fan.off();
		}
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */