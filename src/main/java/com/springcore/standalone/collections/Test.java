package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standAloneConfig.xml");
        Person person=(Person)applicationContext.getBean("person1");
        System.out.println(person);
    }
}
 