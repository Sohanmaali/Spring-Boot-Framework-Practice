package com.Aop.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Aop.project.entites.Account;
import com.Aop.project.exceptions.InsufficientFundsException;
import com.Aop.project.serivices.TransactionServiceImpl;

public class Client {

	public static void main(String[] args) {
		System.out.println("start");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
//		Account acc = (Account) context.getBean("accBean");
		TransactionServiceImpl txService = (TransactionServiceImpl) context.getBean("transaction");

		Account acc = new Account("256900", "sohan", "savinfg", 6000);
		try {
			String withdraw = txService.withdraw(acc, 5000);
			System.out.println(withdraw);
		} catch (InsufficientFundsException e) { 
			 e.getMessage();
		}
		System.out.println("end");
	}

}
