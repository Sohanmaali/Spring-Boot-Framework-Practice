package springCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/lifecycle/lifecycle.xml");
        
//        com/example/Spring_Test/autowired.xml
//        Employee emp = (Employee) context.getBean("Employee");
//        System.out.println(emp);

        Student st = (Student) context.getBean("student");
        System.out.println(st);
        context.registerShutdownHook();
    }
}
