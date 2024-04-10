package com.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.dao.ProductDao;
import com.mvc.entites.Product;

@Controller
public class HomeController {

	@Autowired
	private ProductDao productDao;

	@GetMapping("/")
	public String getMapping(Model m) {
		List<Product> product = this.productDao.getProducts();
		m.addAttribute("products", product);
		return "index";
	}

	@RequestMapping("/addProduct")
	public String addProduct() {

		return "addProduct";
	}

	@RequestMapping(path = "/addproductsub", method = RequestMethod.POST)
	public String addproductsub(@ModelAttribute Product product, Model m) {
		System.out.println(product);

		this.productDao.addProduct(product);

		List<Product> products = this.productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("/");
//		return "redirectView";
	}

	@RequestMapping("/deleteProduct/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id, HttpServletRequest request) {
		this.productDao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
