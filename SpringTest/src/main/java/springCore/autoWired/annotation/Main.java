package springCore.autoWired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/autoWired/annotation/config.xml");
		
		Student st = context.getBean("student",Student.class);
		System.out.println(st);
	}
}
