package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Sohan Maali");
		model.addAttribute("mobile", "6232389832");
		List<String> f = new ArrayList<String>();
		f.add("Sohan");
		f.add("Rohan");
		f.add("Mohan");
		f.add("Raj");
		f.add("Rani");
		f.add("rama");
		model.addAttribute("f", f);

		System.out.println("this is home url");
		return "index";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "rajesh");
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
