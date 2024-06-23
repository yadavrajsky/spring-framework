package com.springcore.javaannoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student=applicationContext.getBean("student",Student.class);
        Student student1=applicationContext.getBean("student",Student.class);
        System.out.println(student);
        System.out.println(student1);
    }
}
