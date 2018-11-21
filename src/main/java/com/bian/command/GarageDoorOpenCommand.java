/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： GarageDoorOpenCommand.java
 * 注意事项：
 * Id: GarageDoorOpenCommand.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class GarageDoorOpenCommand implements Command{
	GarageDoor gd;

	public GarageDoorOpenCommand(GarageDoor gdoor) {
		gd=gdoor;
	}

	@Override
	public void execute() {
		gd.open();
	}

	@Override
	public void undo() {
		gd.close();
		
	}
	
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */