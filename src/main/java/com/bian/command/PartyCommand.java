/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： LightOnCommand.java
 * 注意事项：
 * Id: LightOnCommand.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class PartyCommand implements Command {
	Command[] commands;
	
	public PartyCommand(Command[] command) {
		this.commands=command;
	}

	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */