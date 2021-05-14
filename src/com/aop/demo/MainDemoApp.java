package com.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.demo.dao.AccountDAO;
import com.aop.demo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// get the membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		Account myAcc = new Account();
		theAccountDAO.addAccount(myAcc, true);
		theAccountDAO.doWork();

		// call the accountdao getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		// call the membership business method
		theMembershipDAO.addSillyAccount();
		theMembershipDAO.goToSleep();

//		// let's try it again!
//		System.out.println("\nLet's call it again");
//
//		// call the business method again
//		theAccountDAO.addAccount();

		// close the context
		context.close();

	}

}
