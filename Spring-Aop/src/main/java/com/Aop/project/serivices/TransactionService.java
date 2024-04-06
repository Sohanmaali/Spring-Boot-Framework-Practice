package com.Aop.project.serivices;

import com.Aop.project.entites.Account;
import com.Aop.project.exceptions.InsufficientFundsException;

public interface TransactionService {
	public String withdraw(Account acc, int wd_Amt) throws InsufficientFundsException;
}
