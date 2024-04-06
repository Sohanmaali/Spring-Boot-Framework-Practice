package com.Aop.xml;

import org.aspectj.lang.JoinPoint;

public class MyAspect {

	public void myadvice(JoinPoint jp)// it is advice
	{
		System.out.println("My Advice");
		// System.out.println("Method Signature: " + jp.getSignature());
	}

	public void youradvice(JoinPoint jp)// it is advice
	{
		System.out.println("Your Advice");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
	public void returing(JoinPoint jp )// it is advice
	{
		System.out.println("Your Advice returing");
		System.out.println("Your Advice returing");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
}
