package com.Aop.project.serivices;

import org.springframework.stereotype.Component;

import com.Aop.project.entites.Account;
import com.Aop.project.exceptions.*;

@Component("transaction")
public class TransactionServiceImpl {

	public String withdraw(Account acc, int wd_Amt) throws InsufficientFundsException {
		String status = "";
		if (acc.getBalance() > wd_Amt) {
			int total_Bal = acc.getBalance() - wd_Amt;
			acc.setBalance(total_Bal);
			System.out.println("From withdraw(): Transaction Withdraw Completed ");
			status = "SUCCESS";
		} else {
			status = "FAILURE";
			throw new InsufficientFundsException("Funds are not Sufficient in Account");
		}
		return status;

	}

}
