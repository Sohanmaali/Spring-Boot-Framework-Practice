package springCore.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/bean/config.xml");

		/*
		 * Employee emp = context.getBean("employee", Employee.class);
		 * 
		 * System.out.println(emp);
		 */

		Student st = context.getBean("student", Student.class);

		System.out.println(st);
		context.registerShutdownHook();

	}
}
