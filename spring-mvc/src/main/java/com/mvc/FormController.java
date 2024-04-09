package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.model.User;

@Controller
public class FormController {

	@RequestMapping("/registration")
	public String registrationForm() {
		return "registration";
	}

	@RequestMapping(path = "/registrationData", method = RequestMethod.POST)
	public String registration(@ModelAttribute User user, Model model) {

		return "success";
	}
	/*
	 * @RequestMapping(path = "/registrationData", method = RequestMethod.POST)
	 * public String registration(
	 * 
	 * @RequestParam("username") String userName,
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("password") String userPassword,Model model) {
	 * 
	 * model.addAttribute("username",userName);
	 * model.addAttribute("useremail",userEmail);
	 * model.addAttribute("userpassword",userPassword); return "success"; }
	 */
}
