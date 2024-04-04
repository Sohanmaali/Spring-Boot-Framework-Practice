package springCore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context  = new ClassPathXmlApplicationContext("springCore/scope/config.xml");
	
	Student st  = context.getBean("student",Student.class);
	System.out.println(st);
	System.out.println(st.hashCode());
	Student st1  = context.getBean("student",Student.class);
	System.out.println(st1.hashCode());
	Student st2  = context.getBean("student",Student.class);
	System.out.println(st2.hashCode());
	
	Parson parson = context.getBean("parson",Parson.class);
	System.out.println(parson);
	System.out.println(parson.hashCode());
	Parson parson1 = context.getBean("parson",Parson.class);
	System.out.println(parson1.hashCode());
	
	}
}
