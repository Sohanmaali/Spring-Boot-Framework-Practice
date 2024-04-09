package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getMapping() {
		return "index";
	}

	@RequestMapping("/searchFile")
	public String searchFile() {
		return "searchFile";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String query) {
		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {

			redirectView.setUrl("searchFile");
			return redirectView;
		}

		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);
		return redirectView;
	}
}
