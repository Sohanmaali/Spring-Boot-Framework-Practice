package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entites.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		EmployeeDao empDao = context.getBean("employeeImp",EmployeeDao.class);
		
		Employee emp =  new Employee();	
//		---------------------------------------------------

//		INSERT DATA
//		emp.setId(2);
//		emp.setName("Sohan");
//		emp.setCity("Indore");
//		
//		int i = empDao.insertData(emp);
//		System.out.println("Row efected = "+ i);
		
//		---------------------------------------------------
		
//		UPDATE DATA
//		emp.setId(2);
//		emp.setName("Mohan");
//		emp.setCity("Indore");
//		int i = empDao.updateData(emp);
//		System.out.println("Row efected = "+ i);
		
//		---------------------------------------------------
		
//		DELETE DATA
//		emp.setId(2);
//		int i = empDao.deleteData(emp);
//		System.out.println("Row efected = "+ i);
		
//		---------------------------------------------------
		
//		GET ONE DATA
//		emp.setId(1);
//		Employee em = empDao.getOneData(emp);
//		System.out.println(em);
		
//		---------------------------------------------------
		
//		GET ALL DATA
		List<Employee> allemp = empDao.getAllData();
			for (Employee employee : allemp) {
				System.out.println(employee);
		}
	}
}
