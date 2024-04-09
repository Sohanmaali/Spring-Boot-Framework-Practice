package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("------------one------------");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("------------Two------------");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("registration");
		return redirectView;
	}
}
