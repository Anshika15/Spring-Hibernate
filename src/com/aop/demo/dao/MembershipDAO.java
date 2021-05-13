package com.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addSillyAccount() {
		System.out.println(getClass() + " : Doing Stuff: Adding a membership Account");
	}

}
