package com.springcore.javaannoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaannoconfig")
public class JavaConfig {
    @Bean(name={"student","student1"})
     public Student getStudent()
     {
        Student student=new Student();
        return  student;
     }
}
