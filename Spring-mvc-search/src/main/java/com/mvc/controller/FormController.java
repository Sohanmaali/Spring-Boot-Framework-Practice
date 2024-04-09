package com.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mvc.model.User;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String registrationForm() {
		return "registration";
	}

	@RequestMapping(path = "/registrationsub", method = RequestMethod.POST)
	public String registrationsub(@ModelAttribute("user") User user, BindingResult result) {

		if (result.hasErrors()) {
			return "registration";
		}
		return "success";
	}

	@RequestMapping("/user")
	public String user() {

		String s = null;
		System.out.println(s.length());

		return "user";
	}

//	For Exception Hendling
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String nullPointerEx() {
//		return "error";
//	}

//	@RequestMapping("/error")
//	public String error() {
//
//		return "error";
//	}
}
