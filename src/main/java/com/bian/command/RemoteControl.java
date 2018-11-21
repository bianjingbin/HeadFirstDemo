/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： RemoteControl.java
 * 注意事项：
 * Id: RemoteControl.java,v3.0 2018年11月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.command;

public class RemoteControl {
	Command[] oncommands;
	Command[] offcommands;
	Command undoCommand;
	
	public RemoteControl() {
		oncommands=new Command[7];
		offcommands=new Command[7];
		
		Command noCommand=new NoCommand();
		for (int i = 0; i < 7; i++) {
			oncommands[i]=noCommand;
			offcommands[i]=noCommand;
		}
		undoCommand=noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand) {
		oncommands[slot]=onCommand;
		offcommands[slot]=offCommand;
	}
	
	public void setCommand(Command[] onCommands,Command[] offCommands) {
		for (int i = 0; i < onCommands.length; i++) {
			oncommands[i]=onCommands[i];
		}
		for (int i = 0; i < offCommands.length; i++) {
			offcommands[i]=offCommands[i];		
		}
	}
	
	public void onButtonWasPushed(int slot) {
		oncommands[slot].execute();
		undoCommand=oncommands[slot];
	}
	
	public void onButtonWasPushed() {
		for (int i = 0; i < oncommands.length; i++) {
			oncommands[i].execute();
		}
	}
	
	public void offButtonWasPushed() {
		for (int i = 0; i < offcommands.length; i++) {
			offcommands[i].execute();
		}
	}
	
	public void offButtonWasPushed(int slot) {
		offcommands[slot].execute();
		undoCommand=offcommands[slot];
	}
	
	public void undoButtomWasPressed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("\n------ Remote Control ------\n");
		for (int i = 0; i < oncommands.length; i++) {
			sb.append("[slot " + i + "]" + oncommands[i].getClass().getName() + "    " + offcommands[i].getClass().getName() + "\n");
		}
		return sb.toString();
	}
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */