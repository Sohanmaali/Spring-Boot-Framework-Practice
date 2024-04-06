package com.Aop.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

	@Before("pointcut()")
	public void beckUp() {
		System.out.println("beckup run");
	}

	@After("pointcut()")
	public void sleep() {
		System.out.println("speep run");
	}

	@Pointcut("execution(* studay())")
	public void pointcut() {
		System.out.println("Point cut run");
	}

	@AfterReturning("execution(* studay())")
	public void afterReturn() {
		System.out.println("After Returning");
	}

//	@Around("execution(* studay())")
	public void around() {
		System.out.println("Around");
	}
//	@AfterReturning
	public void afterReturing() {
		System.out.println("afterReturing");
	}
}
