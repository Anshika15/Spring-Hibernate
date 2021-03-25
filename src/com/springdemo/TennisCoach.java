package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* @Component("thatSillyCoach") */

//default bean id

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// field injection
	@Autowired
	@Qualifier("randomFortuneService") // randomFortuneService is default naming for RandomFortuneService
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println("Tennis coach:- Inside default constructor");
	}
	
	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis coach:- Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
