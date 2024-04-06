package com.Aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Aop.annotation.services.*;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);

		Student py = context.getBean("student", Student.class);
		py.studay();
		System.out.println("All clear.......");
	}
}
