package com.Aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/Aop/xml/config.xml");
		Student e = context.getBean("student", Student.class);

		// Print statements and calling methods
		// as defined in other class above
		System.out.println("calling msg...");
		e.msg();
		System.out.println("\ncalling m...");
		e.m();
		System.out.println("\ncalling k...");
		e.k();
	}
}
