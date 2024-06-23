package com.springcore.collections;

import org.springframework.context.ApplicationContext;

public class CollectionsDemo {
    public static void main(String[] args) {
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext(
                "com/springcore/collections/collectionConfig.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getName());
        System.out.println(employee.getPhones());
        System.out.println(employee.getAddresses());
        System.out.println(employee.getCourses());
        

    }
}
