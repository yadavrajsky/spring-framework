package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/LifeCycleConfig.xml");
        // LifeCycle lifeCycle= (LifeCycle) context.getBean("lifeCycle");
        UsingInterface usingInterface= (UsingInterface) context.getBean("lifeCycleUsingInterface");
        // System.out.println(lifeCycle);
        // ((AbstractApplicationContext) context).registerShutdownHook();
        ((AbstractApplicationContext) context).registerShutdownHook();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
