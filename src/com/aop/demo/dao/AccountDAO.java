package com.aop.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aop.demo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	// add a new method : findAccounts()

	public List<Account> findAccounts() {

		List<Account> myAccounts = new ArrayList<>();

		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		Account temp3 = new Account("Luca", "Gold");

		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);

		return myAccounts;
	}

	public void addAccount(Account theAccount, boolean flag) {
		System.out.println(getClass() + ": Doing my db Work: Adding an account");
	}

	public boolean doWork() {
		System.out.println(getClass() + ": Do some work");

		return false;
	}

	public String getName() {
		System.out.println(getClass() + ": in get name");

		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in set name");

		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in get service code");

		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in set service code");

		this.serviceCode = serviceCode;
	}

}
