package springCore.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springCore/standalon/collection/config.xml");
		
		Parson st  = context.getBean("parson",Parson.class);
		System.out.println(st.getProp());
		
		System.out.println(st.getFriend().getClass().getName());
		
		System.out.println(st.getCourse().getClass().getName());
	}
}
