package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor// extends HandlerInterceptorAdapter
{

//	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// This method is called before the controller method is executed.
		// You can perform pre-processing tasks here.
		System.out.println("Pre-handle method is called");
		return true; // Returning true allows the execution chain to proceed, false interrupts the
						// execution.
	}

}
