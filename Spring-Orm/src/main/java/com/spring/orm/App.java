package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */ 
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao stDao = context.getBean("stDao", StudentDao.class);
		Student st = new Student(1, "Sohan", "Indore");

		int i = stDao.insertData(st);
		System.out.println(i);

	}
}
