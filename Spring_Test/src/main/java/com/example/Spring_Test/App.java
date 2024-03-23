package com.example.Spring_Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("HELLO I AM SOHAN");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_Test/config.xml");
        Student st  = (Student) context.getBean("Student");
        System.out.println(st);

//        System.out.println("HELLO I AM SOHAN");
    }
}
