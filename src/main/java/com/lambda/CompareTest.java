package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		String[] ss = new String[] { "abc", "ab", "abcd", "a" };
		// 初始顺序
		for (String s : ss) {
			System.out.print(s + "  ");
		}
		System.out.println();
		// 按字符串长度排序
		Arrays.sort(ss, (first, second) -> first.length() - second.length());
		System.out.println("-------------------------");
		// 排序后的顺序
		for (String s : ss) {
			System.out.print(s + "  ");
		}
		System.out.println();
		System.out.println("-------------------------");
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add(null);
		list.add("aaa");
		list.add(null);
		// 初始成员
		for (String s : list) {
			System.out.print(s + "   ");
		}
		System.out.println();
		System.out.println("-------------------------");
		// 去除null
		list.removeIf(e -> e == null);
		// 去除后
		for (String s : list) {
			System.out.println(s);
		}
	}
}
