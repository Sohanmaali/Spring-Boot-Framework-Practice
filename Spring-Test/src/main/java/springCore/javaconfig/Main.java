package springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context  =  new AnnotationConfigApplicationContext(config.class);
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
		st.reading();
		
	}

}
