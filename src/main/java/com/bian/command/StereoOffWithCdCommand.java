/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： StereoOnWithCdCommand.java
 * 注意事项：
 * Id: StereoOnWithCdCommand.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class StereoOffWithCdCommand implements Command{
	Stereo st;
	
	public StereoOffWithCdCommand(Stereo st) {
		this.st=st;
	}
	
	@Override
	public void execute() {
		st.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */