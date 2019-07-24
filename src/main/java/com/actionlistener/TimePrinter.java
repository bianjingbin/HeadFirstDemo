/*
 * ==============================================
 * (C)2019 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： TimePrinter.java
 * 注意事项：
 * Id: TimePrinter.java,v3.0 2019年7月18日 bianjingbin Exp
 * ==============================================
 */
package com.actionlistener;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Now the time is : " + new Date());
		Toolkit.getDefaultToolkit().beep();
	}

}

/* Copyright (C) 2019, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */