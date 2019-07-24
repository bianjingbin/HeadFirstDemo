package com.javacore;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.util.Arrays;

public class ComparatorTest {
	public static void main(String[] args) throws Exception {
		Student[] stu = new Student[5];
		stu[0] = new Student("张三", 21, "男");
		stu[1] = new Student("李四", 28, "女");
		stu[2] = new Student("王五", 23, "男");
		stu[3] = new Student("大胖", 25, "女");
		stu[4] = new Student("祥狗", 32, "男");

		Arrays.sort(stu);

		for (Student st : stu) {
			System.out.println(st.getName() + "   " + st.getAge() + "   " + st.getSex());
		}
	}
}