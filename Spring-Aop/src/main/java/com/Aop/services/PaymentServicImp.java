package com.Aop.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentServicImp implements PaymentService{

	@Override
	public void payment(int i) {
		// TODO Auto-generated method stub
		System.out.println("Payment done");
	}

}
