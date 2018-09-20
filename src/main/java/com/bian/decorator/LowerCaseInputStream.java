/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： LowerCaseInputStream.java
 * 注意事项：
 * Id: LowerCaseInputStream.java,v3.0 2018年9月20日 bianjingbin Exp
 * ==============================================
 */
package com.bian.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c:Character.toLowerCase(c));
	}
	
	public int read(byte[] b,int offset, int len) throws IOException {
		int result=super.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i]=(byte) Character.toLowerCase(b[i]);
		}
		return result;
	}
	
}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */