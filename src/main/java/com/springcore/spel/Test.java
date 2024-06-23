package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
        Demo d1=applicationContext.getBean("demo",Demo.class);
        SpelExpressionParser spelParser=new SpelExpressionParser();
        Expression expression=spelParser.parseExpression("11+55");
        System.out.println(d1);
        System.out.println(expression.getValue());
    }
    
}
