package com.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Aop.services.PaymentServicImp;

/**
 * Hello world!
 *
 */

// MyAspect @Component
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("2");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Aop/config.xml");
		PaymentServicImp py = context.getBean("paymentServicImp", PaymentServicImp.class);
		py.payment(20);
	}
}
