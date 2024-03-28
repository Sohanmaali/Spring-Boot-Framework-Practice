package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao stdao = context.getBean("studentDaoImp",StudentDao.class);
        Student st =  new Student();
        st.setId(101);
        st.setName("Ankit");
        st.setCity("Indore");
        int i =  stdao.insert(st);
        System.out.println("Row Efected = "+ i );
    }
}
