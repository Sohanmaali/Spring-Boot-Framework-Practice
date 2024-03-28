package springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/spel/config.xml");
		
		Demo d = context.getBean("demo",Demo.class);
		
		System.out.println(d);
	}

}
