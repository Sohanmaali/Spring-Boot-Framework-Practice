package com.Aop.aspect;

import org.aspectj.lang.annotation.After;
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
		System.out.println("beckUp run");
	}
	@After("pointcut()")
	public void sleep() {
		System.out.println("speep run");
	}
	
	@Pointcut("execution(* studay())")
	public void pointcut() {
		
	}
}
