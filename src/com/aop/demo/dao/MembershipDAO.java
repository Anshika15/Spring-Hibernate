package com.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addSillyAccount() {
		System.out.println(getClass() + " : Doing Stuff: Adding a membership Account");
		return true;
	}

}
