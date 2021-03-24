package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class); // myCricketCoach is the id we specified in xml file; 
				
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
