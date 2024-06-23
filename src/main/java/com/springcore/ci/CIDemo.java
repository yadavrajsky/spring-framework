package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIDemo {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
    
}
