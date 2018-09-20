/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： InputTest.java
 * 注意事项：
 * Id: InputTest.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(new FileInputStream("D:\\mygit\\test.txt")));
			while (((c = in.read()) >= 0)) {
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */