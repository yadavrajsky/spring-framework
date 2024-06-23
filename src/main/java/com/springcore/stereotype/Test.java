package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
        Student student=(Student)applicationContext.getBean("stu");
        System.out.println(student);
    }
}
