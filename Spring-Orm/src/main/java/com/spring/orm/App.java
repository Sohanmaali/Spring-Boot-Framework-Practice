package com.spring.orm;

import java.util.List;
import java.util.Scanner;

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
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {

			System.out.println("\n\n");
			System.out.println("Press 1 for Add new Student");
			System.out.println("Press 2 for Display All Student");
			System.out.println("Press 3 for get detail of one Student");
			System.out.println("Press 4 for Delete Student");
			System.out.println("Press 5 for Update Student");
			System.out.println("Press 6 for Exit");
			Student st = new Student();
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Invalide Choice");
			}
			switch (choice) {
			case 1:

				System.out.println("Enter Student id");
				st.setStudentId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Student Name");
				st.setStudentName(sc.nextLine());

				System.out.println("Enter Student City");
				st.setStudentCity(sc.nextLine());
				try {
					if (stDao.insertData(st) > 0)
						System.out.println("Data Insert Success");
					else
						System.out.println("Data Insert fail");
				} catch (Exception e) {
					System.out.println("Data Insert fail");
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				List<Student> std = stDao.getAllData();
				for (Student std1 : std) {
					System.out.println(std1);
				}
				break;

			case 3:
				System.out.println("Enter Student id");
				st.setStudentId(sc.nextInt());
				System.out.println(stDao.getOneData(st));
				break;

			case 4:
				System.out.println("Enter Student id");
				st.setStudentId(sc.nextInt());
				stDao.deleteData(st);
				System.out.println("Student Deleted");
				break;

			case 5:
				System.out.println("Enter Student id");
				st.setStudentId(sc.nextInt());

				sc.nextLine();

				System.out.println("Enter Student Name");
				st.setStudentName(sc.nextLine());

				System.out.println("Enter Student City");
				st.setStudentCity(sc.nextLine());

				stDao.updateData(st);
				System.out.println("Student Update");
				break;
			case 6:
				flag = false;
				System.out.println("You exit");
				break;

			default:
				System.out.println("Invalide Choice");
				break;
			}
		} while (flag);
		System.out.println("Thank you for using my App");
		sc.close();

	}
}
