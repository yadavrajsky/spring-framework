package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
        Student student1=(Student)applicationContext.getBean("stu");
        Student student2=(Student)applicationContext.getBean("stu");
        Student student3=(Student)applicationContext.getBean("stu1");
        Student student4=(Student)applicationContext.getBean("stu1");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        // System.out.println(student4);
    }
}
