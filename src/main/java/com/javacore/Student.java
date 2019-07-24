/*
 * ==============================================
 * (C)2019 Shanghai KingstarWinning Corporation. All rights reserved.
 * 项目名称： 规则引擎
 * 系统名称： ENGINE3.0
 * 文件名称： Student.java
 * 注意事项：
 * Id: Student.java,v3.0 2019年7月17日 bianjingbin Exp
 * ==============================================
 */
package com.javacore;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private String sex;

	public Student() {
	}

	public Student(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.age, o.age);
	}

}

/* Copyright (C) 2019, 上海金仕达卫宁软件科技有限公司 Project, All Rights Reserved. */