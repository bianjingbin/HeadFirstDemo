/*
 * ==============================================
 * (C)2018 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： HelloWorldTest.java
 * 注意事项：
 * Id: HelloWorldTest.java,v3.0 2018年11月28日 bianjingbin Exp
 * ==============================================
 */
package com.javacore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldTest {

	public static void main(String[] args) {
		//System.out.println("Java核心技术也将开始~~~");
		System.out.println(isValid("20070228"));
	}
	
	public static boolean isValid(String dateStr) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		try {
            //采用严格的解析方式，防止类似 “2017-05-35” 类型的字符串通过
			sdf.setLenient(false);
			sdf.parse(dateStr);
            Date date = (Date)sdf.parse(dateStr);
            //重复比对一下，防止类似 “2017-5-15” 类型的字符串通过
            String newDateStr = sdf.format(date);
            if(dateStr.equals(newDateStr)){
                return true;
            }else {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
	}

}

/* Copyright (C) 2018, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */