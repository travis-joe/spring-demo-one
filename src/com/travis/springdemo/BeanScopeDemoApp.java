package com.travis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean isSame = (theCoach == alphaCoach);
        System.out.println(isSame);
        System.out.println(theCoach.toString());
        System.out.println(alphaCoach.toString());
        context.close();
    }
}
