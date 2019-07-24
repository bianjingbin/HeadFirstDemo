/*
 * ==============================================
 * (C)2019 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： HelloWorldTest.java
 * 注意事项：
 * Id: MyTest.java,v3.0 2019年7月8日 bianjingbin Exp
 * ==============================================
 */
package com.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字个数：");
		int num1 = sc.nextInt();
		System.out.println("随机抽取个数：");
		int num2 = sc.nextInt();
		List<Integer> al = new ArrayList<Integer>();
		for (int j = 1; j <= num1; j++) {
			al.add(j);
		}
		Integer[] ss = new Integer[num2];
		for (int i = 0; i < num2; i++) {
			int ii = new Random().nextInt(al.size());
			ss[i] = al.get(ii);
			al.remove(ii);
		}
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println("长度: " + ss.length);
		List<Integer> list = Arrays.asList(ss);
		List<Integer> al1 = new ArrayList<Integer>();
		for (Integer integer : al) {
			if(!list.contains(integer)) {
				al1.add(integer);
			}
		}
		System.out.println("不包含的数字： "+Arrays.toString(al1.toArray()));
	}
}

/* Copyright (C) 2019, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */