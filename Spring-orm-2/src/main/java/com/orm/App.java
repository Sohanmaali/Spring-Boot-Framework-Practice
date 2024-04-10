package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.StudentDao;
import com.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/orm/config.xml");

		StudentDao std = context.getBean("studentDao", StudentDao.class);

		Student st = new Student(10, "raj", "indore");

		int i = std.insertData(st);
		System.out.println("Row Effected " + i);
	}
}
