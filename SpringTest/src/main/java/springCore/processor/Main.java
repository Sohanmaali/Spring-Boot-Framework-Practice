package springCore.processor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/processor/config.xml");
		Customer cust = (Customer) context.getBean("cust");
		System.out.println(cust);
		context.registerShutdownHook();
	}
}
