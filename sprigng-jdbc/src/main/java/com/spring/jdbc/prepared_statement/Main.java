package com.spring.jdbc.prepared_statement;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.entites.Student;
import com.spring.jdbc.prepared_statement.dao.StudentImp;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/jdbc/prepared_statement/config.xml");
		StudentImp st = context.getBean("studentImp", StudentImp.class);
//		Student st1 = new Student(104, "rekha", "khategaon");
//		st.add(st1);
//		System.out.println(st.add(st1));
		Student std = st.getOneData();

		System.out.println(std);

	}
}
