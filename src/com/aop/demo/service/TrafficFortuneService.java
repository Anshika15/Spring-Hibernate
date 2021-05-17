package com.aop.demo.service;

import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		// simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// return a fortune
		return "Expect heavy traffic this morning";
	}

	public String getFortune(boolean tripWire) {

		if (tripWire) {
			throw new RuntimeException("Major accident! Highway is closed.");
		}
		return getFortune();
	}
}
