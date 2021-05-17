package com.aop.demo;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.aop.demo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",
				TrafficFortuneService.class);

		System.out.println("\nMain Program: AroundDemoApp");

		System.out.println("Calling get Fortune");

		String data = theFortuneService.getFortune();

		System.out.println("\nMy Fortune is: " + data);

		System.out.println("Finished");

		// close the context
		context.close();
	}

}
