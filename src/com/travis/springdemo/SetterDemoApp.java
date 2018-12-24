package com.travis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(((CricketCoach) coach).getEmailAddress());
        System.out.println(((CricketCoach) coach).getTeam());
        context.close();
    }
}
