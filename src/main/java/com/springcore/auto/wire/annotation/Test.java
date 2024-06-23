package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoWireConfig.xml");
        Employee emp1=applicationContext.getBean("emp1",Employee.class);
        System.out.println(emp1);
    }
    
}
