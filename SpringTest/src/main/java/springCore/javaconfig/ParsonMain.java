package springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ParsonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ParsonConfig.class);
		Parson p  = context.getBean("parson",Parson.class);
		System.out.println(p);
		p.work();
	}

}
