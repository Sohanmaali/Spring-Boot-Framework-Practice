package com.example.Spring_Test.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_Test/lifecycle/lifecycle.xml");
//        com/example/Spring_Test/config.xml
        Employee emp = (Employee) context.getBean("Employee");
        System.out.println(emp);
    }
}
