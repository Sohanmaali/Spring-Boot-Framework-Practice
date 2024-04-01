package springCore.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/container/lifecycle.xml");

		Student st = context.getBean("student", Student.class);
		Student st1 = context.getBean("student", Student.class);
		Student st2 = context.getBean("student", Student.class);
		Student st3 = context.getBean("student", Student.class);
		Student st4 = context.getBean("st", Student.class);
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
	}
}
