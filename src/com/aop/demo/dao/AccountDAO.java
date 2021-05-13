package com.aop.demo.dao;

import org.springframework.stereotype.Component;

import com.aop.demo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean flag) {
		System.out.println(getClass() + ": Doing my db Work: Adding an account");
	}

}
