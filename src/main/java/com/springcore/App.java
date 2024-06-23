package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.lifecycle.LifeCycleDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentAddress());
    }

    public static ApplicationContext getApplicationContext(Class<LifeCycleDemo> class1, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getApplicationContext'");
    }
}
