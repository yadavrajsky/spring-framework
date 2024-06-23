package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefDemo {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
        ClassA temp= (ClassA) context.getBean("aref");
        System.out.println(temp);
        System.out.println(temp.getX());
        System.out.println(temp.getObjB());
        System.out.println(temp.getObjB().getY());
    }
}
