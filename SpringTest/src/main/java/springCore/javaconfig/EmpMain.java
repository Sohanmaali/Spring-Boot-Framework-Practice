package springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =  new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee emp = 	context.getBean("getEmployee",Employee.class);
		emp.position();
	}

}
