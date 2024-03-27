package com.example.Spring_Test.collectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_Test/collectionTest/collection.xml");
//        com/example/Spring_Test/autowired.xml
        Employee emp = (Employee) context.getBean("Employee");
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getCourse());
        System.out.println(emp.getPhone());
    }
}
