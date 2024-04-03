package com.Aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class MyAspect {

//	@Before("execution(* com.Aop.services.payment())")
	@Before("execution(* com.Aop.services.payment.*(..))")
	public void allMethods() {
		// Aspect body
		System.out.println("user Authontication");
	}
}