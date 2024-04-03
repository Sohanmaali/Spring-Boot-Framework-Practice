package com.spring.jdbc.named_parameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.named_parameter.entites.Employee;
import com.spring.jdbc.named_parameter.dao.EmployeeDaoImp;

public class EmployeeMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/named_parameter/config.xml");

		EmployeeDaoImp empDao = context.getBean("employeeImp", EmployeeDaoImp.class);

		Employee emp = new Employee();
//		---------------------------------------------------

//		INSERT DATA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		emp.setId(4); 
		emp.setName("rajesh");                                                                                       
		emp.setCity("Indore");

		int i = empDao.insert(emp);
		System.out.println("Row efected = " + i);

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
//		List<Employee> allemp = empDao.getAllData();
//			for (Employee employee : allemp) {
//				System.out.println(employee);
//		}
	}

}
