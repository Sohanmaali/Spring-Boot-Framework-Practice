package com.Aop.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

import com.Aop.project.entites.*;
import com.Aop.project.exceptions.InsufficientFundsException;

@Component
@Aspect
@EnableAspectJAutoProxy
public class TransactionAspect {

	@Before("pointcut()")
	public void before(JoinPoint jp) {
		Object[] args = jp.getArgs();
		Account acc = (Account) args[0];
		System.out.println("Before Advice : Initial Balance :" + acc.getBalance());
	}

	@After("pointcut()")
	public void after(JoinPoint jp) {
		Object[] args = jp.getArgs();
		Account acc = (Account) args[0];
		System.out.println("After Advice : Total Balance :" + acc.getBalance());
	}

	@AfterReturning(pointcut = "pointcut()", returning = "result")
	public void afterReturning(JoinPoint jp, String result) {
		System.out.println("After Returning Advice: Transaction Status :" + result);
	}

	@Around("pointcut()")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("Around Advice : Before " + jp.getSignature().getName() + " Method Execution");
		String status = "";
		try {
			status = (String) jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Around Advice : After " + jp.getSignature().getName() + " Method Execution");
		System.out.println("Around Advice : Transaction Status :" + status);
	}

	@AfterThrowing(pointcut = "pointcut()", throwing = "exception")
	public void afterThrowing(JoinPoint jp, InsufficientFundsException exception) {
		System.out.println("After Throwing Advice : " + exception.getClass().getName() + " In Transaction :"
				+ exception.getMessage());
	}

	@Pointcut("execution(* com.Aop.project.serivices.TransactionServiceImpl.*(..))")
	public void pointcut() {
	}
}
