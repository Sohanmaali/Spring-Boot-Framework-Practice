package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/") // Map this method to handle GET requests for "/Spring-mvc/"
	public String handleRequest() { // Most Important
		// Return the name of the view/template to be rendered

		System.out.println("------------------Mappling method------------------");
		return "index"; // Assuming there's a view named "springMvcView"
	}

	@RequestMapping("/home")
	public String home() {

		System.out.println("------------------Home Page------------------");
		return "index";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("------------------about Page------------------");

		List<String> f = new ArrayList<String>();

		f.add("Sohan");
		f.add("Rohan");
		f.add("Mohan");
		f.add("Kapil");
		f.add("Ankit");
		f.add("Aashis");
		f.add("raj");
		f.add("ranu");

		model.addAttribute("friends", f);
		model.addAttribute("name", "Sohan");
		model.addAttribute("cod", "Coding");
		return "about";
	}

	@RequestMapping("/modelAndView")
	public ModelAndView modelAndView() {
		System.out.println("------------------modelAndView------------------");
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name", "Punna");
		modelAndView.setViewName("modelAndView");
		return modelAndView;

	}

	@RequestMapping("/jspLanguage")
	public String jspLanguage(Model model) {
		System.out.println("------------------jspLanguage------------------");

		model.addAttribute("name", "Sohan");
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		marks.add(60);
		model.addAttribute("marks", marks);
		return "jspLanguage";
	}

}
