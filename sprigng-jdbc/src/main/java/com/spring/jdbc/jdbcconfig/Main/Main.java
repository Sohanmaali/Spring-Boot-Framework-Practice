package com.spring.jdbc.jdbcconfig.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.entites.Student;
import com.spring.jdbc.jdbcconfig.dao.StudentDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao stDao = context.getBean("getStudentDao",StudentDao.class);
		
		Student st =  new Student();
//		----------------------------------------------------
		
//		INSERT DATA
//		st.setId(11);
//		st.setName("AAshi");
//		st.setCity("indore");
//		int i = stDao.insertData(st);
//		System.out.println("Row Efeced = "+ i);
		
//		----------------------------------------------------
		
//		UPDATE DATA
//		st.setId(11);
//		st.setName("Raj");
//		st.setCity("indore");
//		int i = stDao.updateData(st);
//		System.out.println("Row Efeced = "+ i);

//		----------------------------------------------------
		
//		DELETE DATA
//		st.setId(11);
//		int i = stDao.deleteData(st);
//		System.out.println("Row Efeced = "+ i);

//		----------------------------------------------------
		
//		GET ONE ROW
//		st.setId(10);
//		Student st1 = stDao.getOneRow(st);
//		System.out.println(st1);
		
//		----------------------------------------------------
		
//		GET ALL DATA
		List<Student> std = stDao.getAllData();
		
		for (Student student : std) {
			System.out.println(student);
		}
	}
}
