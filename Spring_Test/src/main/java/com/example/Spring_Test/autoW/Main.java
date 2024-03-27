package com.example.Spring_Test.autoW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Spring_Test/autoW/config.xml");
        Student st  =(Student) context.getBean("Student");
        System.out.println(st);
    }
}
