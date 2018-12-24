package com.travis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLife-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        context.close();
    }
}
