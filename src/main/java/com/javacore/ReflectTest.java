package com.javacore;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		System.out.println(LocalDate.of(2019, 9, 10).plusDays(1).toString());
		Method[] methods = Class.forName("com.javacore.Student").getDeclaredMethods();
		Field[] fie = Class.forName("com.javacore.Student").getDeclaredFields();
		for (Field field : fie) {
			System.out.println(Modifier.toString(field.getModifiers())+"->"+field.getName());
		}
		for (Method method : methods) {
			System.out.println(Modifier.toString(method.getModifiers())+"->"+method.getReturnType()+" -> "+method.getName());
		}
		Student stu=new Student();
		stu.setName("张三丰");
		System.out.println(stu.getClass().getMethod("getName", null).invoke(stu, null));
		stu.getClass().getMethod("setAge", int.class).invoke(stu, 1);
		System.out.println(stu.getAge());
	}
}