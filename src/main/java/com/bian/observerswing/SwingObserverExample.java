/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： SwingObserverExample.java
 * 注意事项：
 * Id: SwingObserverExample.java,v3.0 2018年9月4日 bianjingbin Exp
 * ==============================================
 */
package com.bian.observerswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example=new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame=new JFrame();
		
		JButton button=new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.pack(); //面板大小自适应 
	    frame.setVisible(true); //显示面板
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it, you might regret it!");
		}
		
	}
	
	class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it!");
		}
		
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */